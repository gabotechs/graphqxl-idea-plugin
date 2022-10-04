// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class GraphQXLVisitorBase extends PsiElementVisitor {

  public void visitAlias(@NotNull GraphQXLAlias o) {
    visitElement(o);
  }

  public void visitArgument(@NotNull GraphQXLArgument o) {
    visitNamedElement(o);
  }

  public void visitArguments(@NotNull GraphQXLArguments o) {
    visitElement(o);
  }

  public void visitArgumentsDefinition(@NotNull GraphQXLArgumentsDefinition o) {
    visitElement(o);
  }

  public void visitArrayValue(@NotNull GraphQXLArrayValue o) {
    visitValue(o);
  }

  public void visitBlockString(@NotNull GraphQXLBlockString o) {
    visitStringLiteral(o);
  }

  public void visitBooleanValue(@NotNull GraphQXLBooleanValue o) {
    visitValue(o);
  }

  public void visitDefaultValue(@NotNull GraphQXLDefaultValue o) {
    visitElement(o);
  }

  public void visitDefinition(@NotNull GraphQXLDefinition o) {
    visitElement(o);
  }

  public void visitDescription(@NotNull GraphQXLDescription o) {
    visitElement(o);
  }

  public void visitDirective(@NotNull GraphQXLDirective o) {
    visitNamedElement(o);
  }

  public void visitDirectiveDefinition(@NotNull GraphQXLDirectiveDefinition o) {
    visitTypeSystemDefinition(o);
    // visitDescriptionAware(o);
  }

  public void visitDirectiveLocation(@NotNull GraphQXLDirectiveLocation o) {
    visitElement(o);
  }

  public void visitDirectiveLocations(@NotNull GraphQXLDirectiveLocations o) {
    visitElement(o);
  }

  public void visitEnumTypeDefinition(@NotNull GraphQXLEnumTypeDefinition o) {
    visitTypeDefinition(o);
  }

  public void visitEnumValue(@NotNull GraphQXLEnumValue o) {
    visitValue(o);
    // visitNamedElement(o);
  }

  public void visitEnumValueDefinition(@NotNull GraphQXLEnumValueDefinition o) {
    visitDescriptionAware(o);
  }

  public void visitEnumValueDefinitions(@NotNull GraphQXLEnumValueDefinitions o) {
    visitElement(o);
  }

  public void visitField(@NotNull GraphQXLField o) {
    visitNamedElement(o);
  }

  public void visitFieldDefinition(@NotNull GraphQXLFieldDefinition o) {
    visitNamedElement(o);
    // visitDescriptionAware(o);
  }

  public void visitFieldsDefinition(@NotNull GraphQXLFieldsDefinition o) {
    visitElement(o);
  }

  public void visitFloatValue(@NotNull GraphQXLFloatValue o) {
    visitValue(o);
  }

  public void visitGeneric(@NotNull GraphQXLGeneric o) {
    visitElement(o);
  }

  public void visitGenericInputObjectTypeDefinition(@NotNull GraphQXLGenericInputObjectTypeDefinition o) {
    visitTypeDefinition(o);
  }

  public void visitGenericObjectTypeDefinition(@NotNull GraphQXLGenericObjectTypeDefinition o) {
    visitTypeDefinition(o);
  }

  public void visitGenericCall(@NotNull GraphQXLGenericCall o) {
    visitElement(o);
  }

  public void visitIdentifier(@NotNull GraphQXLIdentifier o) {
    visitElement(o);
  }

  public void visitImplementsInterfaces(@NotNull GraphQXLImplementsInterfaces o) {
    visitElement(o);
  }

  public void visitImport(@NotNull GraphQXLImport o) {
    visitElement(o);
  }

  public void visitInputObjectTypeDefinition(@NotNull GraphQXLInputObjectTypeDefinition o) {
    visitTypeDefinition(o);
  }

  public void visitInputObjectValueDefinitions(@NotNull GraphQXLInputObjectValueDefinitions o) {
    visitElement(o);
  }

  public void visitInputValueDefinition(@NotNull GraphQXLInputValueDefinition o) {
    visitNamedElement(o);
    // visitDescriptionAware(o);
  }

  public void visitIntValue(@NotNull GraphQXLIntValue o) {
    visitValue(o);
  }

  public void visitInterfaceTypeDefinition(@NotNull GraphQXLInterfaceTypeDefinition o) {
    visitTypeDefinition(o);
  }

  public void visitListType(@NotNull GraphQXLListType o) {
    visitType(o);
  }

  public void visitNonNullType(@NotNull GraphQXLNonNullType o) {
    visitType(o);
  }

  public void visitNullValue(@NotNull GraphQXLNullValue o) {
    visitValue(o);
  }

  public void visitObjectField(@NotNull GraphQXLObjectField o) {
    visitNamedElement(o);
  }

  public void visitObjectTypeDefinition(@NotNull GraphQXLObjectTypeDefinition o) {
    visitTypeDefinition(o);
  }

  public void visitObjectValue(@NotNull GraphQXLObjectValue o) {
    visitValue(o);
  }

  public void visitOperationType(@NotNull GraphQXLOperationType o) {
    visitElement(o);
  }

  public void visitOperationTypeDefinition(@NotNull GraphQXLOperationTypeDefinition o) {
    visitElement(o);
  }

  public void visitOperationTypeDefinitions(@NotNull GraphQXLOperationTypeDefinitions o) {
    visitElement(o);
  }

  public void visitQuotedString(@NotNull GraphQXLQuotedString o) {
    visitStringLiteral(o);
  }

  public void visitScalarTypeDefinition(@NotNull GraphQXLScalarTypeDefinition o) {
    visitTypeDefinition(o);
  }

  public void visitSchemaDefinition(@NotNull GraphQXLSchemaDefinition o) {
    visitTypeSystemDefinition(o);
    // visitDescriptionAware(o);
  }

  public void visitSelection(@NotNull GraphQXLSelection o) {
    visitElement(o);
  }

  public void visitSelectionSet(@NotNull GraphQXLSelectionSet o) {
    visitElement(o);
  }

  public void visitSpreadFieldDefinition(@NotNull GraphQXLSpreadFieldDefinition o) {
    visitNamedElement(o);
  }

  public void visitSpreadInputDefinition(@NotNull GraphQXLSpreadInputDefinition o) {
    visitNamedElement(o);
  }

  public void visitStringLiteral(@NotNull GraphQXLStringLiteral o) {
    visitElement(o);
  }

  public void visitStringValue(@NotNull GraphQXLStringValue o) {
    visitValue(o);
  }

  public void visitType(@NotNull GraphQXLType o) {
    visitElement(o);
  }

  public void visitTypeDefinition(@NotNull GraphQXLTypeDefinition o) {
    visitTypeSystemDefinition(o);
    // visitDescriptionAware(o);
  }

  public void visitTypeName(@NotNull GraphQXLTypeName o) {
    visitType(o);
    // visitNamedElement(o);
  }

  public void visitTypeNameDefinition(@NotNull GraphQXLTypeNameDefinition o) {
    visitType(o);
    // visitNamedElement(o);
  }

  public void visitTypeSystemDefinition(@NotNull GraphQXLTypeSystemDefinition o) {
    visitDefinition(o);
  }

  public void visitUnionMembers(@NotNull GraphQXLUnionMembers o) {
    visitElement(o);
  }

  public void visitUnionMembership(@NotNull GraphQXLUnionMembership o) {
    visitElement(o);
  }

  public void visitUnionTypeDefinition(@NotNull GraphQXLUnionTypeDefinition o) {
    visitTypeDefinition(o);
  }

  public void visitValue(@NotNull GraphQXLValue o) {
    visitElement(o);
  }

  public void visitDescriptionAware(@NotNull GraphQXLDescriptionAware o) {
    visitElement(o);
  }

  public void visitNamedElement(@NotNull GraphQXLNamedElement o) {
    visitElement(o);
  }

  public void visitElement(@NotNull GraphQXLElement o) {
    super.visitElement(o);
  }

}
