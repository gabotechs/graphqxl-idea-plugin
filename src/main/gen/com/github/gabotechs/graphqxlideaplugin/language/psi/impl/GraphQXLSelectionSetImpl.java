// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypes.*;
import com.github.gabotechs.graphqxlideaplugin.language.psi.*;

public class GraphQXLSelectionSetImpl extends GraphQXLElementImpl implements GraphQXLSelectionSet {

  public GraphQXLSelectionSetImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitSelectionSet(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphQXLVisitorBase) accept((GraphQXLVisitorBase)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GraphQXLSelection> getSelectionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQXLSelection.class);
  }

}
