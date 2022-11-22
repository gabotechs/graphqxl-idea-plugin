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

public class GraphQXLEnumSelectionSetImpl extends GraphQXLElementImpl implements GraphQXLEnumSelectionSet {

  public GraphQXLEnumSelectionSetImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitEnumSelectionSet(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphQXLVisitorBase) accept((GraphQXLVisitorBase)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GraphQXLFieldWithoutArgsWithoutValue> getFieldWithoutArgsWithoutValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQXLFieldWithoutArgsWithoutValue.class);
  }

  @Override
  @NotNull
  public List<GraphQXLSpreadReference> getSpreadReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQXLSpreadReference.class);
  }

}
