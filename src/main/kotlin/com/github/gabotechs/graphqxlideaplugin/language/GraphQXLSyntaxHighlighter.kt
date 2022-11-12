package com.github.gabotechs.graphqxlideaplugin.language

import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLExtendedElementTypes
import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypes
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class GraphQXLSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): GraphQXLLexerAdapter {
        return GraphQXLLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<out TextAttributesKey?> {
        return if (tokenType == GraphQXLTypes.NAME) {
            IDENTIFIER_KEYS
        } else if (GraphQXLExtendedElementTypes.KEYWORDS.contains(tokenType)) {
            KEYWORD_KEYS
        } else if (GraphQXLExtendedElementTypes.NUMBER_LITERALS.contains(tokenType)) {
            NUMBER_KEYS
        } else if (GraphQXLExtendedElementTypes.STRING_TOKENS.contains(tokenType)) {
            STRING_KEYS
        } else if (tokenType == GraphQXLTypes.EOL_COMMENT) {
            COMMENT_KEYS
        } else if (tokenType == GraphQXLTypes.BRACE_L || tokenType == GraphQXLTypes.BRACE_R) {
            BRACES_KEYS
        } else if (tokenType == GraphQXLTypes.PAREN_L || tokenType == GraphQXLTypes.PAREN_R) {
            PARENTHESES_KEYS
        } else if (tokenType == GraphQXLTypes.BRACKET_L || tokenType == GraphQXLTypes.BRACKET_R) {
            BRACKETS_KEYS
        } else if (tokenType == GraphQXLTypes.SPREAD) {
            SPREAD_KEYS
        } else if (tokenType == GraphQXLTypes.COLON) {
            COLON_KEYS
        } else if (tokenType == GraphQXLTypes.BANG) {
            BANG_KEYS
        } else if (tokenType == GraphQXLTypes.PIPE) {
            PIPE_KEYS
        } else if (tokenType == GraphQXLTypes.AMP) {
            AMP_KEYS
        } else if (tokenType == TokenType.BAD_CHARACTER) {
            BAD_CHARACTER_KEYS
        } else if (tokenType == GraphQXLTypes.OPTIONAL_MODIFIER) {
            MODIFIER_KEYS
        } else if (tokenType == GraphQXLTypes.REQUIRED_MODIFIER) {
            MODIFIER_KEYS
        } else {
            EMPTY_KEYS
        }
    }

    companion object {
        val IDENTIFIER = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_IDENTIFIER",
            DefaultLanguageHighlighterColors.IDENTIFIER
        )
        val MODIFIER = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_MODIFIER",
            DefaultLanguageHighlighterColors.KEYWORD
        )
        val KEYWORD = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_KEYWORD",
            DefaultLanguageHighlighterColors.KEYWORD
        )
        val NUMBER = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_NUMBER",
            DefaultLanguageHighlighterColors.NUMBER
        )
        val STRING = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_STRING",
            DefaultLanguageHighlighterColors.STRING
        )
        val COMMENT = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
        )
        val BRACES = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_BRACES",
            DefaultLanguageHighlighterColors.BRACES
        )
        val PARENTHESES = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_PARENTHESES",
            DefaultLanguageHighlighterColors.PARENTHESES
        )
        val BRACKETS = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_BRACKETS",
            DefaultLanguageHighlighterColors.BRACKETS
        )
        val SPREAD = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_SPREAD",
            DefaultLanguageHighlighterColors.SEMICOLON
        )
        val COLON = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_COLON",
            DefaultLanguageHighlighterColors.SEMICOLON
        )
        val BANG = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_BANG",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
        val PIPE = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_PIPE",
            DefaultLanguageHighlighterColors.SEMICOLON
        )
        val AMP = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_AMP",
            DefaultLanguageHighlighterColors.SEMICOLON
        )
        val BAD_CHARACTER = TextAttributesKey.createTextAttributesKey(
            "GraphQXL_BAD_CHARACTER",
            HighlighterColors.BAD_CHARACTER
        )
        private val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
        private val MODIFIER_KEYS = arrayOf(MODIFIER)
        private val KEYWORD_KEYS = arrayOf(KEYWORD)
        private val NUMBER_KEYS = arrayOf(NUMBER)
        private val STRING_KEYS = arrayOf(STRING)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val BRACES_KEYS = arrayOf(BRACES)
        private val PARENTHESES_KEYS = arrayOf(PARENTHESES)
        private val BRACKETS_KEYS = arrayOf(BRACKETS)
        private val SPREAD_KEYS = arrayOf(SPREAD)
        private val COLON_KEYS = arrayOf(COLON)
        private val BANG_KEYS = arrayOf(BANG)
        private val PIPE_KEYS = arrayOf(PIPE)
        private val AMP_KEYS = arrayOf(AMP)
        private val BAD_CHARACTER_KEYS = arrayOf(BAD_CHARACTER)
        private val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)
    }
}