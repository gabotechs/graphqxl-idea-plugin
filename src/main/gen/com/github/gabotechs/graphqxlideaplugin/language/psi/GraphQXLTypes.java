// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.gabotechs.graphqxlideaplugin.language.psi.impl.*;

public interface GraphQXLTypes {

  IElementType ALIAS = new GraphQXLElementType("ALIAS");
  IElementType ARGUMENT = new GraphQXLElementType("ARGUMENT");
  IElementType ARGUMENTS = new GraphQXLElementType("ARGUMENTS");
  IElementType ARGUMENTS_DEFINITION = new GraphQXLElementType("ARGUMENTS_DEFINITION");
  IElementType ARRAY_VALUE = new GraphQXLElementType("ARRAY_VALUE");
  IElementType BLOCK_STRING = new GraphQXLElementType("BLOCK_STRING");
  IElementType BOOLEAN_VALUE = new GraphQXLElementType("BOOLEAN_VALUE");
  IElementType DEFAULT_VALUE = new GraphQXLElementType("DEFAULT_VALUE");
  IElementType DEFINITION = new GraphQXLElementType("DEFINITION");
  IElementType DESCRIPTION = new GraphQXLElementType("DESCRIPTION");
  IElementType DIRECTIVE = new GraphQXLElementType("DIRECTIVE");
  IElementType DIRECTIVE_DEFINITION = new GraphQXLElementType("DIRECTIVE_DEFINITION");
  IElementType DIRECTIVE_LOCATION = new GraphQXLElementType("DIRECTIVE_LOCATION");
  IElementType DIRECTIVE_LOCATIONS = new GraphQXLElementType("DIRECTIVE_LOCATIONS");
  IElementType ENUM_TYPE_DEFINITION = new GraphQXLElementType("ENUM_TYPE_DEFINITION");
  IElementType ENUM_VALUE = new GraphQXLElementType("ENUM_VALUE");
  IElementType ENUM_VALUE_DEFINITION = new GraphQXLElementType("ENUM_VALUE_DEFINITION");
  IElementType ENUM_VALUE_DEFINITIONS = new GraphQXLElementType("ENUM_VALUE_DEFINITIONS");
  IElementType FIELD = new GraphQXLElementType("FIELD");
  IElementType FIELDS_DEFINITION = new GraphQXLElementType("FIELDS_DEFINITION");
  IElementType FIELD_DEFINITION = new GraphQXLElementType("FIELD_DEFINITION");
  IElementType FLOAT_VALUE = new GraphQXLElementType("FLOAT_VALUE");
  IElementType IDENTIFIER = new GraphQXLElementType("IDENTIFIER");
  IElementType IMPLEMENTS_INTERFACES = new GraphQXLElementType("IMPLEMENTS_INTERFACES");
  IElementType IMPORT = new GraphQXLElementType("IMPORT");
  IElementType INPUT_OBJECT_TYPE_DEFINITION = new GraphQXLElementType("INPUT_OBJECT_TYPE_DEFINITION");
  IElementType INPUT_OBJECT_VALUE_DEFINITIONS = new GraphQXLElementType("INPUT_OBJECT_VALUE_DEFINITIONS");
  IElementType INPUT_VALUE_DEFINITION = new GraphQXLElementType("INPUT_VALUE_DEFINITION");
  IElementType INTERFACE_TYPE_DEFINITION = new GraphQXLElementType("INTERFACE_TYPE_DEFINITION");
  IElementType INT_VALUE = new GraphQXLElementType("INT_VALUE");
  IElementType LIST_TYPE = new GraphQXLElementType("LIST_TYPE");
  IElementType NON_NULL_TYPE = new GraphQXLElementType("NON_NULL_TYPE");
  IElementType NULL_VALUE = new GraphQXLElementType("NULL_VALUE");
  IElementType OBJECT_FIELD = new GraphQXLElementType("OBJECT_FIELD");
  IElementType OBJECT_TYPE_DEFINITION = new GraphQXLElementType("OBJECT_TYPE_DEFINITION");
  IElementType OBJECT_VALUE = new GraphQXLElementType("OBJECT_VALUE");
  IElementType OPERATION_TYPE = new GraphQXLElementType("OPERATION_TYPE");
  IElementType OPERATION_TYPE_DEFINITION = new GraphQXLElementType("OPERATION_TYPE_DEFINITION");
  IElementType OPERATION_TYPE_DEFINITIONS = new GraphQXLElementType("OPERATION_TYPE_DEFINITIONS");
  IElementType QUOTED_STRING = new GraphQXLElementType("QUOTED_STRING");
  IElementType SCALAR_TYPE_DEFINITION = new GraphQXLElementType("SCALAR_TYPE_DEFINITION");
  IElementType SCHEMA_DEFINITION = new GraphQXLElementType("SCHEMA_DEFINITION");
  IElementType SELECTION = new GraphQXLElementType("SELECTION");
  IElementType SELECTION_SET = new GraphQXLElementType("SELECTION_SET");
  IElementType STRING_LITERAL = new GraphQXLElementType("STRING_LITERAL");
  IElementType STRING_VALUE = new GraphQXLElementType("STRING_VALUE");
  IElementType TYPE = new GraphQXLElementType("TYPE");
  IElementType TYPE_DEFINITION = new GraphQXLElementType("TYPE_DEFINITION");
  IElementType TYPE_NAME = new GraphQXLElementType("TYPE_NAME");
  IElementType TYPE_NAME_DEFINITION = new GraphQXLElementType("TYPE_NAME_DEFINITION");
  IElementType TYPE_SYSTEM_DEFINITION = new GraphQXLElementType("TYPE_SYSTEM_DEFINITION");
  IElementType UNION_MEMBERS = new GraphQXLElementType("UNION_MEMBERS");
  IElementType UNION_MEMBERSHIP = new GraphQXLElementType("UNION_MEMBERSHIP");
  IElementType UNION_TYPE_DEFINITION = new GraphQXLElementType("UNION_TYPE_DEFINITION");
  IElementType VALUE = new GraphQXLElementType("VALUE");

