// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLInterfaceExt extends GraphQXLNamedElement {

  @NotNull
  List<GraphQXLDirective> getDirectiveList();

  @Nullable
  GraphQXLImplements getImplements();

  @Nullable
  GraphQXLInterfaceSelectionSet getInterfaceSelectionSet();

  @Nullable
  GraphQXLIdentifier getNameIdentifier();

}
