package com.github.gabotechs.graphqxlideaplugin.language

import com.intellij.codeInsight.editorActions.enter.EnterBetweenBracesDelegate

class GraphQXLEnterBetweenBracesHandler : EnterBetweenBracesDelegate() {
    override fun isBracePair(c1: Char, c2: Char): Boolean {
        return super.isBracePair(c1, c2) || c1 == '[' && c2 == ']'
    }
}