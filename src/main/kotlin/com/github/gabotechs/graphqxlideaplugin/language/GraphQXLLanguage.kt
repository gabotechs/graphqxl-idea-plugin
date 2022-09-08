package com.github.gabotechs.graphqxlideaplugin.language

import com.intellij.lang.Language

class GraphQXLLanguage : Language("GraphQXL") {
    companion object {
        var instance = GraphQXLLanguage()
    }
}