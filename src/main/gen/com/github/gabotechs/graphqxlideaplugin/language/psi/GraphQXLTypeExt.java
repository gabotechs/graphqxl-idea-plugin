// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLTypeExt extends GraphQXLNamedElement {

  @NotNull
  List<GraphQXLDirective> getDirectiveList();

  @Nullable
  GraphQXLGeneric getGeneric();

  @Nullable
  GraphQXLImplements getImplements();

  @Nullable
  GraphQXLTypeSelectionSet getTypeSelectionSet();

  @Nullable
  GraphQXLIdentifier getNameIdentifier();

}
