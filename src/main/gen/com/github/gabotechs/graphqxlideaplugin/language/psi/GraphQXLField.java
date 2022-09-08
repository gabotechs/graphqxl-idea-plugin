// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLField extends GraphQXLNamedElement {

  @Nullable
  GraphQXLAlias getAlias();

  @Nullable
  GraphQXLArguments getArguments();

  @NotNull
  List<GraphQXLDirective> getDirectiveList();

  @Nullable
  GraphQXLSelectionSet getSelectionSet();

  @NotNull
  GraphQXLIdentifier getNameIdentifier();

}
