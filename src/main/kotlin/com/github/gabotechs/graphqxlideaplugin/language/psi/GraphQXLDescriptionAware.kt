package com.github.gabotechs.graphqxlideaplugin.language.psi

interface GraphQXLDescriptionAware : GraphQXLElement {
    fun getDescription(): GraphQXLDescription?
}