package com.github.gabotechs.graphqxlideaplugin.language

import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypes
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType

class GraphQXLBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> {
        return arrayOf(
            BracePair(GraphQXLTypes.PAREN_L, GraphQXLTypes.PAREN_R, true),
            BracePair(GraphQXLTypes.BRACKET_L, GraphQXLTypes.BRACKET_R, true),
            BracePair(GraphQXLTypes.BRACE_L, GraphQXLTypes.BRACE_R, true)
        )
    }

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean {
        return true
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int {
        return openingBraceOffset
    }
}