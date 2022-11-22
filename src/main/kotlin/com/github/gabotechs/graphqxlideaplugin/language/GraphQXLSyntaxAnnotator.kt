package com.github.gabotechs.graphqxlideaplugin.language

import com.github.gabotechs.graphqxlideaplugin.language.psi.*
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.lang.ASTNode
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.markup.TextAttributes
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.TreeUtil
import com.intellij.psi.util.PsiUtilCore

class GraphQXLSyntaxAnnotator : Annotator {

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        element.accept(GraphQXLSyntaxAnnotatorVisitor(holder))
    }

    companion object {
        val FIELD_NAME = TextAttributesKey.createTextAttributesKey(
            "GRAPHQXL_FIELD_NAME",
            DefaultLanguageHighlighterColors.INSTANCE_FIELD
        )
        val ARGUMENT = TextAttributesKey.createTextAttributesKey(
            "GRAPHQXL_ARGUMENT",
            DefaultLanguageHighlighterColors.PARAMETER
        )
        val TYPE_NAME = TextAttributesKey.createTextAttributesKey(
            "GRAPHQXL_TYPE_NAME",
            DefaultLanguageHighlighterColors.CLASS_NAME
        )
        val DIRECTIVE = TextAttributesKey.createTextAttributesKey(
            "GRAPHQXL_DIRECTIVE",
            DefaultLanguageHighlighterColors.METADATA
        )
        val MODIFIER = TextAttributesKey.createTextAttributesKey(
            "GRAPHQXL_MODIFIER",
            DefaultLanguageHighlighterColors.STATIC_METHOD
        )
        val COMMENT = TextAttributesKey.createTextAttributesKey(
            "GRAPHQXL_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
        )

        class GraphQXLSyntaxAnnotatorVisitor(private val myHolder: AnnotationHolder) :
            GraphQXLVisitorBase() {

            override fun visitOptionalModifier(o: GraphQXLOptionalModifier) {
                applyTextAttributes(o.originalElement, MODIFIER)
            }

            override fun visitRequiredModifier(o: GraphQXLRequiredModifier) {
                applyTextAttributes(o.originalElement, MODIFIER)
            }

            override fun visitFieldWithoutArgsWithoutValue(o: GraphQXLFieldWithoutArgsWithoutValue) {
                applyTextAttributes(o.nameIdentifier, FIELD_NAME)
            }

            override fun visitFieldWithoutArgs(o: GraphQXLFieldWithoutArgs) {
                applyTextAttributes(o.nameIdentifier, FIELD_NAME)
            }

            override fun visitFieldWithArgs(o: GraphQXLFieldWithArgs) {
                applyTextAttributes(o.nameIdentifier, FIELD_NAME)
            }

            override fun visitDescriptionVariable(o: GraphQXLDescriptionVariable) {
                applyTextAttributes(o.nameIdentifier, COMMENT)
            }

            override fun visitArgument(argument: GraphQXLArgument) {
                val identifier: GraphQXLIdentifier = argument.nameIdentifier
                resetKeywordAttributes(identifier)
                applyTextAttributes(identifier, ARGUMENT)
            }

            override fun visitDirectiveLocation(location: GraphQXLDirectiveLocation) {
                applyTextAttributes(location, TYPE_NAME)
            }

            override fun visitDirective(directive: GraphQXLDirective) {
                highlightDirectiveName(directive, directive.nameIdentifier)
            }

            private fun highlightDirectiveName(element: GraphQXLElement, identifier: GraphQXLIdentifier?) {
                if (identifier == null) {
                    return
                }
                var textRange = identifier.textRange
                val prevSibling = identifier.prevSibling
                if (PsiUtilCore.getElementType(prevSibling) === GraphQXLTypes.AT) {
                    val prevTextRange = prevSibling.textRange
                    textRange = textRange.union(prevTextRange)
                }
                applyTextAttributes(element, DIRECTIVE, textRange)
            }

            private fun applyTextAttributes(element: PsiElement?, attributes: TextAttributesKey) {
                if (element == null) return
                applyTextAttributes(element, attributes, element.textRange)
            }

            private fun applyTextAttributes(element: PsiElement?, attributes: TextAttributesKey, range: TextRange) {
                if (element == null) return
                val builder = if (ApplicationManager.getApplication().isUnitTestMode) myHolder.newAnnotation(
                    HighlightInfoType.SYMBOL_TYPE_SEVERITY,
                    attributes.externalName
                ) else myHolder.newSilentAnnotation(HighlightInfoType.SYMBOL_TYPE_SEVERITY)
                builder.range(range).textAttributes(attributes).create()
            }

            private fun resetKeywordAttributes(element: PsiElement?) {
                if (element == null) return
                var node: ASTNode? = element.node ?: return
                node = TreeUtil.findFirstLeaf(node)
                val elementType = PsiUtilCore.getElementType(node)
                if (!GraphQXLExtendedElementTypes.KEYWORDS.contains(elementType)) return
                myHolder
                    .newSilentAnnotation(HighlightInfoType.SYMBOL_TYPE_SEVERITY)
                    .range(element.textRange)
                    .enforcedTextAttributes(TextAttributes.ERASE_MARKER)
                    .create()
            }
        }
    }
}