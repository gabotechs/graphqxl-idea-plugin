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

public class GraphQXLDirectiveDefImpl extends GraphQXLElementImpl implements GraphQXLDirectiveDef {

  public GraphQXLDirectiveDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitDirectiveDef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphQXLVisitorBase) accept((GraphQXLVisitorBase)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraphQXLArguments getArguments() {
    return findChildByClass(GraphQXLArguments.class);
  }

  @Override
  @Nullable
  public GraphQXLDescription getDescription() {
    return findChildByClass(GraphQXLDescription.class);
  }

  @Override
  @NotNull
  public List<GraphQXLDirectiveLocation> getDirectiveLocationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQXLDirectiveLocation.class);
  }

  @Override
  @Nullable
  public GraphQXLDirectiveRepeatable getDirectiveRepeatable() {
    return findChildByClass(GraphQXLDirectiveRepeatable.class);
  }

  @Override
  @Nullable
  public GraphQXLIdentifier getNameIdentifier() {
    return findChildByClass(GraphQXLIdentifier.class);
  }

}
