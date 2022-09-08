// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLDirectiveDefinition extends GraphQXLTypeSystemDefinition, GraphQXLDescriptionAware {

  @Nullable
  GraphQXLArgumentsDefinition getArgumentsDefinition();

  @Nullable
  GraphQXLDescription getDescription();

  @Nullable
  GraphQXLDirectiveLocations getDirectiveLocations();

  @Nullable
  GraphQXLIdentifier getNameIdentifier();

  @Nullable
  PsiElement getRepeatable();

}
