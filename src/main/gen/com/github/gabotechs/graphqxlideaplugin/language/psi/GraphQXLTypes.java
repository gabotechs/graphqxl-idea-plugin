// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.gabotechs.graphqxlideaplugin.language.psi.impl.*;

public interface GraphQXLTypes {

  IElementType ARGUMENT = new GraphQXLElementType("ARGUMENT");
  IElementType ARGUMENTS = new GraphQXLElementType("ARGUMENTS");
  IElementType BASIC_DATA = new GraphQXLElementType("BASIC_DATA");
  IElementType BASIC_TYPE = new GraphQXLElementType("BASIC_TYPE");
  IElementType BOOLEAN = new GraphQXLElementType("BOOLEAN");
  IElementType BOOLEAN_DATA = new GraphQXLElementType("BOOLEAN_DATA");
  IElementType CHAR_NO_DOUBLE_QUOTE = new GraphQXLElementType("CHAR_NO_DOUBLE_QUOTE");
  IElementType DEF = new GraphQXLElementType("DEF");
  IElementType DESCRIPTION = new GraphQXLElementType("DESCRIPTION");
  IElementType DESCRIPTION_VARIABLE = new GraphQXLElementType("DESCRIPTION_VARIABLE");
  IElementType DESCRIPTION_VARIABLES = new GraphQXLElementType("DESCRIPTION_VARIABLES");
  IElementType DIRECTIVE = new GraphQXLElementType("DIRECTIVE");
  IElementType DIRECTIVE_DEF = new GraphQXLElementType("DIRECTIVE_DEF");
  IElementType DIRECTIVE_LOCATION = new GraphQXLElementType("DIRECTIVE_LOCATION");
  IElementType DIRECTIVE_REPEATABLE = new GraphQXLElementType("DIRECTIVE_REPEATABLE");
  IElementType ENUM_DEF = new GraphQXLElementType("ENUM_DEF");
  IElementType ENUM_SELECTION_SET = new GraphQXLElementType("ENUM_SELECTION_SET");
  IElementType EXPANDABLE_REF = new GraphQXLElementType("EXPANDABLE_REF");
  IElementType FIELD_WITHOUT_ARGS = new GraphQXLElementType("FIELD_WITHOUT_ARGS");
  IElementType FIELD_WITHOUT_ARGS_WITHOUT_VALUE = new GraphQXLElementType("FIELD_WITHOUT_ARGS_WITHOUT_VALUE");
  IElementType FIELD_WITH_ARGS = new GraphQXLElementType("FIELD_WITH_ARGS");
  IElementType FILENAME = new GraphQXLElementType("FILENAME");
  IElementType FLOAT = new GraphQXLElementType("FLOAT");
  IElementType FLOAT_DATA = new GraphQXLElementType("FLOAT_DATA");
  IElementType FUNCTION_CALL = new GraphQXLElementType("FUNCTION_CALL");
  IElementType FUNCTION_INPUT = new GraphQXLElementType("FUNCTION_INPUT");
  IElementType GENERIC = new GraphQXLElementType("GENERIC");
  IElementType GENERIC_CALL = new GraphQXLElementType("GENERIC_CALL");
  IElementType GENERIC_INPUT_DEF = new GraphQXLElementType("GENERIC_INPUT_DEF");
  IElementType GENERIC_TYPE_DEF = new GraphQXLElementType("GENERIC_TYPE_DEF");
  IElementType IDENTIFIER = new GraphQXLElementType("IDENTIFIER");
  IElementType IMPLEMENTS = new GraphQXLElementType("IMPLEMENTS");
  IElementType IMPORT = new GraphQXLElementType("IMPORT");
  IElementType INPUT_DEF = new GraphQXLElementType("INPUT_DEF");
  IElementType INPUT_SELECTION_SET = new GraphQXLElementType("INPUT_SELECTION_SET");
  IElementType INT = new GraphQXLElementType("INT");
  IElementType INTERFACE_DEF = new GraphQXLElementType("INTERFACE_DEF");
  IElementType INTERFACE_SELECTION_SET = new GraphQXLElementType("INTERFACE_SELECTION_SET");
  IElementType INT_DATA = new GraphQXLElementType("INT_DATA");
  IElementType LIST_DATA = new GraphQXLElementType("LIST_DATA");
  IElementType MODIFIED_REF = new GraphQXLElementType("MODIFIED_REF");
  IElementType MULTILINE_DESCRIPTION = new GraphQXLElementType("MULTILINE_DESCRIPTION");
  IElementType OBJECT = new GraphQXLElementType("OBJECT");
  IElementType OBJECT_DATA = new GraphQXLElementType("OBJECT_DATA");
  IElementType OBJECT_ENTRY = new GraphQXLElementType("OBJECT_ENTRY");
  IElementType ONE_LINE_DESCRIPTION = new GraphQXLElementType("ONE_LINE_DESCRIPTION");
  IElementType OPTIONAL_MODIFIER = new GraphQXLElementType("OPTIONAL_MODIFIER");
  IElementType OTHER_IDENTIFIER = new GraphQXLElementType("OTHER_IDENTIFIER");
  IElementType REQUIRED_MODIFIER = new GraphQXLElementType("REQUIRED_MODIFIER");
  IElementType SCALAR_DEF = new GraphQXLElementType("SCALAR_DEF");
  IElementType SCHEMA_DEF = new GraphQXLElementType("SCHEMA_DEF");
  IElementType SCHEMA_FIELD = new GraphQXLElementType("SCHEMA_FIELD");
  IElementType SCHEMA_KEY = new GraphQXLElementType("SCHEMA_KEY");
  IElementType SCHEMA_SELECTION_SET = new GraphQXLElementType("SCHEMA_SELECTION_SET");
  IElementType SPREAD_REFERENCE = new GraphQXLElementType("SPREAD_REFERENCE");
  IElementType STRING = new GraphQXLElementType("STRING");
  IElementType STRING_DATA = new GraphQXLElementType("STRING_DATA");
  IElementType TYPE_DEF = new GraphQXLElementType("TYPE_DEF");
  IElementType TYPE_SELECTION_SET = new GraphQXLElementType("TYPE_SELECTION_SET");
  IElementType UNION_DEF = new GraphQXLElementType("UNION_DEF");
  IElementType VALUE_ARRAY = new GraphQXLElementType("VALUE_ARRAY");
  IElementType VALUE_BASIC_TYPE = new GraphQXLElementType("VALUE_BASIC_TYPE");
  IElementType VALUE_DATA = new GraphQXLElementType("VALUE_DATA");
  IElementType VALUE_NON_NULLABLE = new GraphQXLElementType("VALUE_NON_NULLABLE");
  IElementType VALUE_TYPE = new GraphQXLElementType("VALUE_TYPE");

