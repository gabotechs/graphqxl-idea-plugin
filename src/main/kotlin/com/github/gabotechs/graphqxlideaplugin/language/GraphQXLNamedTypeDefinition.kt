package com.github.gabotechs.graphqxlideaplugin.language

import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypeDefinition
import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypeNameDefinition

interface GraphQXLNamedTypeDefinition : GraphQXLTypeDefinition {
    val typeNameDefinition: GraphQXLTypeNameDefinition?
}
