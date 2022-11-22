// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GraphQXLUnionDef extends GraphQXLNamedElement {

  @Nullable
  GraphQXLDescription getDescription();

  @NotNull
  List<GraphQXLDirective> getDirectiveList();

  @NotNull
  List<GraphQXLOtherIdentifier> getOtherIdentifierList();

  @Nullable
  GraphQXLIdentifier getNameIdentifier();

}
