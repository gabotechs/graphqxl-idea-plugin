package com.github.gabotechs.graphqxlideaplugin.language.psi

import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypes.*
import com.intellij.psi.tree.TokenSet

class GraphQXLExtendedElementTypes {

    companion object {
        val KEYWORDS = TokenSet.create(
            IMPORT_KEYWORD,
            QUERY_KEYWORD,
            MUTATION_KEYWORD,
            SUBSCRIPTION_KEYWORD,
            ON_KEYWORD,
            SCHEMA_KEYWORD,
            TYPE_KEYWORD,
            SCALAR_KEYWORD,
            INTERFACE_KEYWORD,
            IMPLEMENTS_KEYWORD,
            ENUM_KEYWORD,
            UNION_KEYWORD,
            INPUT_KEYWORD,
            DIRECTIVE_KEYWORD,
            REPEATABLE_KEYWORD
        )

        val SINGLE_QUOTES = TokenSet.create(OPEN_QUOTE, CLOSING_QUOTE)
        val TRIPLE_QUOTES = TokenSet.create(OPEN_TRIPLE_QUOTE, CLOSING_TRIPLE_QUOTE)
        val QUOTES = TokenSet.orSet(SINGLE_QUOTES, TRIPLE_QUOTES)
        val STRING_TOKENS = TokenSet.orSet(QUOTES, TokenSet.create(REGULAR_STRING_PART))

        val NUMBER_LITERALS = TokenSet.create(NUMBER, FLOAT)
    }
}