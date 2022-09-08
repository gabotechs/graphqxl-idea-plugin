package com.github.gabotechs.graphqxlideaplugin.language

import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLExtendedElementTypes
import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import com.intellij.openapi.editor.highlighter.HighlighterIterator

class GraphQXLQuoteHandler : SimpleTokenSetQuoteHandler(GraphQXLExtendedElementTypes.SINGLE_QUOTES) {
    override fun isOpeningQuote(iterator: HighlighterIterator?, offset: Int): Boolean {
        return iterator?.tokenType == GraphQXLTypes.OPEN_QUOTE
    }

    override fun isClosingQuote(iterator: HighlighterIterator?, offset: Int): Boolean {
        return iterator?.tokenType == GraphQXLTypes.CLOSING_QUOTE
    }
}