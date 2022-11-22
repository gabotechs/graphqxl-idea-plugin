package com.github.gabotechs.graphqxlideaplugin.language

import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLDescriptionAware
import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLIdentifier
import com.intellij.injected.editor.VirtualFileWindow
import com.intellij.openapi.util.Ref
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.testFramework.LightVirtualFile
import com.intellij.util.SmartList

class GraphQXLPsiUtil {
    companion object {
        fun getTypeName(psiElement: PsiElement?, typeNameRef: Ref<GraphQXLIdentifier?>?): String? {
            if (psiElement == null) return null
            val typeOwner = PsiTreeUtil.getParentOfType(
                psiElement,
                GraphQXLNamedTypeDefinition::class.java,
            )
            val nameIdentifier = typeOwner?.identifier ?: return null
            typeNameRef?.set(nameIdentifier)
            return nameIdentifier.text
        }

        fun getOriginalVirtualFile(containingFile: PsiFile?): VirtualFile? {
            if (containingFile == null || !containingFile.isValid) return null
            var file = containingFile.virtualFile
            if (file == null) {
                val originalFile = containingFile.originalFile
                if (originalFile !== containingFile && originalFile.isValid) {
                    file = originalFile.virtualFile
                }
            }
            return file
        }

        fun getPhysicalVirtualFile(virtualFileOptional: VirtualFile?): VirtualFile? {
            var virtualFile = virtualFileOptional ?: return null
            if (virtualFile is LightVirtualFile) {
                val originalFile = virtualFile.originalFile
                if (originalFile != null) {
                    virtualFile = originalFile
                }
            }
            if (virtualFile is VirtualFileWindow) {
                // injected virtual files
                virtualFile = (virtualFile as VirtualFileWindow).delegate
            }
            return virtualFile
        }

        fun getPhysicalVirtualFile(psiFile: PsiFile?): VirtualFile? {
            return if (psiFile == null) null else getPhysicalVirtualFile(getOriginalVirtualFile(psiFile))
        }

        fun getFileName(psiFile: PsiFile): String {
            val virtualFile = getPhysicalVirtualFile(psiFile)
            return virtualFile?.path ?: psiFile.name
            // is needed for some manually created in-memory PSI files
        }

        fun getLeadingFileComments(file: PsiFile): List<PsiComment> {
            val comments: MutableList<PsiComment> = SmartList()
            var child = file.firstChild
            if (child is PsiWhiteSpace) {
                child = PsiTreeUtil.skipWhitespacesForward(child)
            }
            while (child is PsiComment) {
                comments.add(child)
                child = PsiTreeUtil.skipWhitespacesForward(child)
            }
            return comments
        }

        fun skipDescription(element: PsiElement): PsiElement {
            if (element is GraphQXLDescriptionAware) {
                val description = element.getDescription()
                if (description != null) {
                    val target = PsiTreeUtil.skipWhitespacesForward(description)
                    if (target != null) {
                        return target
                    }
                }
            }
            return element
        }
    }
}