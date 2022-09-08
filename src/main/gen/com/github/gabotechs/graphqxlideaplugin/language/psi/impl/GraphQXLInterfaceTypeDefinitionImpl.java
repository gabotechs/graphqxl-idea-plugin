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

public class GraphQXLInterfaceTypeDefinitionImpl extends GraphQXLTypeDefinitionImpl implements GraphQXLInterfaceTypeDefinition {

  public GraphQXLInterfaceTypeDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitInterfaceTypeDefinition(this);
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
  @NotNull
  public List<GraphQXLDirective> getDirectiveList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQXLDirective.class);
  }

  @Override
  @Nullable
  public GraphQXLFieldsDefinition getFieldsDefinition() {
    return findChildByClass(GraphQXLFieldsDefinition.class);
  }

  @Override
  @Nullable
  public GraphQXLImplementsInterfaces getImplementsInterfaces() {
    return findChildByClass(GraphQXLImplementsInterfaces.class);
  }

  @Override
  @Nullable
  public GraphQXLTypeNameDefinition getTypeNameDefinition() {
    return findChildByClass(GraphQXLTypeNameDefinition.class);
  }

}
