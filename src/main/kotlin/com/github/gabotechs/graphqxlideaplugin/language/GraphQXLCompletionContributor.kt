package com.github.gabotechs.graphqxlideaplugin.language

import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLFile
import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypes
import com.intellij.codeInsight.completion.*
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.patterns.PsiElementPattern
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.util.ProcessingContext

class GraphQXLCompletionContributor : CompletionContributor() {
    init {
        completeTopLevelKeywords()
    }

    private fun completeTopLevelKeywords() {
        val provider: CompletionProvider<CompletionParameters> = object : CompletionProvider<CompletionParameters>() {
            override fun addCompletions(
                parameters: CompletionParameters,
                context: ProcessingContext,
                result: CompletionResultSet
            ) {
                val document = parameters.editor.document
                val line = document.getLineNumber(parameters.offset)
                val prevVisibleLeaf = PsiTreeUtil.prevVisibleLeaf(parameters.position)
                if (prevVisibleLeaf != null && line == document.getLineNumber(prevVisibleLeaf.textRange.startOffset)) {
                    return
                }
                for (keyword in TOP_LEVEL_KEYWORDS) {
                    result.addElement(GraphQXLCompletionUtil.createKeywordLookupElement(keyword))
                }
            }
        }
        extend(CompletionType.BASIC, TOP_LEVEL_KEYWORD_PATTERN, provider)
    }


    companion object {
        private val TOP_LEVEL_KEYWORD_PATTERN: PsiElementPattern.Capture<PsiElement> =
            psiElement(GraphQXLTypes.NAME).withSuperParent(
                2,
                GraphQXLFile::class.java
            )
        private val TOP_LEVEL_KEYWORDS = arrayOf(
            GraphQXLCompletionKeyword.QUERY,
            GraphQXLCompletionKeyword.SUBSCRIPTION,
            GraphQXLCompletionKeyword.MUTATION,
            GraphQXLCompletionKeyword.EXTEND,
            GraphQXLCompletionKeyword.SCHEMA,
            GraphQXLCompletionKeyword.SCALAR,
            GraphQXLCompletionKeyword.TYPE,
            GraphQXLCompletionKeyword.INTERFACE,
            GraphQXLCompletionKeyword.INPUT,
            GraphQXLCompletionKeyword.ENUM,
            GraphQXLCompletionKeyword.UNION,
            GraphQXLCompletionKeyword.DIRECTIVE,
        )
    }
}
