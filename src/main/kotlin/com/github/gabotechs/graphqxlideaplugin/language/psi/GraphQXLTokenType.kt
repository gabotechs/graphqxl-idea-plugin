package com.github.gabotechs.graphqxlideaplugin.language.psi

import com.github.gabotechs.graphqxlideaplugin.language.GraphQXLLanguage
import com.intellij.psi.tree.IElementType

class GraphQXLTokenType(debugName: String) : IElementType(debugName, GraphQXLLanguage.instance) {

    override fun toString(): String {
        return "GraphQXLTokenType." + super.toString()
    }
}