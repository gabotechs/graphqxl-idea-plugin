package com.github.gabotechs.graphqxlideaplugin.language.psi

import com.github.gabotechs.graphqxlideaplugin.language.GraphQXLLanguage
import com.intellij.psi.tree.IElementType

class GraphQXLElementType(debugName: String) : IElementType(debugName, GraphQXLLanguage.instance)