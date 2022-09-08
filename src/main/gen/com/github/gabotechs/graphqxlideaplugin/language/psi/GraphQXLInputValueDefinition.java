// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLInputValueDefinition extends GraphQXLNamedElement, GraphQXLDescriptionAware {

  @Nullable
  GraphQXLDefaultValue getDefaultValue();

  @Nullable
  GraphQXLDescription getDescription();

  @NotNull
  List<GraphQXLDirective> getDirectiveList();

  @Nullable
  GraphQXLType getType();

  @NotNull
  GraphQXLIdentifier getNameIdentifier();

}
