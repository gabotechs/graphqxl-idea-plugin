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

public class GraphQXLDescriptionVariableImpl extends GraphQXLElementImpl implements GraphQXLDescriptionVariable {

  public GraphQXLDescriptionVariableImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitDescriptionVariable(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphQXLVisitorBase) accept((GraphQXLVisitorBase)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraphQXLStringData getStringData() {
    return findChildByClass(GraphQXLStringData.class);
  }

  @Override
  @NotNull
  public GraphQXLIdentifier getNameIdentifier() {
    return findNotNullChildByClass(GraphQXLIdentifier.class);
  }

}
