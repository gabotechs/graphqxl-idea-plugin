package com.github.gabotechs.graphqxlideaplugin.language

import com.intellij.codeInsight.completion.AddSpaceInsertHandler
import com.intellij.codeInsight.completion.InsertHandler
import com.intellij.codeInsight.completion.PrioritizedLookupElement
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder

class GraphQXLCompletionUtil {
    companion object {
        private const val DEFAULT_SYMBOL_PRIORITY = 5

        private const val KEYWORD_PRIORITY = DEFAULT_SYMBOL_PRIORITY

        fun createKeywordLookupElement(keyword: GraphQXLCompletionKeyword): LookupElement {
            return createKeywordLookupElement(
                keyword.text,
                KEYWORD_PRIORITY,
                AddSpaceInsertHandler.INSTANCE_WITH_AUTO_POPUP
            )
        }

        private fun createKeywordLookupElement(
            text: String,
            priority: Int,
            insertHandler: InsertHandler<LookupElement>?
        ): LookupElement {
            val element = LookupElementBuilder.create(text).bold().withInsertHandler(insertHandler)
            return PrioritizedLookupElement.withPriority(element, priority.toDouble())
        }
    }
}