package com.github.gabotechs.graphqxlideaplugin.language.psi.impl;

import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLIdentifier;
import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLNamedElement;
import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypes;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.SourceTreeToPsiMap;
import com.intellij.psi.impl.source.tree.Factory;
import com.intellij.psi.impl.source.tree.LeafElement;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;

public abstract class GraphQXLNamedElementImpl extends GraphQXLElementImpl implements GraphQXLNamedElement {
    public GraphQXLNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String getName() {
        PsiElement identifier = getNameIdentifier();
        if (identifier == null) return null;

        ASTNode identifierNode = identifier.getNode();
        if (identifierNode == null) return null;

        return identifierNode.getText();
    }

    @Override
    public PsiElement setName(@NotNull String newName) throws IncorrectOperationException {
        final GraphQXLIdentifier nameIdentifier = getNameIdentifier();
        if (nameIdentifier != null) {
            final LeafElement renamedLeaf = Factory.createSingleLeafElement(GraphQXLTypes.NAME, newName, null, nameIdentifier.getManager());
            final PsiElement renamedPsiElement = SourceTreeToPsiMap.treeElementToPsi(renamedLeaf);
            if (renamedPsiElement != null) {
                nameIdentifier.getFirstChild().replace(renamedPsiElement);
            }
        }
        return this;
    }
}
