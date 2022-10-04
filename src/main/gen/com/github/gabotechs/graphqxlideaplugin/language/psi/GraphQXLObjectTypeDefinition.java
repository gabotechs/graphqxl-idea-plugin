// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLObjectTypeDefinition extends GraphQXLTypeDefinition {

  @Nullable
  GraphQXLDescription getDescription();

  @NotNull
  List<GraphQXLDirective> getDirectiveList();

  @Nullable
  GraphQXLFieldsDefinition getFieldsDefinition();

  @Nullable
  GraphQXLGeneric getGeneric();

  @Nullable
  GraphQXLImplementsInterfaces getImplementsInterfaces();

  @Nullable
  GraphQXLTypeNameDefinition getTypeNameDefinition();

}
