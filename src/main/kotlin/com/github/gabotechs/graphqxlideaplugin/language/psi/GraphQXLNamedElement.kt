package com.github.gabotechs.graphqxlideaplugin.language.psi

import com.intellij.psi.PsiNameIdentifierOwner

interface GraphQXLNamedElement : PsiNameIdentifierOwner, GraphQXLElement {
    override fun getNameIdentifier(): GraphQXLIdentifier?
}