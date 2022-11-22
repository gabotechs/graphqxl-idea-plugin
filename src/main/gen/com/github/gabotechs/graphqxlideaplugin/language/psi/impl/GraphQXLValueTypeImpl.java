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

public class GraphQXLValueTypeImpl extends GraphQXLElementImpl implements GraphQXLValueType {

  public GraphQXLValueTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitValueType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphQXLVisitorBase) accept((GraphQXLVisitorBase)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraphQXLValueArray getValueArray() {
    return findChildByClass(GraphQXLValueArray.class);
  }

  @Override
  @Nullable
  public GraphQXLValueBasicType getValueBasicType() {
    return findChildByClass(GraphQXLValueBasicType.class);
  }

  @Override
  @Nullable
  public GraphQXLValueNonNullable getValueNonNullable() {
    return findChildByClass(GraphQXLValueNonNullable.class);
  }

}
