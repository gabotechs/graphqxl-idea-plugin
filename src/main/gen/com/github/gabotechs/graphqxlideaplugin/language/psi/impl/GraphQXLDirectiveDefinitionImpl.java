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

public class GraphQXLDirectiveDefinitionImpl extends GraphQXLTypeSystemDefinitionImpl implements GraphQXLDirectiveDefinition {

  public GraphQXLDirectiveDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitDirectiveDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphQXLVisitorBase) accept((GraphQXLVisitorBase)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraphQXLArgumentsDefinition getArgumentsDefinition() {
    return findChildByClass(GraphQXLArgumentsDefinition.class);
  }

  @Override
  @Nullable
  public GraphQXLDescription getDescription() {
    return findChildByClass(GraphQXLDescription.class);
  }

  @Override
  @Nullable
  public GraphQXLDirectiveLocations getDirectiveLocations() {
    return findChildByClass(GraphQXLDirectiveLocations.class);
  }

  @Override
  @Nullable
  public GraphQXLIdentifier getNameIdentifier() {
    return findChildByClass(GraphQXLIdentifier.class);
  }

  @Override
  @Nullable
  public PsiElement getRepeatable() {
    return findChildByType(REPEATABLE_KEYWORD);
  }

}
