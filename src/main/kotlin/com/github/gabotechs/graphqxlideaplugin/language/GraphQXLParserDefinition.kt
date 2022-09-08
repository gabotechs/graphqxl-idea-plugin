package com.github.gabotechs.graphqxlideaplugin.language

import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLFile
import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class GraphQXLParserDefinition : ParserDefinition {
    companion object {
        val comments = TokenSet.create(GraphQXLTypes.EOL_COMMENT)
        val file = IFileElementType(GraphQXLLanguage.instance)
    }

    override fun createLexer(project: Project?): Lexer {
        return GraphQXLLexerAdapter()
    }

    override fun createParser(project: Project?): PsiParser {
        return GraphQXLParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return file
    }

    override fun getCommentTokens(): TokenSet {
        return comments
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return GraphQXLTypes.Factory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return GraphQXLFile(viewProvider)
    }
}