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

public class GraphQXLTypeDefImpl extends GraphQXLNamedElementImpl implements GraphQXLTypeDef {

  public GraphQXLTypeDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitTypeDef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphQXLVisitorBase) accept((GraphQXLVisitorBase)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraphQXLDescription getDescription() {
    return findChildByClass(GraphQXLDescription.class);
  }

  @Override
  @Nullable
  public GraphQXLDescriptionVariables getDescriptionVariables() {
    return findChildByClass(GraphQXLDescriptionVariables.class);
  }

  @Override
  @NotNull
  public List<GraphQXLDirective> getDirectiveList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQXLDirective.class);
  }

  @Override
  @Nullable
  public GraphQXLGeneric getGeneric() {
    return findChildByClass(GraphQXLGeneric.class);
  }

  @Override
  @Nullable
  public GraphQXLImplements getImplements() {
    return findChildByClass(GraphQXLImplements.class);
  }

  @Override
  @Nullable
  public GraphQXLTypeSelectionSet getTypeSelectionSet() {
    return findChildByClass(GraphQXLTypeSelectionSet.class);
  }

  @Override
  @Nullable
  public GraphQXLIdentifier getNameIdentifier() {
    return findChildByClass(GraphQXLIdentifier.class);
  }

}
