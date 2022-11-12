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

public class GraphQXLModifiedRefImpl extends GraphQXLElementImpl implements GraphQXLModifiedRef {

  public GraphQXLModifiedRefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GraphQXLVisitorBase visitor) {
    visitor.visitModifiedRef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GraphQXLVisitorBase) accept((GraphQXLVisitorBase)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GraphQXLExpandableRef getExpandableRef() {
    return findChildByClass(GraphQXLExpandableRef.class);
  }

  @Override
  @Nullable
  public GraphQXLModifiedRef getModifiedRef() {
    return findChildByClass(GraphQXLModifiedRef.class);
  }

  @Override
  @Nullable
  public GraphQXLOptionalModifier getOptionalModifier() {
    return findChildByClass(GraphQXLOptionalModifier.class);
  }

  @Override
  @Nullable
  public GraphQXLRequiredModifier getRequiredModifier() {
    return findChildByClass(GraphQXLRequiredModifier.class);
  }

}
