package com.github.gabotechs.graphqxlideaplugin.language

import GraphQXLLexer
import com.intellij.lexer.FlexAdapter

class GraphQXLLexerAdapter : FlexAdapter(GraphQXLLexer(null))