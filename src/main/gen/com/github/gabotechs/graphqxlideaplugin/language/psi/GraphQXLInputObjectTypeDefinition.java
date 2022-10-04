// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLInputObjectTypeDefinition extends GraphQXLTypeDefinition {

  @Nullable
  GraphQXLDescription getDescription();

  @NotNull
  List<GraphQXLDirective> getDirectiveList();

  @Nullable
  GraphQXLGeneric getGeneric();

  @Nullable
  GraphQXLInputObjectValueDefinitions getInputObjectValueDefinitions();

  @Nullable
  GraphQXLTypeNameDefinition getTypeNameDefinition();

}
