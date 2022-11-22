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

public class GraphQXLDefImpl extends GraphQXLElementImpl implements GraphQXLDef {

  public GraphQXLDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitDef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphQXLVisitorBase) accept((GraphQXLVisitorBase)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraphQXLDirectiveDef getDirectiveDef() {
    return findChildByClass(GraphQXLDirectiveDef.class);
  }

  @Override
  @Nullable
  public GraphQXLEnumDef getEnumDef() {
    return findChildByClass(GraphQXLEnumDef.class);
  }

  @Override
  @Nullable
  public GraphQXLGenericInputDef getGenericInputDef() {
    return findChildByClass(GraphQXLGenericInputDef.class);
  }

  @Override
  @Nullable
  public GraphQXLGenericTypeDef getGenericTypeDef() {
    return findChildByClass(GraphQXLGenericTypeDef.class);
  }

  @Override
  @Nullable
  public GraphQXLInputDef getInputDef() {
    return findChildByClass(GraphQXLInputDef.class);
  }

  @Override
  @Nullable
  public GraphQXLInterfaceDef getInterfaceDef() {
    return findChildByClass(GraphQXLInterfaceDef.class);
  }

  @Override
  @Nullable
  public GraphQXLScalarDef getScalarDef() {
    return findChildByClass(GraphQXLScalarDef.class);
  }

  @Override
  @Nullable
  public GraphQXLSchemaDef getSchemaDef() {
    return findChildByClass(GraphQXLSchemaDef.class);
  }

  @Override
  @Nullable
  public GraphQXLTypeDef getTypeDef() {
    return findChildByClass(GraphQXLTypeDef.class);
  }

  @Override
  @Nullable
  public GraphQXLUnionDef getUnionDef() {
    return findChildByClass(GraphQXLUnionDef.class);
  }

}
