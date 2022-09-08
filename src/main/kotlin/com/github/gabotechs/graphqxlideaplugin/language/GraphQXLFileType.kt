package com.github.gabotechs.graphqxlideaplugin.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class GraphQXLFileType : LanguageFileType(GraphQXLLanguage.instance) {
    companion object {
        val instance = GraphQXLFileType()
    }

    override fun getName(): String {
        return "GraphQXL"
    }

    override fun getDescription(): String {
        return "GraphQXL file"
    }

    override fun getDefaultExtension(): String {
        return "graphqxl"
    }

    override fun getIcon(): Icon {
        return GraphQXLIcon.file
    }
}