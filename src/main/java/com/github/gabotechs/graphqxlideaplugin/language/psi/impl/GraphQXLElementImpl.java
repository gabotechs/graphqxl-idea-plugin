package com.github.gabotechs.graphqxlideaplugin.language.psi.impl;

import com.github.gabotechs.graphqxlideaplugin.language.GraphQXLPsiUtil;
import com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLElement;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public abstract class GraphQXLElementImpl extends ASTWrapperPsiElement implements GraphQXLElement {
    public GraphQXLElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public @NotNull PsiElement getNavigationElement() {
        return GraphQXLPsiUtil.Companion.skipDescription(this);
    }

}
