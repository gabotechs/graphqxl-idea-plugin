// This is a generated file. Not intended for manual editing.
package com.github.gabotechs.graphqxlideaplugin.language;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.gabotechs.graphqxlideaplugin.language.psi.GraphQXLTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GraphQXLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType type, PsiBuilder builder) {
    parseLight(type, builder);
    return builder.getTreeBuilt();
  }

  public void parseLight(IElementType type, PsiBuilder builder) {
    boolean result;
    builder = adapt_builder_(type, builder, this, null);
    Marker marker = enter_section_(builder, 0, _COLLAPSE_, null);
    result = parse_root_(type, builder);
    exit_section_(builder, 0, marker, type, result, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType type, PsiBuilder builder) {
    return parse_root_(type, builder, 0);
  }

  static boolean parse_root_(IElementType type, PsiBuilder builder, int level) {
    return document(builder, level + 1);
  }

  /* ********************************************************** */
  // description? identifier COLON value_type (EQUALS value_data)? directive*
  public static boolean argument(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, ARGUMENT, "<argument>");
    result = argument_0(builder, level + 1);
    result = result && identifier(builder, level + 1);
    result = result && consumeToken(builder, COLON);
    result = result && value_type(builder, level + 1);
    result = result && argument_4(builder, level + 1);
    result = result && argument_5(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // description?
  private static boolean argument_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // (EQUALS value_data)?
  private static boolean argument_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_4")) return false;
    argument_4_0(builder, level + 1);
    return true;
  }

  // EQUALS value_data
  private static boolean argument_4_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_4_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, EQUALS);
    result = result && value_data(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // directive*
  private static boolean argument_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_5")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "argument_5", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PAREN_L argument* PAREN_R
  public static boolean arguments(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "arguments")) return false;
    if (!nextTokenIs(builder, PAREN_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, ARGUMENTS, null);
    result = consumeToken(builder, PAREN_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, arguments_1(builder, level + 1));
    result = pinned && consumeToken(builder, PAREN_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // argument*
  private static boolean arguments_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "arguments_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!argument(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "arguments_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // float_data | int_data | string_data | boolean_data
  public static boolean basic_data(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "basic_data")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, BASIC_DATA, "<basic data>");
    result = float_data(builder, level + 1);
    if (!result) result = int_data(builder, level + 1);
    if (!result) result = string_data(builder, level + 1);
    if (!result) result = boolean_data(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // int | float | boolean | string
  public static boolean basic_type(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "basic_type")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, BASIC_TYPE, "<basic type>");
    result = int_$(builder, level + 1);
    if (!result) result = float_$(builder, level + 1);
    if (!result) result = boolean_$(builder, level + 1);
    if (!result) result = string(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // "Boolean"
  public static boolean boolean_$(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "boolean_$")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, BOOLEAN, "<boolean $>");
    result = consumeToken(builder, "Boolean");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // "true" | "false"
  public static boolean boolean_data(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "boolean_data")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, BOOLEAN_DATA, "<boolean data>");
    result = consumeToken(builder, "true");
    if (!result) result = consumeToken(builder, "false");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // REGULAR_STRING_PART
  public static boolean char_no_double_quote(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "char_no_double_quote")) return false;
    if (!nextTokenIs(builder, REGULAR_STRING_PART)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, REGULAR_STRING_PART);
    exit_section_(builder, marker, CHAR_NO_DOUBLE_QUOTE, result);
    return result;
  }

  /* ********************************************************** */
  // schema_def | generic_type_def | type_def | generic_input_def | input_def | enum_def | interface_def | scalar_def | union_def | directive_def
  public static boolean def(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "def")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, DEF, "<def>");
    result = schema_def(builder, level + 1);
    if (!result) result = generic_type_def(builder, level + 1);
    if (!result) result = type_def(builder, level + 1);
    if (!result) result = generic_input_def(builder, level + 1);
    if (!result) result = input_def(builder, level + 1);
    if (!result) result = enum_def(builder, level + 1);
    if (!result) result = interface_def(builder, level + 1);
    if (!result) result = scalar_def(builder, level + 1);
    if (!result) result = union_def(builder, level + 1);
    if (!result) result = directive_def(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // multiline_description | one_line_description
  public static boolean description(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "description")) return false;
    if (!nextTokenIs(builder, "<description>", OPEN_QUOTE, OPEN_TRIPLE_QUOTE)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, DESCRIPTION, "<description>");
    result = multiline_description(builder, level + 1);
    if (!result) result = one_line_description(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // identifier COLON string_data
  public static boolean description_variable(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "description_variable")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, DESCRIPTION_VARIABLE, "<description variable>");
    result = identifier(builder, level + 1);
    pinned = result; // pin = 1
    result = result && report_error_(builder, consumeToken(builder, COLON));
    result = pinned && string_data(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  /* ********************************************************** */
  // DOLLAR_BRACE_L description_variable+ BRACE_R
  public static boolean description_variables(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "description_variables")) return false;
    if (!nextTokenIs(builder, DOLLAR_BRACE_L)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, DOLLAR_BRACE_L);
    result = result && description_variables_1(builder, level + 1);
    result = result && consumeToken(builder, BRACE_R);
    exit_section_(builder, marker, DESCRIPTION_VARIABLES, result);
    return result;
  }

  // description_variable+
  private static boolean description_variables_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "description_variables_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = description_variable(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!description_variable(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "description_variables_1", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // AT identifier function_call?
  public static boolean directive(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directive")) return false;
    if (!nextTokenIs(builder, AT)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, DIRECTIVE, null);
    result = consumeToken(builder, AT);
    pinned = result; // pin = 1
    result = result && report_error_(builder, identifier(builder, level + 1));
    result = pinned && directive_2(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // function_call?
  private static boolean directive_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directive_2")) return false;
    function_call(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // description? DIRECTIVE_KEYWORD AT identifier arguments? directive_repeatable? ON_KEYWORD directive_location (PIPE directive_location)*
  public static boolean directive_def(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directive_def")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, DIRECTIVE_DEF, "<directive def>");
    result = directive_def_0(builder, level + 1);
    result = result && consumeTokens(builder, 1, DIRECTIVE_KEYWORD, AT);
    pinned = result; // pin = 2
    result = result && report_error_(builder, identifier(builder, level + 1));
    result = pinned && report_error_(builder, directive_def_4(builder, level + 1)) && result;
    result = pinned && report_error_(builder, directive_def_5(builder, level + 1)) && result;
    result = pinned && report_error_(builder, consumeToken(builder, ON_KEYWORD)) && result;
    result = pinned && report_error_(builder, directive_location(builder, level + 1)) && result;
    result = pinned && directive_def_8(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean directive_def_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directive_def_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // arguments?
  private static boolean directive_def_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directive_def_4")) return false;
    arguments(builder, level + 1);
    return true;
  }

  // directive_repeatable?
  private static boolean directive_def_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directive_def_5")) return false;
    directive_repeatable(builder, level + 1);
    return true;
  }

  // (PIPE directive_location)*
  private static boolean directive_def_8(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directive_def_8")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive_def_8_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "directive_def_8", pos)) break;
    }
    return true;
  }

  // PIPE directive_location
  private static boolean directive_def_8_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directive_def_8_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, PIPE);
    result = result && directive_location(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // "QUERY" |
  //         "MUTATION" |
  //         "SUBSCRIPTION" |
  //         "FIELD_DEFINITION" |
  //         "FIELD" |
  //         "FRAGMENT_DEFINITION" |
  //         "FRAGMENT_SPREAD" |
  //         "INLINE_FRAGMENT" |
  //         "SCHEMA" |
  //         "SCALAR" |
  //         "OBJECT" |
  //         "ARGUMENT_DEFINITION" |
  //         "INTERFACE" |
  //         "UNION" |
  //         "ENUM_VALUE" |
  //         "ENUM" |
  //         "INPUT_OBJECT" |
  //         "INPUT_FIELD_DEFINITION" |
  //         "VARIABLE_DEFINITION"
  public static boolean directive_location(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directive_location")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, DIRECTIVE_LOCATION, "<directive location>");
    result = consumeToken(builder, "QUERY");
    if (!result) result = consumeToken(builder, "MUTATION");
    if (!result) result = consumeToken(builder, "SUBSCRIPTION");
    if (!result) result = consumeToken(builder, "FIELD_DEFINITION");
    if (!result) result = consumeToken(builder, "FIELD");
    if (!result) result = consumeToken(builder, "FRAGMENT_DEFINITION");
    if (!result) result = consumeToken(builder, "FRAGMENT_SPREAD");
    if (!result) result = consumeToken(builder, "INLINE_FRAGMENT");
    if (!result) result = consumeToken(builder, "SCHEMA");
    if (!result) result = consumeToken(builder, "SCALAR");
    if (!result) result = consumeToken(builder, "OBJECT");
    if (!result) result = consumeToken(builder, "ARGUMENT_DEFINITION");
    if (!result) result = consumeToken(builder, "INTERFACE");
    if (!result) result = consumeToken(builder, "UNION");
    if (!result) result = consumeToken(builder, "ENUM_VALUE");
    if (!result) result = consumeToken(builder, "ENUM");
    if (!result) result = consumeToken(builder, "INPUT_OBJECT");
    if (!result) result = consumeToken(builder, "INPUT_FIELD_DEFINITION");
    if (!result) result = consumeToken(builder, "VARIABLE_DEFINITION");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // REPEATABLE_KEYWORD
  public static boolean directive_repeatable(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directive_repeatable")) return false;
    if (!nextTokenIs(builder, REPEATABLE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, REPEATABLE_KEYWORD);
    exit_section_(builder, marker, DIRECTIVE_REPEATABLE, result);
    return result;
  }

  /* ********************************************************** */
  // import* def*
  static boolean document(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "document")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = document_0(builder, level + 1);
    result = result && document_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // import*
  private static boolean document_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "document_0")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!import_$(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "document_0", pos)) break;
    }
    return true;
  }

  // def*
  private static boolean document_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "document_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!def(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "document_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // description? ENUM_KEYWORD identifier directive* enum_selection_set
  public static boolean enum_def(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_def")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, ENUM_DEF, "<enum def>");
    result = enum_def_0(builder, level + 1);
    result = result && consumeToken(builder, ENUM_KEYWORD);
    pinned = result; // pin = 2
    result = result && report_error_(builder, identifier(builder, level + 1));
    result = pinned && report_error_(builder, enum_def_3(builder, level + 1)) && result;
    result = pinned && enum_selection_set(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean enum_def_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_def_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean enum_def_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_def_3")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "enum_def_3", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // BRACE_L (field_without_args_without_value | spread_reference)* BRACE_R
  public static boolean enum_selection_set(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_selection_set")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, ENUM_SELECTION_SET, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, enum_selection_set_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // (field_without_args_without_value | spread_reference)*
  private static boolean enum_selection_set_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_selection_set_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!enum_selection_set_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "enum_selection_set_1", pos)) break;
    }
    return true;
  }

  // field_without_args_without_value | spread_reference
  private static boolean enum_selection_set_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_selection_set_1_0")) return false;
    boolean result;
    result = field_without_args_without_value(builder, level + 1);
    if (!result) result = spread_reference(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // identifier generic_call?
  public static boolean expandable_ref(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "expandable_ref")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, EXPANDABLE_REF, "<expandable ref>");
    result = identifier(builder, level + 1);
    result = result && expandable_ref_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // generic_call?
  private static boolean expandable_ref_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "expandable_ref_1")) return false;
    generic_call(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // description? identifier arguments? COLON value_type directive*
  public static boolean field_with_args(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_with_args")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, FIELD_WITH_ARGS, "<field with args>");
    result = field_with_args_0(builder, level + 1);
    result = result && identifier(builder, level + 1);
    pinned = result; // pin = 2
    result = result && report_error_(builder, field_with_args_2(builder, level + 1));
    result = pinned && report_error_(builder, consumeToken(builder, COLON)) && result;
    result = pinned && report_error_(builder, value_type(builder, level + 1)) && result;
    result = pinned && field_with_args_5(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean field_with_args_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_with_args_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // arguments?
  private static boolean field_with_args_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_with_args_2")) return false;
    arguments(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean field_with_args_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_with_args_5")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "field_with_args_5", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // description? identifier COLON value_type directive*
  public static boolean field_without_args(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_without_args")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, FIELD_WITHOUT_ARGS, "<field without args>");
    result = field_without_args_0(builder, level + 1);
    result = result && identifier(builder, level + 1);
    pinned = result; // pin = 2
    result = result && report_error_(builder, consumeToken(builder, COLON));
    result = pinned && report_error_(builder, value_type(builder, level + 1)) && result;
    result = pinned && field_without_args_4(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean field_without_args_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_without_args_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean field_without_args_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_without_args_4")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "field_without_args_4", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // description? identifier directive*
  public static boolean field_without_args_without_value(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_without_args_without_value")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, FIELD_WITHOUT_ARGS_WITHOUT_VALUE, "<field without args without value>");
    result = field_without_args_without_value_0(builder, level + 1);
    result = result && identifier(builder, level + 1);
    pinned = result; // pin = 2
    result = result && field_without_args_without_value_2(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean field_without_args_without_value_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_without_args_without_value_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean field_without_args_without_value_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_without_args_without_value_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "field_without_args_without_value_2", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OPEN_QUOTE char_no_double_quote CLOSING_QUOTE
  public static boolean filename(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "filename")) return false;
    if (!nextTokenIs(builder, OPEN_QUOTE)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, FILENAME, null);
    result = consumeToken(builder, OPEN_QUOTE);
    pinned = result; // pin = 1
    result = result && report_error_(builder, char_no_double_quote(builder, level + 1));
    result = pinned && consumeToken(builder, CLOSING_QUOTE) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  /* ********************************************************** */
  // "Float"
  public static boolean float_$(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "float_$")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, FLOAT, "<float $>");
    result = consumeToken(builder, "Float");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // FLOAT_NUMBER
  public static boolean float_data(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "float_data")) return false;
    if (!nextTokenIs(builder, FLOAT_NUMBER)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, FLOAT_NUMBER);
    exit_section_(builder, marker, FLOAT_DATA, result);
    return result;
  }

  /* ********************************************************** */
  // PAREN_L function_input+ PAREN_R
  public static boolean function_call(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "function_call")) return false;
    if (!nextTokenIs(builder, PAREN_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, FUNCTION_CALL, null);
    result = consumeToken(builder, PAREN_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, function_call_1(builder, level + 1));
    result = pinned && consumeToken(builder, PAREN_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // function_input+
  private static boolean function_call_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "function_call_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = function_input(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!function_input(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "function_call_1", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // identifier COLON value_data
  public static boolean function_input(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "function_input")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, FUNCTION_INPUT, "<function input>");
    result = identifier(builder, level + 1);
    pinned = result; // pin = 1
    result = result && report_error_(builder, consumeToken(builder, COLON));
    result = pinned && value_data(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  /* ********************************************************** */
  // ANGLE_BRACKET_L identifier identifier* ANGLE_BRACKET_R
  public static boolean generic(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic")) return false;
    if (!nextTokenIs(builder, ANGLE_BRACKET_L)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, ANGLE_BRACKET_L);
    result = result && identifier(builder, level + 1);
    result = result && generic_2(builder, level + 1);
    result = result && consumeToken(builder, ANGLE_BRACKET_R);
    exit_section_(builder, marker, GENERIC, result);
    return result;
  }

  // identifier*
  private static boolean generic_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!identifier(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "generic_2", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ANGLE_BRACKET_L value_type value_type* ANGLE_BRACKET_R
  public static boolean generic_call(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_call")) return false;
    if (!nextTokenIs(builder, ANGLE_BRACKET_L)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, ANGLE_BRACKET_L);
    result = result && value_type(builder, level + 1);
    result = result && generic_call_2(builder, level + 1);
    result = result && consumeToken(builder, ANGLE_BRACKET_R);
    exit_section_(builder, marker, GENERIC_CALL, result);
    return result;
  }

  // value_type*
  private static boolean generic_call_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_call_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!value_type(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "generic_call_2", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // description_variables? description? INPUT_KEYWORD identifier directive* EQUALS modified_ref
  public static boolean generic_input_def(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_input_def")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, GENERIC_INPUT_DEF, "<generic input def>");
    result = generic_input_def_0(builder, level + 1);
    result = result && generic_input_def_1(builder, level + 1);
    result = result && consumeToken(builder, INPUT_KEYWORD);
    result = result && identifier(builder, level + 1);
    result = result && generic_input_def_4(builder, level + 1);
    result = result && consumeToken(builder, EQUALS);
    pinned = result; // pin = 6
    result = result && modified_ref(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description_variables?
  private static boolean generic_input_def_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_input_def_0")) return false;
    description_variables(builder, level + 1);
    return true;
  }

  // description?
  private static boolean generic_input_def_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_input_def_1")) return false;
    description(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean generic_input_def_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_input_def_4")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "generic_input_def_4", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // description_variables? description? TYPE_KEYWORD identifier directive* EQUALS modified_ref
  public static boolean generic_type_def(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_type_def")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, GENERIC_TYPE_DEF, "<generic type def>");
    result = generic_type_def_0(builder, level + 1);
    result = result && generic_type_def_1(builder, level + 1);
    result = result && consumeToken(builder, TYPE_KEYWORD);
    result = result && identifier(builder, level + 1);
    result = result && generic_type_def_4(builder, level + 1);
    result = result && consumeToken(builder, EQUALS);
    pinned = result; // pin = 6
    result = result && modified_ref(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description_variables?
  private static boolean generic_type_def_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_type_def_0")) return false;
    description_variables(builder, level + 1);
    return true;
  }

  // description?
  private static boolean generic_type_def_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_type_def_1")) return false;
    description(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean generic_type_def_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_type_def_4")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "generic_type_def_4", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NAME |
  //     IMPORT_KEYWORD |
  //     QUERY_KEYWORD |
  //     MUTATION_KEYWORD |
  //     SUBSCRIPTION_KEYWORD |
  //     ON_KEYWORD |
  //     SCHEMA_KEYWORD |
  //     TYPE_KEYWORD |
  //     SCALAR_KEYWORD |
  //     INTERFACE_KEYWORD |
  //     IMPLEMENTS_KEYWORD |
  //     ENUM_KEYWORD |
  //     UNION_KEYWORD |
  //     INPUT_KEYWORD |
  //     DIRECTIVE_KEYWORD |
  //     REPEATABLE_KEYWORD
  public static boolean identifier(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identifier")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, IDENTIFIER, "<identifier>");
    result = consumeToken(builder, NAME);
    if (!result) result = consumeToken(builder, IMPORT_KEYWORD);
    if (!result) result = consumeToken(builder, QUERY_KEYWORD);
    if (!result) result = consumeToken(builder, MUTATION_KEYWORD);
    if (!result) result = consumeToken(builder, SUBSCRIPTION_KEYWORD);
    if (!result) result = consumeToken(builder, ON_KEYWORD);
    if (!result) result = consumeToken(builder, SCHEMA_KEYWORD);
    if (!result) result = consumeToken(builder, TYPE_KEYWORD);
    if (!result) result = consumeToken(builder, SCALAR_KEYWORD);
    if (!result) result = consumeToken(builder, INTERFACE_KEYWORD);
    if (!result) result = consumeToken(builder, IMPLEMENTS_KEYWORD);
    if (!result) result = consumeToken(builder, ENUM_KEYWORD);
    if (!result) result = consumeToken(builder, UNION_KEYWORD);
    if (!result) result = consumeToken(builder, INPUT_KEYWORD);
    if (!result) result = consumeToken(builder, DIRECTIVE_KEYWORD);
    if (!result) result = consumeToken(builder, REPEATABLE_KEYWORD);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // IMPLEMENTS_KEYWORD identifier (AMP identifier)*
  public static boolean implements_$(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "implements_$")) return false;
    if (!nextTokenIs(builder, IMPLEMENTS_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, IMPLEMENTS_KEYWORD);
    result = result && identifier(builder, level + 1);
    result = result && implements_2(builder, level + 1);
    exit_section_(builder, marker, IMPLEMENTS, result);
    return result;
  }

  // (AMP identifier)*
  private static boolean implements_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "implements_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!implements_2_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "implements_2", pos)) break;
    }
    return true;
  }

  // AMP identifier
  private static boolean implements_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "implements_2_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, AMP);
    result = result && identifier(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // IMPORT_KEYWORD filename
  public static boolean import_$(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "import_$")) return false;
    if (!nextTokenIs(builder, IMPORT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, IMPORT_KEYWORD);
    result = result && filename(builder, level + 1);
    exit_section_(builder, marker, IMPORT, result);
    return result;
  }

  /* ********************************************************** */
  // description_variables? description? INPUT_KEYWORD identifier generic? directive* input_selection_set
  public static boolean input_def(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "input_def")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, INPUT_DEF, "<input def>");
    result = input_def_0(builder, level + 1);
    result = result && input_def_1(builder, level + 1);
    result = result && consumeToken(builder, INPUT_KEYWORD);
    pinned = result; // pin = 3
    result = result && report_error_(builder, identifier(builder, level + 1));
    result = pinned && report_error_(builder, input_def_4(builder, level + 1)) && result;
    result = pinned && report_error_(builder, input_def_5(builder, level + 1)) && result;
    result = pinned && input_selection_set(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description_variables?
  private static boolean input_def_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "input_def_0")) return false;
    description_variables(builder, level + 1);
    return true;
  }

  // description?
  private static boolean input_def_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "input_def_1")) return false;
    description(builder, level + 1);
    return true;
  }

  // generic?
  private static boolean input_def_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "input_def_4")) return false;
    generic(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean input_def_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "input_def_5")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "input_def_5", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // BRACE_L (field_without_args | spread_reference)* BRACE_R
  public static boolean input_selection_set(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "input_selection_set")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, INPUT_SELECTION_SET, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, input_selection_set_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // (field_without_args | spread_reference)*
  private static boolean input_selection_set_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "input_selection_set_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!input_selection_set_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "input_selection_set_1", pos)) break;
    }
    return true;
  }

  // field_without_args | spread_reference
  private static boolean input_selection_set_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "input_selection_set_1_0")) return false;
    boolean result;
    result = field_without_args(builder, level + 1);
    if (!result) result = spread_reference(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // "Int"
  public static boolean int_$(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "int_$")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, INT, "<int $>");
    result = consumeToken(builder, "Int");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean int_data(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "int_data")) return false;
    if (!nextTokenIs(builder, NUMBER)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, NUMBER);
    exit_section_(builder, marker, INT_DATA, result);
    return result;
  }

  /* ********************************************************** */
  // description? INTERFACE_KEYWORD identifier implements? directive* interface_selection_set
  public static boolean interface_def(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interface_def")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, INTERFACE_DEF, "<interface def>");
    result = interface_def_0(builder, level + 1);
    result = result && consumeToken(builder, INTERFACE_KEYWORD);
    pinned = result; // pin = 2
    result = result && report_error_(builder, identifier(builder, level + 1));
    result = pinned && report_error_(builder, interface_def_3(builder, level + 1)) && result;
    result = pinned && report_error_(builder, interface_def_4(builder, level + 1)) && result;
    result = pinned && interface_selection_set(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean interface_def_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interface_def_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // implements?
  private static boolean interface_def_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interface_def_3")) return false;
    implements_$(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean interface_def_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interface_def_4")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "interface_def_4", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // BRACE_L (field_without_args | spread_reference)* BRACE_R
  public static boolean interface_selection_set(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interface_selection_set")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, INTERFACE_SELECTION_SET, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, interface_selection_set_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // (field_without_args | spread_reference)*
  private static boolean interface_selection_set_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interface_selection_set_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!interface_selection_set_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "interface_selection_set_1", pos)) break;
    }
    return true;
  }

  // field_without_args | spread_reference
  private static boolean interface_selection_set_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interface_selection_set_1_0")) return false;
    boolean result;
    result = field_without_args(builder, level + 1);
    if (!result) result = spread_reference(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // BRACKET_L (basic_data | list_data | object_data) BRACKET_R
  public static boolean list_data(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "list_data")) return false;
    if (!nextTokenIs(builder, BRACKET_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, LIST_DATA, null);
    result = consumeToken(builder, BRACKET_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, list_data_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACKET_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // basic_data | list_data | object_data
  private static boolean list_data_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "list_data_1")) return false;
    boolean result;
    result = basic_data(builder, level + 1);
    if (!result) result = list_data(builder, level + 1);
    if (!result) result = object_data(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // (required_modifier ANGLE_BRACKET_L modified_ref ANGLE_BRACKET_R) |
  //     (optional_modifier ANGLE_BRACKET_L modified_ref ANGLE_BRACKET_R) |
  //     expandable_ref
  public static boolean modified_ref(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "modified_ref")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, MODIFIED_REF, "<modified ref>");
    result = modified_ref_0(builder, level + 1);
    if (!result) result = modified_ref_1(builder, level + 1);
    if (!result) result = expandable_ref(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // required_modifier ANGLE_BRACKET_L modified_ref ANGLE_BRACKET_R
  private static boolean modified_ref_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "modified_ref_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = required_modifier(builder, level + 1);
    result = result && consumeToken(builder, ANGLE_BRACKET_L);
    result = result && modified_ref(builder, level + 1);
    result = result && consumeToken(builder, ANGLE_BRACKET_R);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // optional_modifier ANGLE_BRACKET_L modified_ref ANGLE_BRACKET_R
  private static boolean modified_ref_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "modified_ref_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = optional_modifier(builder, level + 1);
    result = result && consumeToken(builder, ANGLE_BRACKET_L);
    result = result && modified_ref(builder, level + 1);
    result = result && consumeToken(builder, ANGLE_BRACKET_R);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // OPEN_TRIPLE_QUOTE REGULAR_STRING_PART* CLOSING_TRIPLE_QUOTE
  public static boolean multiline_description(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "multiline_description")) return false;
    if (!nextTokenIs(builder, OPEN_TRIPLE_QUOTE)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, MULTILINE_DESCRIPTION, null);
    result = consumeToken(builder, OPEN_TRIPLE_QUOTE);
    pinned = result; // pin = 1
    result = result && report_error_(builder, multiline_description_1(builder, level + 1));
    result = pinned && consumeToken(builder, CLOSING_TRIPLE_QUOTE) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // REGULAR_STRING_PART*
  private static boolean multiline_description_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "multiline_description_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!consumeToken(builder, REGULAR_STRING_PART)) break;
      if (!empty_element_parsed_guard_(builder, "multiline_description_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // !(basic_type) identifier
  public static boolean object(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "object")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, OBJECT, "<object>");
    result = object_0(builder, level + 1);
    result = result && identifier(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // !(basic_type)
  private static boolean object_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "object_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !object_0_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // (basic_type)
  private static boolean object_0_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "object_0_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = basic_type(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // BRACE_L object_entry* BRACE_R
  public static boolean object_data(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "object_data")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, OBJECT_DATA, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, object_data_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // object_entry*
  private static boolean object_data_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "object_data_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!object_entry(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "object_data_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier COLON (basic_data | list_data | object_data)
  public static boolean object_entry(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "object_entry")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, OBJECT_ENTRY, "<object entry>");
    result = identifier(builder, level + 1);
    result = result && consumeToken(builder, COLON);
    result = result && object_entry_2(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // basic_data | list_data | object_data
  private static boolean object_entry_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "object_entry_2")) return false;
    boolean result;
    result = basic_data(builder, level + 1);
    if (!result) result = list_data(builder, level + 1);
    if (!result) result = object_data(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // OPEN_QUOTE REGULAR_STRING_PART? CLOSING_QUOTE
  public static boolean one_line_description(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "one_line_description")) return false;
    if (!nextTokenIs(builder, OPEN_QUOTE)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, ONE_LINE_DESCRIPTION, null);
    result = consumeToken(builder, OPEN_QUOTE);
    pinned = result; // pin = 1
    result = result && report_error_(builder, one_line_description_1(builder, level + 1));
    result = pinned && consumeToken(builder, CLOSING_QUOTE) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // REGULAR_STRING_PART?
  private static boolean one_line_description_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "one_line_description_1")) return false;
    consumeToken(builder, REGULAR_STRING_PART);
    return true;
  }

  /* ********************************************************** */
  // "Optional"
  public static boolean optional_modifier(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "optional_modifier")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, OPTIONAL_MODIFIER, "<optional modifier>");
    result = consumeToken(builder, "Optional");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // identifier
  public static boolean other_identifier(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "other_identifier")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, OTHER_IDENTIFIER, "<other identifier>");
    result = identifier(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // "Required"
  public static boolean required_modifier(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "required_modifier")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, REQUIRED_MODIFIER, "<required modifier>");
    result = consumeToken(builder, "Required");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // description? SCALAR_KEYWORD identifier directive*
  public static boolean scalar_def(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "scalar_def")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, SCALAR_DEF, "<scalar def>");
    result = scalar_def_0(builder, level + 1);
    result = result && consumeToken(builder, SCALAR_KEYWORD);
    pinned = result; // pin = 2
    result = result && report_error_(builder, identifier(builder, level + 1));
    result = pinned && scalar_def_3(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean scalar_def_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "scalar_def_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean scalar_def_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "scalar_def_3")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "scalar_def_3", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // description? SCHEMA_KEYWORD directive* schema_selection_set
  public static boolean schema_def(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "schema_def")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, SCHEMA_DEF, "<schema def>");
    result = schema_def_0(builder, level + 1);
    result = result && consumeToken(builder, SCHEMA_KEYWORD);
    pinned = result; // pin = 2
    result = result && report_error_(builder, schema_def_2(builder, level + 1));
    result = pinned && schema_selection_set(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean schema_def_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "schema_def_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean schema_def_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "schema_def_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "schema_def_2", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // schema_key COLON identifier
  public static boolean schema_field(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "schema_field")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, SCHEMA_FIELD, "<schema field>");
    result = schema_key(builder, level + 1);
    result = result && consumeToken(builder, COLON);
    result = result && identifier(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // QUERY_KEYWORD | MUTATION_KEYWORD | SUBSCRIPTION_KEYWORD
  public static boolean schema_key(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "schema_key")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, SCHEMA_KEY, "<schema key>");
    result = consumeToken(builder, QUERY_KEYWORD);
    if (!result) result = consumeToken(builder, MUTATION_KEYWORD);
    if (!result) result = consumeToken(builder, SUBSCRIPTION_KEYWORD);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // BRACE_L schema_field BRACE_R
  public static boolean schema_selection_set(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "schema_selection_set")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, SCHEMA_SELECTION_SET, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, schema_field(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  /* ********************************************************** */
  // SPREAD modified_ref
  public static boolean spread_reference(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "spread_reference")) return false;
    if (!nextTokenIs(builder, SPREAD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, SPREAD);
    result = result && modified_ref(builder, level + 1);
    exit_section_(builder, marker, SPREAD_REFERENCE, result);
    return result;
  }

  /* ********************************************************** */
  // "String"
  public static boolean string(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "string")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, STRING, "<string>");
    result = consumeToken(builder, "String");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // OPEN_QUOTE REGULAR_STRING_PART? CLOSING_QUOTE
  public static boolean string_data(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "string_data")) return false;
    if (!nextTokenIs(builder, OPEN_QUOTE)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, OPEN_QUOTE);
    result = result && string_data_1(builder, level + 1);
    result = result && consumeToken(builder, CLOSING_QUOTE);
    exit_section_(builder, marker, STRING_DATA, result);
    return result;
  }

  // REGULAR_STRING_PART?
  private static boolean string_data_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "string_data_1")) return false;
    consumeToken(builder, REGULAR_STRING_PART);
    return true;
  }

  /* ********************************************************** */
  // description_variables? description? TYPE_KEYWORD identifier generic? implements? directive* type_selection_set
  public static boolean type_def(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_def")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, TYPE_DEF, "<type def>");
    result = type_def_0(builder, level + 1);
    result = result && type_def_1(builder, level + 1);
    result = result && consumeToken(builder, TYPE_KEYWORD);
    pinned = result; // pin = 3
    result = result && report_error_(builder, identifier(builder, level + 1));
    result = pinned && report_error_(builder, type_def_4(builder, level + 1)) && result;
    result = pinned && report_error_(builder, type_def_5(builder, level + 1)) && result;
    result = pinned && report_error_(builder, type_def_6(builder, level + 1)) && result;
    result = pinned && type_selection_set(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description_variables?
  private static boolean type_def_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_def_0")) return false;
    description_variables(builder, level + 1);
    return true;
  }

  // description?
  private static boolean type_def_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_def_1")) return false;
    description(builder, level + 1);
    return true;
  }

  // generic?
  private static boolean type_def_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_def_4")) return false;
    generic(builder, level + 1);
    return true;
  }

  // implements?
  private static boolean type_def_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_def_5")) return false;
    implements_$(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean type_def_6(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_def_6")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "type_def_6", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // BRACE_L (field_with_args | spread_reference)* BRACE_R
  public static boolean type_selection_set(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_selection_set")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, TYPE_SELECTION_SET, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, type_selection_set_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // (field_with_args | spread_reference)*
  private static boolean type_selection_set_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_selection_set_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!type_selection_set_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "type_selection_set_1", pos)) break;
    }
    return true;
  }

  // field_with_args | spread_reference
  private static boolean type_selection_set_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_selection_set_1_0")) return false;
    boolean result;
    result = field_with_args(builder, level + 1);
    if (!result) result = spread_reference(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // description? UNION_KEYWORD identifier directive* EQUALS other_identifier (PIPE other_identifier)*
  public static boolean union_def(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "union_def")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, UNION_DEF, "<union def>");
    result = union_def_0(builder, level + 1);
    result = result && consumeToken(builder, UNION_KEYWORD);
    pinned = result; // pin = 2
    result = result && report_error_(builder, identifier(builder, level + 1));
    result = pinned && report_error_(builder, union_def_3(builder, level + 1)) && result;
    result = pinned && report_error_(builder, consumeToken(builder, EQUALS)) && result;
    result = pinned && report_error_(builder, other_identifier(builder, level + 1)) && result;
    result = pinned && union_def_6(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean union_def_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "union_def_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // directive*
  private static boolean union_def_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "union_def_3")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "union_def_3", pos)) break;
    }
    return true;
  }

  // (PIPE other_identifier)*
  private static boolean union_def_6(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "union_def_6")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!union_def_6_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "union_def_6", pos)) break;
    }
    return true;
  }

  // PIPE other_identifier
  private static boolean union_def_6_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "union_def_6_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, PIPE);
    result = result && other_identifier(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // BRACKET_L (value_non_nullable | value_array | value_basic_type) BRACKET_R
  public static boolean value_array(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "value_array")) return false;
    if (!nextTokenIs(builder, BRACKET_L)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, BRACKET_L);
    result = result && value_array_1(builder, level + 1);
    result = result && consumeToken(builder, BRACKET_R);
    exit_section_(builder, marker, VALUE_ARRAY, result);
    return result;
  }

  // value_non_nullable | value_array | value_basic_type
  private static boolean value_array_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "value_array_1")) return false;
    boolean result;
    result = value_non_nullable(builder, level + 1);
    if (!result) result = value_array(builder, level + 1);
    if (!result) result = value_basic_type(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // object | basic_type
  public static boolean value_basic_type(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "value_basic_type")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, VALUE_BASIC_TYPE, "<value basic type>");
    result = object(builder, level + 1);
    if (!result) result = basic_type(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // object_data | list_data | basic_data
  public static boolean value_data(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "value_data")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, VALUE_DATA, "<value data>");
    result = object_data(builder, level + 1);
    if (!result) result = list_data(builder, level + 1);
    if (!result) result = basic_data(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // (value_basic_type | value_array) BANG
  public static boolean value_non_nullable(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "value_non_nullable")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, VALUE_NON_NULLABLE, "<value non nullable>");
    result = value_non_nullable_0(builder, level + 1);
    result = result && consumeToken(builder, BANG);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // value_basic_type | value_array
  private static boolean value_non_nullable_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "value_non_nullable_0")) return false;
    boolean result;
    result = value_basic_type(builder, level + 1);
    if (!result) result = value_array(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // value_non_nullable | value_array | value_basic_type
  public static boolean value_type(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "value_type")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, VALUE_TYPE, "<value type>");
    result = value_non_nullable(builder, level + 1);
    if (!result) result = value_array(builder, level + 1);
    if (!result) result = value_basic_type(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

}