  IElementType AMP = new GraphQXLTokenType("&");
  IElementType AT = new GraphQXLTokenType("@");
  IElementType BANG = new GraphQXLTokenType("!");
  IElementType BRACE_L = new GraphQXLTokenType("{");
  IElementType BRACE_R = new GraphQXLTokenType("}");
  IElementType BRACKET_L = new GraphQXLTokenType("[");
  IElementType BRACKET_R = new GraphQXLTokenType("]");
  IElementType CLOSING_QUOTE = new GraphQXLTokenType("CLOSING_QUOTE");
  IElementType CLOSING_TRIPLE_QUOTE = new GraphQXLTokenType("CLOSING_TRIPLE_QUOTE");
  IElementType COLON = new GraphQXLTokenType(":");
  IElementType DIRECTIVE_KEYWORD = new GraphQXLTokenType("directive");
  IElementType DOLLAR = new GraphQXLTokenType("$");
  IElementType ENUM_KEYWORD = new GraphQXLTokenType("enum");
  IElementType EOL_COMMENT = new GraphQXLTokenType("EOL_COMMENT");
  IElementType EQUALS = new GraphQXLTokenType("=");
  IElementType FLOAT = new GraphQXLTokenType("FLOAT");
  IElementType IMPLEMENTS_KEYWORD = new GraphQXLTokenType("implements");
  IElementType IMPORT_KEYWORD = new GraphQXLTokenType("import");
  IElementType INPUT_KEYWORD = new GraphQXLTokenType("input");
  IElementType INTERFACE_KEYWORD = new GraphQXLTokenType("interface");
  IElementType MUTATION_KEYWORD = new GraphQXLTokenType("mutation");
  IElementType NAME = new GraphQXLTokenType("NAME");
  IElementType NUMBER = new GraphQXLTokenType("NUMBER");
  IElementType ON_KEYWORD = new GraphQXLTokenType("on");
  IElementType OPEN_QUOTE = new GraphQXLTokenType("OPEN_QUOTE");
  IElementType OPEN_TRIPLE_QUOTE = new GraphQXLTokenType("OPEN_TRIPLE_QUOTE");
  IElementType PAREN_L = new GraphQXLTokenType("(");
  IElementType PAREN_R = new GraphQXLTokenType(")");
  IElementType PIPE = new GraphQXLTokenType("|");
  IElementType QUERY_KEYWORD = new GraphQXLTokenType("query");
  IElementType REGULAR_STRING_PART = new GraphQXLTokenType("REGULAR_STRING_PART");
  IElementType REPEATABLE_KEYWORD = new GraphQXLTokenType("repeatable");
  IElementType SCALAR_KEYWORD = new GraphQXLTokenType("scalar");
  IElementType SCHEMA_KEYWORD = new GraphQXLTokenType("schema");
  IElementType SPREAD = new GraphQXLTokenType("...");
  IElementType SUBSCRIPTION_KEYWORD = new GraphQXLTokenType("subscription");
  IElementType TEMPLATE_CHAR = new GraphQXLTokenType("TEMPLATE_CHAR");
  IElementType TEMPLATE_START = new GraphQXLTokenType("${");
  IElementType TYPE_KEYWORD = new GraphQXLTokenType("type");
  IElementType UNION_KEYWORD = new GraphQXLTokenType("union");
  IElementType VARIABLE_NAME = new GraphQXLTokenType("VARIABLE_NAME");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIAS) {
        return new GraphQXLAliasImpl(node);
      }
      else if (type == ARGUMENT) {
        return new GraphQXLArgumentImpl(node);
      }
      else if (type == ARGUMENTS) {
        return new GraphQXLArgumentsImpl(node);
      }
      else if (type == ARGUMENTS_DEFINITION) {
        return new GraphQXLArgumentsDefinitionImpl(node);
      }
      else if (type == ARRAY_VALUE) {
        return new GraphQXLArrayValueImpl(node);
      }
      else if (type == BLOCK_STRING) {
        return new GraphQXLBlockStringImpl(node);
      }
      else if (type == BOOLEAN_VALUE) {
        return new GraphQXLBooleanValueImpl(node);
      }
      else if (type == DEFAULT_VALUE) {
        return new GraphQXLDefaultValueImpl(node);
      }
      else if (type == DEFINITION) {
        return new GraphQXLDefinitionImpl(node);
      }
      else if (type == DESCRIPTION) {
        return new GraphQXLDescriptionImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new GraphQXLDirectiveImpl(node);
      }
      else if (type == DIRECTIVE_DEFINITION) {
        return new GraphQXLDirectiveDefinitionImpl(node);
      }
      else if (type == DIRECTIVE_LOCATION) {
        return new GraphQXLDirectiveLocationImpl(node);
      }
      else if (type == DIRECTIVE_LOCATIONS) {
        return new GraphQXLDirectiveLocationsImpl(node);
      }
      else if (type == ENUM_TYPE_DEFINITION) {
        return new GraphQXLEnumTypeDefinitionImpl(node);
      }
      else if (type == ENUM_VALUE) {
        return new GraphQXLEnumValueImpl(node);
      }
      else if (type == ENUM_VALUE_DEFINITION) {
        return new GraphQXLEnumValueDefinitionImpl(node);
      }
      else if (type == ENUM_VALUE_DEFINITIONS) {
        return new GraphQXLEnumValueDefinitionsImpl(node);
      }
      else if (type == FIELD) {
        return new GraphQXLFieldImpl(node);
      }
      else if (type == FIELDS_DEFINITION) {
        return new GraphQXLFieldsDefinitionImpl(node);
      }
      else if (type == FIELD_DEFINITION) {
        return new GraphQXLFieldDefinitionImpl(node);
      }
      else if (type == FLOAT_VALUE) {
        return new GraphQXLFloatValueImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new GraphQXLIdentifierImpl(node);
      }
      else if (type == IMPLEMENTS_INTERFACES) {
        return new GraphQXLImplementsInterfacesImpl(node);
      }
      else if (type == IMPORT) {
        return new GraphQXLImportImpl(node);
      }
      else if (type == INPUT_OBJECT_TYPE_DEFINITION) {
        return new GraphQXLInputObjectTypeDefinitionImpl(node);
      }
      else if (type == INPUT_OBJECT_VALUE_DEFINITIONS) {
        return new GraphQXLInputObjectValueDefinitionsImpl(node);
      }
      else if (type == INPUT_VALUE_DEFINITION) {
        return new GraphQXLInputValueDefinitionImpl(node);
      }
      else if (type == INTERFACE_TYPE_DEFINITION) {
        return new GraphQXLInterfaceTypeDefinitionImpl(node);
      }
      else if (type == INT_VALUE) {
        return new GraphQXLIntValueImpl(node);
      }
      else if (type == LIST_TYPE) {
        return new GraphQXLListTypeImpl(node);
      }
      else if (type == NON_NULL_TYPE) {
        return new GraphQXLNonNullTypeImpl(node);
      }
      else if (type == NULL_VALUE) {
        return new GraphQXLNullValueImpl(node);
      }
      else if (type == OBJECT_FIELD) {
        return new GraphQXLObjectFieldImpl(node);
      }
      else if (type == OBJECT_TYPE_DEFINITION) {
        return new GraphQXLObjectTypeDefinitionImpl(node);
      }
      else if (type == OBJECT_VALUE) {
        return new GraphQXLObjectValueImpl(node);
      }
      else if (type == OPERATION_TYPE) {
        return new GraphQXLOperationTypeImpl(node);
      }
      else if (type == OPERATION_TYPE_DEFINITION) {
        return new GraphQXLOperationTypeDefinitionImpl(node);
      }
      else if (type == OPERATION_TYPE_DEFINITIONS) {
        return new GraphQXLOperationTypeDefinitionsImpl(node);
      }
      else if (type == QUOTED_STRING) {
        return new GraphQXLQuotedStringImpl(node);
      }
      else if (type == SCALAR_TYPE_DEFINITION) {
        return new GraphQXLScalarTypeDefinitionImpl(node);
      }
      else if (type == SCHEMA_DEFINITION) {
        return new GraphQXLSchemaDefinitionImpl(node);
      }
      else if (type == SELECTION) {
        return new GraphQXLSelectionImpl(node);
      }
      else if (type == SELECTION_SET) {
        return new GraphQXLSelectionSetImpl(node);
      }
      else if (type == STRING_VALUE) {
        return new GraphQXLStringValueImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new GraphQXLTypeNameImpl(node);
      }
      else if (type == TYPE_NAME_DEFINITION) {
        return new GraphQXLTypeNameDefinitionImpl(node);
      }
      else if (type == UNION_MEMBERS) {
        return new GraphQXLUnionMembersImpl(node);
      }
      else if (type == UNION_MEMBERSHIP) {
        return new GraphQXLUnionMembershipImpl(node);
      }
      else if (type == UNION_TYPE_DEFINITION) {
        return new GraphQXLUnionTypeDefinitionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
