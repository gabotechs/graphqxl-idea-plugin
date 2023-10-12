// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLEnumExt extends GraphQXLNamedElement {

  @NotNull
  List<GraphQXLDirective> getDirectiveList();

  @Nullable
  GraphQXLEnumSelectionSet getEnumSelectionSet();

  @Nullable
  GraphQXLIdentifier getNameIdentifier();

}
