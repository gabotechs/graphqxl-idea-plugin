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

public class GraphQXLObjectValueImpl extends GraphQXLValueImpl implements GraphQXLObjectValue {

  public GraphQXLObjectValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitObjectValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphQXLVisitorBase) accept((GraphQXLVisitorBase)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GraphQXLObjectField> getObjectFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQXLObjectField.class);
  }

}