  IElementType AMP = new GraphQXLTokenType("&");
  IElementType ANGLE_BRACKET_L = new GraphQXLTokenType("<");
  IElementType ANGLE_BRACKET_R = new GraphQXLTokenType(">");
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
  IElementType DOLLAR_BRACE_L = new GraphQXLTokenType("DOLLAR_BRACE_L");
  IElementType ENUM_KEYWORD = new GraphQXLTokenType("enum");
  IElementType EOL_COMMENT = new GraphQXLTokenType("EOL_COMMENT");
  IElementType EQUALS = new GraphQXLTokenType("=");
  IElementType FLOAT_NUMBER = new GraphQXLTokenType("FLOAT_NUMBER");
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
      if (type == ARGUMENT) {
        return new GraphQXLArgumentImpl(node);
      }
      else if (type == ARGUMENTS) {
        return new GraphQXLArgumentsImpl(node);
      }
      else if (type == BASIC_DATA) {
        return new GraphQXLBasicDataImpl(node);
      }
      else if (type == BASIC_TYPE) {
        return new GraphQXLBasicTypeImpl(node);
      }
      else if (type == BOOLEAN) {
        return new GraphQXLBooleanImpl(node);
      }
      else if (type == BOOLEAN_DATA) {
        return new GraphQXLBooleanDataImpl(node);
      }
      else if (type == CHAR_NO_DOUBLE_QUOTE) {
        return new GraphQXLCharNoDoubleQuoteImpl(node);
      }
      else if (type == DEF) {
        return new GraphQXLDefImpl(node);
      }
      else if (type == DESCRIPTION) {
        return new GraphQXLDescriptionImpl(node);
      }
      else if (type == DESCRIPTION_VARIABLE) {
        return new GraphQXLDescriptionVariableImpl(node);
      }
      else if (type == DESCRIPTION_VARIABLES) {
        return new GraphQXLDescriptionVariablesImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new GraphQXLDirectiveImpl(node);
      }
      else if (type == DIRECTIVE_DEF) {
        return new GraphQXLDirectiveDefImpl(node);
      }
      else if (type == DIRECTIVE_LOCATION) {
        return new GraphQXLDirectiveLocationImpl(node);
      }
      else if (type == DIRECTIVE_REPEATABLE) {
        return new GraphQXLDirectiveRepeatableImpl(node);
      }
      else if (type == ENUM_DEF) {
        return new GraphQXLEnumDefImpl(node);
      }
      else if (type == ENUM_SELECTION_SET) {
        return new GraphQXLEnumSelectionSetImpl(node);
      }
      else if (type == EXPANDABLE_REF) {
        return new GraphQXLExpandableRefImpl(node);
      }
      else if (type == FIELD_WITHOUT_ARGS) {
        return new GraphQXLFieldWithoutArgsImpl(node);
      }
      else if (type == FIELD_WITHOUT_ARGS_WITHOUT_VALUE) {
        return new GraphQXLFieldWithoutArgsWithoutValueImpl(node);
      }
      else if (type == FIELD_WITH_ARGS) {
        return new GraphQXLFieldWithArgsImpl(node);
      }
      else if (type == FILENAME) {
        return new GraphQXLFilenameImpl(node);
      }
      else if (type == FLOAT) {
        return new GraphQXLFloatImpl(node);
      }
      else if (type == FLOAT_DATA) {
        return new GraphQXLFloatDataImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new GraphQXLFunctionCallImpl(node);
      }
      else if (type == FUNCTION_INPUT) {
        return new GraphQXLFunctionInputImpl(node);
      }
      else if (type == GENERIC) {
        return new GraphQXLGenericImpl(node);
      }
      else if (type == GENERIC_CALL) {
        return new GraphQXLGenericCallImpl(node);
      }
      else if (type == GENERIC_INPUT_DEF) {
        return new GraphQXLGenericInputDefImpl(node);
      }
      else if (type == GENERIC_TYPE_DEF) {
        return new GraphQXLGenericTypeDefImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new GraphQXLIdentifierImpl(node);
      }
      else if (type == IMPLEMENTS) {
        return new GraphQXLImplementsImpl(node);
      }
      else if (type == IMPORT) {
        return new GraphQXLImportImpl(node);
      }
      else if (type == INPUT_DEF) {
        return new GraphQXLInputDefImpl(node);
      }
      else if (type == INPUT_SELECTION_SET) {
        return new GraphQXLInputSelectionSetImpl(node);
      }
      else if (type == INT) {
        return new GraphQXLIntImpl(node);
      }
      else if (type == INTERFACE_DEF) {
        return new GraphQXLInterfaceDefImpl(node);
      }
      else if (type == INTERFACE_SELECTION_SET) {
        return new GraphQXLInterfaceSelectionSetImpl(node);
      }
      else if (type == INT_DATA) {
        return new GraphQXLIntDataImpl(node);
      }
      else if (type == LIST_DATA) {
        return new GraphQXLListDataImpl(node);
      }
      else if (type == MODIFIED_REF) {
        return new GraphQXLModifiedRefImpl(node);
      }
      else if (type == MULTILINE_DESCRIPTION) {
        return new GraphQXLMultilineDescriptionImpl(node);
      }
      else if (type == OBJECT) {
        return new GraphQXLObjectImpl(node);
      }
      else if (type == OBJECT_DATA) {
        return new GraphQXLObjectDataImpl(node);
      }
      else if (type == OBJECT_ENTRY) {
        return new GraphQXLObjectEntryImpl(node);
      }
      else if (type == ONE_LINE_DESCRIPTION) {
        return new GraphQXLOneLineDescriptionImpl(node);
      }
      else if (type == OPTIONAL_MODIFIER) {
        return new GraphQXLOptionalModifierImpl(node);
      }
      else if (type == OTHER_IDENTIFIER) {
        return new GraphQXLOtherIdentifierImpl(node);
      }
      else if (type == REQUIRED_MODIFIER) {
        return new GraphQXLRequiredModifierImpl(node);
      }
      else if (type == SCALAR_DEF) {
        return new GraphQXLScalarDefImpl(node);
      }
      else if (type == SCHEMA_DEF) {
        return new GraphQXLSchemaDefImpl(node);
      }
      else if (type == SCHEMA_FIELD) {
        return new GraphQXLSchemaFieldImpl(node);
      }
      else if (type == SCHEMA_KEY) {
        return new GraphQXLSchemaKeyImpl(node);
      }
      else if (type == SCHEMA_SELECTION_SET) {
        return new GraphQXLSchemaSelectionSetImpl(node);
      }
      else if (type == SPREAD_REFERENCE) {
        return new GraphQXLSpreadReferenceImpl(node);
      }
      else if (type == STRING) {
        return new GraphQXLStringImpl(node);
      }
      else if (type == STRING_DATA) {
        return new GraphQXLStringDataImpl(node);
      }
      else if (type == TYPE_DEF) {
        return new GraphQXLTypeDefImpl(node);
      }
      else if (type == TYPE_SELECTION_SET) {
        return new GraphQXLTypeSelectionSetImpl(node);
      }
      else if (type == UNION_DEF) {
        return new GraphQXLUnionDefImpl(node);
      }
      else if (type == VALUE_ARRAY) {
        return new GraphQXLValueArrayImpl(node);
      }
      else if (type == VALUE_BASIC_TYPE) {
        return new GraphQXLValueBasicTypeImpl(node);
      }
      else if (type == VALUE_DATA) {
        return new GraphQXLValueDataImpl(node);
      }
      else if (type == VALUE_NON_NULLABLE) {
        return new GraphQXLValueNonNullableImpl(node);
      }
      else if (type == VALUE_TYPE) {
        return new GraphQXLValueTypeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
