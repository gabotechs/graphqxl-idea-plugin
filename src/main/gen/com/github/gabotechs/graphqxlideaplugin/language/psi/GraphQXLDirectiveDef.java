// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLDirectiveDef extends GraphQXLElement {

  @Nullable
  GraphQXLArguments getArguments();

  @Nullable
  GraphQXLDescription getDescription();

  @NotNull
  List<GraphQXLDirectiveLocation> getDirectiveLocationList();

  @Nullable
  GraphQXLDirectiveRepeatable getDirectiveRepeatable();

  @Nullable
  GraphQXLIdentifier getNameIdentifier();

}
