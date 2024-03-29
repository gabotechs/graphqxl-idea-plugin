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

public class GraphQXLInterfaceSelectionSetImpl extends GraphQXLElementImpl implements GraphQXLInterfaceSelectionSet {

  public GraphQXLInterfaceSelectionSetImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitInterfaceSelectionSet(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphQXLVisitorBase) accept((GraphQXLVisitorBase)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GraphQXLFieldWithoutArgs> getFieldWithoutArgsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQXLFieldWithoutArgs.class);
  }

  @Override
  @NotNull
  public List<GraphQXLSpreadReference> getSpreadReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GraphQXLSpreadReference.class);
  }

}
