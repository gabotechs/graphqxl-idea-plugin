// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLInputExt extends GraphQXLNamedElement {

  @NotNull
  List<GraphQXLDirective> getDirectiveList();

  @Nullable
  GraphQXLGeneric getGeneric();

  @Nullable
  GraphQXLInputSelectionSet getInputSelectionSet();

  @Nullable
  GraphQXLIdentifier getNameIdentifier();

}
