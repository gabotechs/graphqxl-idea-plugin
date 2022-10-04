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

public class GraphQXLGenericObjectTypeDefinitionImpl extends GraphQXLTypeDefinitionImpl implements GraphQXLGenericObjectTypeDefinition {

  public GraphQXLGenericObjectTypeDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitGenericObjectTypeDefinition(this);
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
  public GraphQXLGenericCall getGenericCall() {
    return findChildByClass(GraphQXLGenericCall.class);
  }

  @Override
  @Nullable
  public GraphQXLIdentifier getIdentifier() {
    return findChildByClass(GraphQXLIdentifier.class);
  }

  @Override
  @NotNull
  public GraphQXLTypeNameDefinition getTypeNameDefinition() {
    return findNotNullChildByClass(GraphQXLTypeNameDefinition.class);
  }

}
