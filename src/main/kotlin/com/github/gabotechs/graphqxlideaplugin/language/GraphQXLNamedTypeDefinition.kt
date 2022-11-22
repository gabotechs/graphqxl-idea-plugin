package com.github.gabotechs.graphqxlideaplugin.language

import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLDef
import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLIdentifier

interface GraphQXLNamedTypeDefinition : GraphQXLDef {
    val identifier: GraphQXLIdentifier?
}
