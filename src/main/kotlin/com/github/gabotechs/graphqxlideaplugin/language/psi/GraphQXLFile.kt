package com.github.gabotechs.graphqxlideaplugin.language.psi

import com.github.gabotechs.graphqxlideaplugin.language.GraphQXLFileType
import com.github.gabotechs.graphqxlideaplugin.language.GraphQXLLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class GraphQXLFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, GraphQXLLanguage.instance) {
    override fun getFileType(): FileType {
        return GraphQXLFileType.instance
    }

    override fun toString(): String {
        return "GraphQXL File"
    }
}