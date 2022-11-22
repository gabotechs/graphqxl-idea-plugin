// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLGenericTypeDef extends GraphQXLNamedElement {

  @Nullable
  GraphQXLDescription getDescription();

  @Nullable
  GraphQXLDescriptionVariables getDescriptionVariables();

  @NotNull
  List<GraphQXLDirective> getDirectiveList();

  @Nullable
  GraphQXLModifiedRef getModifiedRef();

  @NotNull
  GraphQXLIdentifier getNameIdentifier();

}
