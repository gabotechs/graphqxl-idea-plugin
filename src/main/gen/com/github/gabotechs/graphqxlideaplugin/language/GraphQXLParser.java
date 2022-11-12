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
    builder = adapt_builder_(type, builder, this, EXTENDS_SETS_);
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

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(BLOCK_STRING, QUOTED_STRING, STRING_LITERAL),
    create_token_set_(LIST_TYPE, NON_NULL_TYPE, TYPE, TYPE_NAME,
      TYPE_NAME_DEFINITION),
    create_token_set_(ARRAY_VALUE, BOOLEAN_VALUE, ENUM_VALUE, FLOAT_VALUE,
      INT_VALUE, NULL_VALUE, OBJECT_VALUE, STRING_VALUE,
      VALUE),
    create_token_set_(DEFINITION, DIRECTIVE_DEFINITION, ENUM_TYPE_DEFINITION, GENERIC_INPUT_OBJECT_TYPE_DEFINITION,
      GENERIC_OBJECT_TYPE_DEFINITION, INPUT_OBJECT_TYPE_DEFINITION, INTERFACE_TYPE_DEFINITION, OBJECT_TYPE_DEFINITION,
      SCALAR_TYPE_DEFINITION, SCHEMA_DEFINITION, TYPE_DEFINITION, TYPE_SYSTEM_DEFINITION,
      UNION_TYPE_DEFINITION),
  };

  /* ********************************************************** */
  // identifier ':'
  public static boolean alias(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "alias")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, ALIAS, "<alias>");
    result = identifier(builder, level + 1);
    result = result && consumeToken(builder, COLON);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // '&'? typeName
  static boolean ampTypeName(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ampTypeName")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = ampTypeName_0(builder, level + 1);
    result = result && typeName(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // '&'?
  private static boolean ampTypeName_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ampTypeName_0")) return false;
    consumeToken(builder, AMP);
    return true;
  }

  /* ********************************************************** */
  // identifier ':' value
  public static boolean argument(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, ARGUMENT, "<argument>");
    result = identifier(builder, level + 1);
    pinned = result; // pin = 1
    result = result && report_error_(builder, consumeToken(builder, COLON));
    result = pinned && value(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, GraphQXLParser::argument_recover);
    return result || pinned;
  }

  /* ********************************************************** */
  // !(')' | argument)
  static boolean argument_recover(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_recover")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !argument_recover_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // ')' | argument
  private static boolean argument_recover_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_recover_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, PAREN_R);
    if (!result) result = argument(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // '(' argument+ ')'
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

  // argument+
  private static boolean arguments_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "arguments_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = argument(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!argument(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "arguments_1", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // '(' inputValueDefinition+ ')'
  public static boolean argumentsDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argumentsDefinition")) return false;
    if (!nextTokenIs(builder, PAREN_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, ARGUMENTS_DEFINITION, null);
    result = consumeToken(builder, PAREN_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, argumentsDefinition_1(builder, level + 1));
    result = pinned && consumeToken(builder, PAREN_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // inputValueDefinition+
  private static boolean argumentsDefinition_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argumentsDefinition_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = inputValueDefinition(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!inputValueDefinition(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "argumentsDefinition_1", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // '[' arrayValueElement* ']'
  public static boolean arrayValue(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "arrayValue")) return false;
    if (!nextTokenIs(builder, BRACKET_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, ARRAY_VALUE, null);
    result = consumeToken(builder, BRACKET_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, arrayValue_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACKET_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // arrayValueElement*
  private static boolean arrayValue_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "arrayValue_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!arrayValueElement(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "arrayValue_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // value
  static boolean arrayValueElement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "arrayValueElement")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_);
    result = value(builder, level + 1);
    exit_section_(builder, level, marker, result, false, GraphQXLParser::arrayValueElement_recover);
    return result;
  }

  /* ********************************************************** */
  // !(']'| value)
  static boolean arrayValueElement_recover(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "arrayValueElement_recover")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !arrayValueElement_recover_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // ']'| value
  private static boolean arrayValueElement_recover_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "arrayValueElement_recover_0")) return false;
    boolean result;
    result = consumeToken(builder, BRACKET_R);
    if (!result) result = value(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // OPEN_TRIPLE_QUOTE REGULAR_STRING_PART* CLOSING_TRIPLE_QUOTE
  public static boolean blockString(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "blockString")) return false;
    if (!nextTokenIs(builder, OPEN_TRIPLE_QUOTE)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, BLOCK_STRING, null);
    result = consumeToken(builder, OPEN_TRIPLE_QUOTE);
    pinned = result; // pin = 1
    result = result && report_error_(builder, blockString_1(builder, level + 1));
    result = pinned && consumeToken(builder, CLOSING_TRIPLE_QUOTE) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // REGULAR_STRING_PART*
  private static boolean blockString_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "blockString_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!consumeToken(builder, REGULAR_STRING_PART)) break;
      if (!empty_element_parsed_guard_(builder, "blockString_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'true' | 'false'
  public static boolean booleanValue(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "booleanValue")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, BOOLEAN_VALUE, "<boolean value>");
    result = consumeToken(builder, "true");
    if (!result) result = consumeToken(builder, "false");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // '=' value
  public static boolean defaultValue(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "defaultValue")) return false;
    if (!nextTokenIs(builder, EQUALS)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, DEFAULT_VALUE, null);
    result = consumeToken(builder, EQUALS);
    pinned = result; // pin = 1
    result = result && value(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  /* ********************************************************** */
  // typeSystemDefinition
  public static boolean definition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "definition")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _COLLAPSE_, DEFINITION, "<definition>");
    result = typeSystemDefinition(builder, level + 1);
    exit_section_(builder, level, marker, result, false, GraphQXLParser::definition_recover);
    return result;
  }

  /* ********************************************************** */
  // 'schema' | 'type' | 'interface' | 'input' | 'enum' | 'union' | 'scalar' | 'directive'
  static boolean definition_keywords(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "definition_keywords")) return false;
    boolean result;
    result = consumeToken(builder, SCHEMA_KEYWORD);
    if (!result) result = consumeToken(builder, TYPE_KEYWORD);
    if (!result) result = consumeToken(builder, INTERFACE_KEYWORD);
    if (!result) result = consumeToken(builder, INPUT_KEYWORD);
    if (!result) result = consumeToken(builder, ENUM_KEYWORD);
    if (!result) result = consumeToken(builder, UNION_KEYWORD);
    if (!result) result = consumeToken(builder, SCALAR_KEYWORD);
    if (!result) result = consumeToken(builder, DIRECTIVE_KEYWORD);
    return result;
  }

  /* ********************************************************** */
  // !(root_tokens | NAME)
  static boolean definition_recover(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "definition_recover")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !definition_recover_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // root_tokens | NAME
  private static boolean definition_recover_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "definition_recover_0")) return false;
    boolean result;
    result = root_tokens(builder, level + 1);
    if (!result) result = consumeToken(builder, NAME);
    return result;
  }

  /* ********************************************************** */
  // stringLiteral
  public static boolean description(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "description")) return false;
    if (!nextTokenIs(builder, "<description>", OPEN_QUOTE, OPEN_TRIPLE_QUOTE)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, DESCRIPTION, "<description>");
    result = stringLiteral(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // identifier ':' quotedString
  public static boolean description_variable(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "description_variable")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, DESCRIPTION_VARIABLE, "<description variable>");
    result = identifier(builder, level + 1);
    pinned = result; // pin = 1
    result = result && report_error_(builder, consumeToken(builder, COLON));
    result = pinned && quotedString(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  /* ********************************************************** */
  // DOLLAR_BRACE_L description_variable+ BRACE_R
  public static boolean description_variables(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "description_variables")) return false;
    if (!nextTokenIs(builder, DOLLAR_BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, DESCRIPTION_VARIABLES, null);
    result = consumeToken(builder, DOLLAR_BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, description_variables_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
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
  // '@' identifier arguments?
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

  // arguments?
  private static boolean directive_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directive_2")) return false;
    arguments(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // description? 'directive' '@' identifier argumentsDefinition? 'repeatable'? 'on' directiveLocations
  public static boolean directiveDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directiveDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, DIRECTIVE_DEFINITION, "<directive definition>");
    result = directiveDefinition_0(builder, level + 1);
    result = result && consumeTokens(builder, 1, DIRECTIVE_KEYWORD, AT);
    pinned = result; // pin = 2
    result = result && report_error_(builder, identifier(builder, level + 1));
    result = pinned && report_error_(builder, directiveDefinition_4(builder, level + 1)) && result;
    result = pinned && report_error_(builder, directiveDefinition_5(builder, level + 1)) && result;
    result = pinned && report_error_(builder, consumeToken(builder, ON_KEYWORD)) && result;
    result = pinned && directiveLocations(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean directiveDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directiveDefinition_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // argumentsDefinition?
  private static boolean directiveDefinition_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directiveDefinition_4")) return false;
    argumentsDefinition(builder, level + 1);
    return true;
  }

  // 'repeatable'?
  private static boolean directiveDefinition_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directiveDefinition_5")) return false;
    consumeToken(builder, REPEATABLE_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // 'QUERY' | 'MUTATION' | 'SUBSCRIPTION' | 'FIELD' | 'FRAGMENT_DEFINITION' | 'FRAGMENT_SPREAD' | 'INLINE_FRAGMENT' |
  //   'SCHEMA' | 'SCALAR' | 'OBJECT' | 'FIELD_DEFINITION' | 'ARGUMENT_DEFINITION' | 'INTERFACE' | 'UNION' | 'ENUM' |
  //   'ENUM_VALUE' | 'INPUT_OBJECT' | 'INPUT_FIELD_DEFINITION' | NAME
  public static boolean directiveLocation(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directiveLocation")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, DIRECTIVE_LOCATION, "<directive location>");
    result = consumeToken(builder, "QUERY");
    if (!result) result = consumeToken(builder, "MUTATION");
    if (!result) result = consumeToken(builder, "SUBSCRIPTION");
    if (!result) result = consumeToken(builder, "FIELD");
    if (!result) result = consumeToken(builder, "FRAGMENT_DEFINITION");
    if (!result) result = consumeToken(builder, "FRAGMENT_SPREAD");
    if (!result) result = consumeToken(builder, "INLINE_FRAGMENT");
    if (!result) result = consumeToken(builder, "SCHEMA");
    if (!result) result = consumeToken(builder, "SCALAR");
    if (!result) result = consumeToken(builder, "OBJECT");
    if (!result) result = consumeToken(builder, "FIELD_DEFINITION");
    if (!result) result = consumeToken(builder, "ARGUMENT_DEFINITION");
    if (!result) result = consumeToken(builder, "INTERFACE");
    if (!result) result = consumeToken(builder, "UNION");
    if (!result) result = consumeToken(builder, "ENUM");
    if (!result) result = consumeToken(builder, "ENUM_VALUE");
    if (!result) result = consumeToken(builder, "INPUT_OBJECT");
    if (!result) result = consumeToken(builder, "INPUT_FIELD_DEFINITION");
    if (!result) result = consumeToken(builder, NAME);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // '|'? directiveLocation pipeDirectiveLocation*
  public static boolean directiveLocations(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directiveLocations")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, DIRECTIVE_LOCATIONS, "<directive locations>");
    result = directiveLocations_0(builder, level + 1);
    result = result && directiveLocation(builder, level + 1);
    result = result && directiveLocations_2(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // '|'?
  private static boolean directiveLocations_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directiveLocations_0")) return false;
    consumeToken(builder, PIPE);
    return true;
  }

  // pipeDirectiveLocation*
  private static boolean directiveLocations_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directiveLocations_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!pipeDirectiveLocation(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "directiveLocations_2", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // directive+
  static boolean directives(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "directives")) return false;
    if (!nextTokenIs(builder, AT)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = directive(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!directive(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "directives", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // import* definition*
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

  // definition*
  private static boolean document_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "document_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!definition(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "document_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // description? 'enum' typeNameDefinition directives? enumValueDefinitions?
  public static boolean enumTypeDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumTypeDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, ENUM_TYPE_DEFINITION, "<enum type definition>");
    result = enumTypeDefinition_0(builder, level + 1);
    result = result && consumeToken(builder, ENUM_KEYWORD);
    pinned = result; // pin = 2
    result = result && report_error_(builder, typeNameDefinition(builder, level + 1));
    result = pinned && report_error_(builder, enumTypeDefinition_3(builder, level + 1)) && result;
    result = pinned && enumTypeDefinition_4(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean enumTypeDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumTypeDefinition_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean enumTypeDefinition_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumTypeDefinition_3")) return false;
    directives(builder, level + 1);
    return true;
  }

  // enumValueDefinitions?
  private static boolean enumTypeDefinition_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumTypeDefinition_4")) return false;
    enumValueDefinitions(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean enumValue(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumValue")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, ENUM_VALUE, "<enum value>");
    result = identifier(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // description? enumValue directives?
  public static boolean enumValueDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumValueDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, ENUM_VALUE_DEFINITION, "<enum value definition>");
    result = enumValueDefinition_0(builder, level + 1);
    result = result && enumValue(builder, level + 1);
    pinned = result; // pin = 2
    result = result && enumValueDefinition_2(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, GraphQXLParser::enumValueDefinition_recover);
    return result || pinned;
  }

  // description?
  private static boolean enumValueDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumValueDefinition_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean enumValueDefinition_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumValueDefinition_2")) return false;
    directives(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // !('}' | enumValueDefinition | root_tokens)
  static boolean enumValueDefinition_recover(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumValueDefinition_recover")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !enumValueDefinition_recover_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // '}' | enumValueDefinition | root_tokens
  private static boolean enumValueDefinition_recover_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumValueDefinition_recover_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, BRACE_R);
    if (!result) result = enumValueDefinition(builder, level + 1);
    if (!result) result = root_tokens(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // '{' enumValueDefinition+ '}'
  public static boolean enumValueDefinitions(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumValueDefinitions")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, ENUM_VALUE_DEFINITIONS, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, enumValueDefinitions_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // enumValueDefinition+
  private static boolean enumValueDefinitions_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enumValueDefinitions_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = enumValueDefinition(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!enumValueDefinition(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "enumValueDefinitions_1", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // identifier generic_call?
  public static boolean expandable_ref(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "expandable_ref")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, EXPANDABLE_REF, "<expandable ref>");
    result = identifier(builder, level + 1);
    pinned = result; // pin = 1
    result = result && expandable_ref_1(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // generic_call?
  private static boolean expandable_ref_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "expandable_ref_1")) return false;
    generic_call(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // alias? identifier arguments? directives? selectionSet?
  public static boolean field(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, FIELD, "<field>");
    result = field_0(builder, level + 1);
    result = result && identifier(builder, level + 1);
    result = result && field_2(builder, level + 1);
    result = result && field_3(builder, level + 1);
    result = result && field_4(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // alias?
  private static boolean field_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_0")) return false;
    alias(builder, level + 1);
    return true;
  }

  // arguments?
  private static boolean field_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_2")) return false;
    arguments(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean field_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_3")) return false;
    directives(builder, level + 1);
    return true;
  }

  // selectionSet?
  private static boolean field_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "field_4")) return false;
    selectionSet(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // description? identifier argumentsDefinition? ':' type directives?
  public static boolean fieldDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fieldDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, FIELD_DEFINITION, "<field definition>");
    result = fieldDefinition_0(builder, level + 1);
    result = result && identifier(builder, level + 1);
    pinned = result; // pin = 2
    result = result && report_error_(builder, fieldDefinition_2(builder, level + 1));
    result = pinned && report_error_(builder, consumeToken(builder, COLON)) && result;
    result = pinned && report_error_(builder, type(builder, level + 1)) && result;
    result = pinned && fieldDefinition_5(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, GraphQXLParser::fieldDefinition_recover);
    return result || pinned;
  }

  // description?
  private static boolean fieldDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fieldDefinition_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // argumentsDefinition?
  private static boolean fieldDefinition_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fieldDefinition_2")) return false;
    argumentsDefinition(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean fieldDefinition_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fieldDefinition_5")) return false;
    directives(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // !('}' | root_tokens | fieldDefinition | spreadFieldDefinition)
  static boolean fieldDefinition_recover(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fieldDefinition_recover")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !fieldDefinition_recover_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // '}' | root_tokens | fieldDefinition | spreadFieldDefinition
  private static boolean fieldDefinition_recover_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fieldDefinition_recover_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, BRACE_R);
    if (!result) result = root_tokens(builder, level + 1);
    if (!result) result = fieldDefinition(builder, level + 1);
    if (!result) result = spreadFieldDefinition(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // '{' (fieldDefinition | spreadFieldDefinition)* '}'
  public static boolean fieldsDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fieldsDefinition")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, FIELDS_DEFINITION, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, fieldsDefinition_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // (fieldDefinition | spreadFieldDefinition)*
  private static boolean fieldsDefinition_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fieldsDefinition_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!fieldsDefinition_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "fieldsDefinition_1", pos)) break;
    }
    return true;
  }

  // fieldDefinition | spreadFieldDefinition
  private static boolean fieldsDefinition_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fieldsDefinition_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = fieldDefinition(builder, level + 1);
    if (!result) result = spreadFieldDefinition(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // FLOAT
  public static boolean floatValue(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "floatValue")) return false;
    if (!nextTokenIs(builder, FLOAT)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, FLOAT);
    exit_section_(builder, marker, FLOAT_VALUE, result);
    return result;
  }

  /* ********************************************************** */
  // '<' identifier+ '>'
  public static boolean generic(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic")) return false;
    if (!nextTokenIs(builder, ANGLE_BRACKET_L)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, ANGLE_BRACKET_L);
    result = result && generic_1(builder, level + 1);
    result = result && consumeToken(builder, ANGLE_BRACKET_R);
    exit_section_(builder, marker, GENERIC, result);
    return result;
  }

  // identifier+
  private static boolean generic_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = identifier(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!identifier(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "generic_1", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // description_variables?  description? 'input' typeNameDefinition directives? '=' modified_ref
  public static boolean genericInputObjectTypeDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "genericInputObjectTypeDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, GENERIC_INPUT_OBJECT_TYPE_DEFINITION, "<generic input object type definition>");
    result = genericInputObjectTypeDefinition_0(builder, level + 1);
    result = result && genericInputObjectTypeDefinition_1(builder, level + 1);
    result = result && consumeToken(builder, INPUT_KEYWORD);
    result = result && typeNameDefinition(builder, level + 1);
    result = result && genericInputObjectTypeDefinition_4(builder, level + 1);
    result = result && consumeToken(builder, EQUALS);
    pinned = result; // pin = 6
    result = result && modified_ref(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description_variables?
  private static boolean genericInputObjectTypeDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "genericInputObjectTypeDefinition_0")) return false;
    description_variables(builder, level + 1);
    return true;
  }

  // description?
  private static boolean genericInputObjectTypeDefinition_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "genericInputObjectTypeDefinition_1")) return false;
    description(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean genericInputObjectTypeDefinition_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "genericInputObjectTypeDefinition_4")) return false;
    directives(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // description_variables? description? 'type' typeNameDefinition directives? '=' modified_ref
  public static boolean genericObjectTypeDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "genericObjectTypeDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, GENERIC_OBJECT_TYPE_DEFINITION, "<generic object type definition>");
    result = genericObjectTypeDefinition_0(builder, level + 1);
    result = result && genericObjectTypeDefinition_1(builder, level + 1);
    result = result && consumeToken(builder, TYPE_KEYWORD);
    result = result && typeNameDefinition(builder, level + 1);
    result = result && genericObjectTypeDefinition_4(builder, level + 1);
    result = result && consumeToken(builder, EQUALS);
    pinned = result; // pin = 6
    result = result && modified_ref(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description_variables?
  private static boolean genericObjectTypeDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "genericObjectTypeDefinition_0")) return false;
    description_variables(builder, level + 1);
    return true;
  }

  // description?
  private static boolean genericObjectTypeDefinition_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "genericObjectTypeDefinition_1")) return false;
    description(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean genericObjectTypeDefinition_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "genericObjectTypeDefinition_4")) return false;
    directives(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // '<' type+ '>'
  public static boolean generic_call(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_call")) return false;
    if (!nextTokenIs(builder, ANGLE_BRACKET_L)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, ANGLE_BRACKET_L);
    result = result && generic_call_1(builder, level + 1);
    result = result && consumeToken(builder, ANGLE_BRACKET_R);
    exit_section_(builder, marker, GENERIC_CALL, result);
    return result;
  }

  // type+
  private static boolean generic_call_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "generic_call_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = type(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!type(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "generic_call_1", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // NAME | 'query' | 'mutation' | 'subscription' | 'schema' | 'scalar' | 'type' |
  //   'interface' | 'implements' | 'enum' | 'union' | 'input' | 'directive' | 'on' | 'repeatable'
  public static boolean identifier(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identifier")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, IDENTIFIER, "<identifier>");
    result = consumeToken(builder, NAME);
    if (!result) result = consumeToken(builder, QUERY_KEYWORD);
    if (!result) result = consumeToken(builder, MUTATION_KEYWORD);
    if (!result) result = consumeToken(builder, SUBSCRIPTION_KEYWORD);
    if (!result) result = consumeToken(builder, SCHEMA_KEYWORD);
    if (!result) result = consumeToken(builder, SCALAR_KEYWORD);
    if (!result) result = consumeToken(builder, TYPE_KEYWORD);
    if (!result) result = consumeToken(builder, INTERFACE_KEYWORD);
    if (!result) result = consumeToken(builder, IMPLEMENTS_KEYWORD);
    if (!result) result = consumeToken(builder, ENUM_KEYWORD);
    if (!result) result = consumeToken(builder, UNION_KEYWORD);
    if (!result) result = consumeToken(builder, INPUT_KEYWORD);
    if (!result) result = consumeToken(builder, DIRECTIVE_KEYWORD);
    if (!result) result = consumeToken(builder, ON_KEYWORD);
    if (!result) result = consumeToken(builder, REPEATABLE_KEYWORD);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // 'implements' ampTypeName ampTypeName*
  public static boolean implementsInterfaces(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "implementsInterfaces")) return false;
    if (!nextTokenIs(builder, IMPLEMENTS_KEYWORD)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, IMPLEMENTS_INTERFACES, null);
    result = consumeToken(builder, IMPLEMENTS_KEYWORD);
    pinned = result; // pin = 1
    result = result && report_error_(builder, ampTypeName(builder, level + 1));
    result = pinned && implementsInterfaces_2(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // ampTypeName*
  private static boolean implementsInterfaces_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "implementsInterfaces_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!ampTypeName(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "implementsInterfaces_2", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "import" quotedString
  public static boolean import_$(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "import_$")) return false;
    if (!nextTokenIs(builder, IMPORT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, IMPORT_KEYWORD);
    result = result && quotedString(builder, level + 1);
    exit_section_(builder, marker, IMPORT, result);
    return result;
  }

  /* ********************************************************** */
  // description_variables?  description? 'input' typeNameDefinition generic? directives? inputObjectValueDefinitions?
  public static boolean inputObjectTypeDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputObjectTypeDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, INPUT_OBJECT_TYPE_DEFINITION, "<input object type definition>");
    result = inputObjectTypeDefinition_0(builder, level + 1);
    result = result && inputObjectTypeDefinition_1(builder, level + 1);
    result = result && consumeToken(builder, INPUT_KEYWORD);
    pinned = result; // pin = 3
    result = result && report_error_(builder, typeNameDefinition(builder, level + 1));
    result = pinned && report_error_(builder, inputObjectTypeDefinition_4(builder, level + 1)) && result;
    result = pinned && report_error_(builder, inputObjectTypeDefinition_5(builder, level + 1)) && result;
    result = pinned && inputObjectTypeDefinition_6(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description_variables?
  private static boolean inputObjectTypeDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputObjectTypeDefinition_0")) return false;
    description_variables(builder, level + 1);
    return true;
  }

  // description?
  private static boolean inputObjectTypeDefinition_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputObjectTypeDefinition_1")) return false;
    description(builder, level + 1);
    return true;
  }

  // generic?
  private static boolean inputObjectTypeDefinition_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputObjectTypeDefinition_4")) return false;
    generic(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean inputObjectTypeDefinition_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputObjectTypeDefinition_5")) return false;
    directives(builder, level + 1);
    return true;
  }

  // inputObjectValueDefinitions?
  private static boolean inputObjectTypeDefinition_6(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputObjectTypeDefinition_6")) return false;
    inputObjectValueDefinitions(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' (inputValueDefinition | spreadInputDefinition)* '}'
  public static boolean inputObjectValueDefinitions(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputObjectValueDefinitions")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, INPUT_OBJECT_VALUE_DEFINITIONS, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, inputObjectValueDefinitions_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // (inputValueDefinition | spreadInputDefinition)*
  private static boolean inputObjectValueDefinitions_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputObjectValueDefinitions_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!inputObjectValueDefinitions_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "inputObjectValueDefinitions_1", pos)) break;
    }
    return true;
  }

  // inputValueDefinition | spreadInputDefinition
  private static boolean inputObjectValueDefinitions_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputObjectValueDefinitions_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = inputValueDefinition(builder, level + 1);
    if (!result) result = spreadInputDefinition(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // description? identifier ':' type defaultValue? directives?
  public static boolean inputValueDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputValueDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, INPUT_VALUE_DEFINITION, "<input value definition>");
    result = inputValueDefinition_0(builder, level + 1);
    result = result && identifier(builder, level + 1);
    pinned = result; // pin = 2
    result = result && report_error_(builder, consumeToken(builder, COLON));
    result = pinned && report_error_(builder, type(builder, level + 1)) && result;
    result = pinned && report_error_(builder, inputValueDefinition_4(builder, level + 1)) && result;
    result = pinned && inputValueDefinition_5(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, GraphQXLParser::inputValueDefinition_recover);
    return result || pinned;
  }

  // description?
  private static boolean inputValueDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputValueDefinition_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // defaultValue?
  private static boolean inputValueDefinition_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputValueDefinition_4")) return false;
    defaultValue(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean inputValueDefinition_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputValueDefinition_5")) return false;
    directives(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // !(')' | '}' | inputValueDefinition | spreadInputDefinition)
  static boolean inputValueDefinition_recover(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputValueDefinition_recover")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !inputValueDefinition_recover_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // ')' | '}' | inputValueDefinition | spreadInputDefinition
  private static boolean inputValueDefinition_recover_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "inputValueDefinition_recover_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, PAREN_R);
    if (!result) result = consumeToken(builder, BRACE_R);
    if (!result) result = inputValueDefinition(builder, level + 1);
    if (!result) result = spreadInputDefinition(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // NUMBER
  public static boolean intValue(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "intValue")) return false;
    if (!nextTokenIs(builder, NUMBER)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, NUMBER);
    exit_section_(builder, marker, INT_VALUE, result);
    return result;
  }

  /* ********************************************************** */
  // description? 'interface' typeNameDefinition implementsInterfaces? directives? fieldsDefinition?
  public static boolean interfaceTypeDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interfaceTypeDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, INTERFACE_TYPE_DEFINITION, "<interface type definition>");
    result = interfaceTypeDefinition_0(builder, level + 1);
    result = result && consumeToken(builder, INTERFACE_KEYWORD);
    pinned = result; // pin = 2
    result = result && report_error_(builder, typeNameDefinition(builder, level + 1));
    result = pinned && report_error_(builder, interfaceTypeDefinition_3(builder, level + 1)) && result;
    result = pinned && report_error_(builder, interfaceTypeDefinition_4(builder, level + 1)) && result;
    result = pinned && interfaceTypeDefinition_5(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean interfaceTypeDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interfaceTypeDefinition_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // implementsInterfaces?
  private static boolean interfaceTypeDefinition_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interfaceTypeDefinition_3")) return false;
    implementsInterfaces(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean interfaceTypeDefinition_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interfaceTypeDefinition_4")) return false;
    directives(builder, level + 1);
    return true;
  }

  // fieldsDefinition?
  private static boolean interfaceTypeDefinition_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "interfaceTypeDefinition_5")) return false;
    fieldsDefinition(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // '[' type ']'
  public static boolean listType(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "listType")) return false;
    if (!nextTokenIs(builder, BRACKET_L)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, BRACKET_L);
    result = result && type(builder, level + 1);
    result = result && consumeToken(builder, BRACKET_R);
    exit_section_(builder, marker, LIST_TYPE, result);
    return result;
  }

  /* ********************************************************** */
  // (required_modifier '<' modified_ref '>') |
  //     (optional_modifier '<' modified_ref '>') |
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

  // required_modifier '<' modified_ref '>'
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

  // optional_modifier '<' modified_ref '>'
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
  // typeName BANG | listType BANG
  public static boolean nonNullType(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "nonNullType")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, NON_NULL_TYPE, "<non null type>");
    result = nonNullType_0(builder, level + 1);
    if (!result) result = nonNullType_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // typeName BANG
  private static boolean nonNullType_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "nonNullType_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = typeName(builder, level + 1);
    result = result && consumeToken(builder, BANG);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // listType BANG
  private static boolean nonNullType_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "nonNullType_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = listType(builder, level + 1);
    result = result && consumeToken(builder, BANG);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // 'null'
  public static boolean nullValue(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "nullValue")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, NULL_VALUE, "<null value>");
    result = consumeToken(builder, "null");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // identifier ':' value
  public static boolean objectField(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectField")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, OBJECT_FIELD, "<object field>");
    result = identifier(builder, level + 1);
    pinned = result; // pin = 1
    result = result && report_error_(builder, consumeToken(builder, COLON));
    result = pinned && value(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, GraphQXLParser::objectField_recover);
    return result || pinned;
  }

  /* ********************************************************** */
  // !('}' | value)
  static boolean objectField_recover(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectField_recover")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !objectField_recover_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // '}' | value
  private static boolean objectField_recover_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectField_recover_0")) return false;
    boolean result;
    result = consumeToken(builder, BRACE_R);
    if (!result) result = value(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // description_variables? description? 'type' typeNameDefinition generic? implementsInterfaces? directives? fieldsDefinition?
  public static boolean objectTypeDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectTypeDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, OBJECT_TYPE_DEFINITION, "<object type definition>");
    result = objectTypeDefinition_0(builder, level + 1);
    result = result && objectTypeDefinition_1(builder, level + 1);
    result = result && consumeToken(builder, TYPE_KEYWORD);
    pinned = result; // pin = 3
    result = result && report_error_(builder, typeNameDefinition(builder, level + 1));
    result = pinned && report_error_(builder, objectTypeDefinition_4(builder, level + 1)) && result;
    result = pinned && report_error_(builder, objectTypeDefinition_5(builder, level + 1)) && result;
    result = pinned && report_error_(builder, objectTypeDefinition_6(builder, level + 1)) && result;
    result = pinned && objectTypeDefinition_7(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description_variables?
  private static boolean objectTypeDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectTypeDefinition_0")) return false;
    description_variables(builder, level + 1);
    return true;
  }

  // description?
  private static boolean objectTypeDefinition_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectTypeDefinition_1")) return false;
    description(builder, level + 1);
    return true;
  }

  // generic?
  private static boolean objectTypeDefinition_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectTypeDefinition_4")) return false;
    generic(builder, level + 1);
    return true;
  }

  // implementsInterfaces?
  private static boolean objectTypeDefinition_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectTypeDefinition_5")) return false;
    implementsInterfaces(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean objectTypeDefinition_6(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectTypeDefinition_6")) return false;
    directives(builder, level + 1);
    return true;
  }

  // fieldsDefinition?
  private static boolean objectTypeDefinition_7(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectTypeDefinition_7")) return false;
    fieldsDefinition(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' objectField* '}'
  public static boolean objectValue(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectValue")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, OBJECT_VALUE, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, objectValue_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // objectField*
  private static boolean objectValue_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "objectValue_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!objectField(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "objectValue_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // QUERY_KEYWORD | MUTATION_KEYWORD | SUBSCRIPTION_KEYWORD
  public static boolean operationType(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "operationType")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, OPERATION_TYPE, "<operation type>");
    result = consumeToken(builder, QUERY_KEYWORD);
    if (!result) result = consumeToken(builder, MUTATION_KEYWORD);
    if (!result) result = consumeToken(builder, SUBSCRIPTION_KEYWORD);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // (operationType | NAME) ':' typeName
  public static boolean operationTypeDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "operationTypeDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, OPERATION_TYPE_DEFINITION, "<operation type definition>");
    result = operationTypeDefinition_0(builder, level + 1);
    pinned = result; // pin = 1
    result = result && report_error_(builder, consumeToken(builder, COLON));
    result = pinned && typeName(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, GraphQXLParser::operationTypeDefinition_recover);
    return result || pinned;
  }

  // operationType | NAME
  private static boolean operationTypeDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "operationTypeDefinition_0")) return false;
    boolean result;
    result = operationType(builder, level + 1);
    if (!result) result = consumeToken(builder, NAME);
    return result;
  }

  /* ********************************************************** */
  // !('}' | root_tokens | operationTypeDefinition)
  static boolean operationTypeDefinition_recover(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "operationTypeDefinition_recover")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !operationTypeDefinition_recover_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // '}' | root_tokens | operationTypeDefinition
  private static boolean operationTypeDefinition_recover_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "operationTypeDefinition_recover_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, BRACE_R);
    if (!result) result = root_tokens(builder, level + 1);
    if (!result) result = operationTypeDefinition(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // '{' operationTypeDefinition+ '}'
  public static boolean operationTypeDefinitions(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "operationTypeDefinitions")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, OPERATION_TYPE_DEFINITIONS, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, operationTypeDefinitions_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // operationTypeDefinition+
  private static boolean operationTypeDefinitions_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "operationTypeDefinitions_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = operationTypeDefinition(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!operationTypeDefinition(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "operationTypeDefinitions_1", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // 'Optional'
  public static boolean optional_modifier(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "optional_modifier")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, OPTIONAL_MODIFIER, "<optional modifier>");
    result = consumeToken(builder, "Optional");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // '|' directiveLocation
  static boolean pipeDirectiveLocation(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "pipeDirectiveLocation")) return false;
    if (!nextTokenIs(builder, PIPE)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, PIPE);
    result = result && directiveLocation(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // '|' typeName
  static boolean pipeUnionMember(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "pipeUnionMember")) return false;
    if (!nextTokenIs(builder, PIPE)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_);
    result = consumeToken(builder, PIPE);
    pinned = result; // pin = 1
    result = result && typeName(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  /* ********************************************************** */
  // OPEN_QUOTE REGULAR_STRING_PART? CLOSING_QUOTE
  public static boolean quotedString(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "quotedString")) return false;
    if (!nextTokenIs(builder, OPEN_QUOTE)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, QUOTED_STRING, null);
    result = consumeToken(builder, OPEN_QUOTE);
    pinned = result; // pin = 1
    result = result && report_error_(builder, quotedString_1(builder, level + 1));
    result = pinned && consumeToken(builder, CLOSING_QUOTE) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // REGULAR_STRING_PART?
  private static boolean quotedString_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "quotedString_1")) return false;
    consumeToken(builder, REGULAR_STRING_PART);
    return true;
  }

  /* ********************************************************** */
  // 'Required'
  public static boolean required_modifier(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "required_modifier")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, REQUIRED_MODIFIER, "<required modifier>");
    result = consumeToken(builder, "Required");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // definition_keywords | DOLLAR_BRACE_L | '{' /* anon query */ | OPEN_QUOTE | OPEN_TRIPLE_QUOTE /* schema description */ | (DOLLAR BRACE_L)
  static boolean root_tokens(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "root_tokens")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = definition_keywords(builder, level + 1);
    if (!result) result = consumeToken(builder, DOLLAR_BRACE_L);
    if (!result) result = consumeToken(builder, BRACE_L);
    if (!result) result = consumeToken(builder, OPEN_QUOTE);
    if (!result) result = consumeToken(builder, OPEN_TRIPLE_QUOTE);
    if (!result) result = root_tokens_5(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // DOLLAR BRACE_L
  private static boolean root_tokens_5(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "root_tokens_5")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, DOLLAR, BRACE_L);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // description? 'scalar' typeNameDefinition directives?
  public static boolean scalarTypeDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "scalarTypeDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, SCALAR_TYPE_DEFINITION, "<scalar type definition>");
    result = scalarTypeDefinition_0(builder, level + 1);
    result = result && consumeToken(builder, SCALAR_KEYWORD);
    pinned = result; // pin = 2
    result = result && report_error_(builder, typeNameDefinition(builder, level + 1));
    result = pinned && scalarTypeDefinition_3(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean scalarTypeDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "scalarTypeDefinition_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean scalarTypeDefinition_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "scalarTypeDefinition_3")) return false;
    directives(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // description? 'schema' directives? operationTypeDefinitions
  public static boolean schemaDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "schemaDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, SCHEMA_DEFINITION, "<schema definition>");
    result = schemaDefinition_0(builder, level + 1);
    result = result && consumeToken(builder, SCHEMA_KEYWORD);
    pinned = result; // pin = 2
    result = result && report_error_(builder, schemaDefinition_2(builder, level + 1));
    result = pinned && operationTypeDefinitions(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean schemaDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "schemaDefinition_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean schemaDefinition_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "schemaDefinition_2")) return false;
    directives(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // field
  public static boolean selection(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "selection")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, SELECTION, "<selection>");
    result = field(builder, level + 1);
    exit_section_(builder, level, marker, result, false, GraphQXLParser::selection_recover);
    return result;
  }

  /* ********************************************************** */
  // '{' selection+ '}'
  public static boolean selectionSet(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "selectionSet")) return false;
    if (!nextTokenIs(builder, BRACE_L)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, SELECTION_SET, null);
    result = consumeToken(builder, BRACE_L);
    pinned = result; // pin = 1
    result = result && report_error_(builder, selectionSet_1(builder, level + 1));
    result = pinned && consumeToken(builder, BRACE_R) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // selection+
  private static boolean selectionSet_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "selectionSet_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = selection(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!selection(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "selectionSet_1", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // !('}' | root_tokens | selection)
  static boolean selection_recover(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "selection_recover")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !selection_recover_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // '}' | root_tokens | selection
  private static boolean selection_recover_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "selection_recover_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, BRACE_R);
    if (!result) result = root_tokens(builder, level + 1);
    if (!result) result = selection(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // '...' modified_ref
  public static boolean spreadFieldDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "spreadFieldDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, SPREAD_FIELD_DEFINITION, "<spread field definition>");
    result = consumeToken(builder, SPREAD);
    pinned = result; // pin = 1
    result = result && modified_ref(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, GraphQXLParser::fieldDefinition_recover);
    return result || pinned;
  }

  /* ********************************************************** */
  // '...' modified_ref
  public static boolean spreadInputDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "spreadInputDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, SPREAD_INPUT_DEFINITION, "<spread input definition>");
    result = consumeToken(builder, SPREAD);
    pinned = result; // pin = 1
    result = result && modified_ref(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, GraphQXLParser::inputValueDefinition_recover);
    return result || pinned;
  }

  /* ********************************************************** */
  // quotedString | blockString
  public static boolean stringLiteral(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "stringLiteral")) return false;
    if (!nextTokenIs(builder, "<string literal>", OPEN_QUOTE, OPEN_TRIPLE_QUOTE)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _COLLAPSE_, STRING_LITERAL, "<string literal>");
    result = quotedString(builder, level + 1);
    if (!result) result = blockString(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // stringLiteral
  public static boolean stringValue(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "stringValue")) return false;
    if (!nextTokenIs(builder, "<string value>", OPEN_QUOTE, OPEN_TRIPLE_QUOTE)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, STRING_VALUE, "<string value>");
    result = stringLiteral(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // nonNullType | listType | typeName
  public static boolean type(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _COLLAPSE_, TYPE, "<type>");
    result = nonNullType(builder, level + 1);
    if (!result) result = listType(builder, level + 1);
    if (!result) result = typeName(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // scalarTypeDefinition |
  //   genericObjectTypeDefinition |
  //   objectTypeDefinition |
  //   interfaceTypeDefinition |
  //   unionTypeDefinition |
  //   enumTypeDefinition |
  //   genericInputObjectTypeDefinition |
  //   inputObjectTypeDefinition
  public static boolean typeDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeDefinition")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _COLLAPSE_, TYPE_DEFINITION, "<type definition>");
    result = scalarTypeDefinition(builder, level + 1);
    if (!result) result = genericObjectTypeDefinition(builder, level + 1);
    if (!result) result = objectTypeDefinition(builder, level + 1);
    if (!result) result = interfaceTypeDefinition(builder, level + 1);
    if (!result) result = unionTypeDefinition(builder, level + 1);
    if (!result) result = enumTypeDefinition(builder, level + 1);
    if (!result) result = genericInputObjectTypeDefinition(builder, level + 1);
    if (!result) result = inputObjectTypeDefinition(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // !(definition_keywords) identifier
  public static boolean typeName(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeName")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, TYPE_NAME, "<type name>");
    result = typeName_0(builder, level + 1);
    result = result && identifier(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // !(definition_keywords)
  private static boolean typeName_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeName_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !typeName_0_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // (definition_keywords)
  private static boolean typeName_0_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeName_0_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = definition_keywords(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // !(definition_keywords) identifier
  public static boolean typeNameDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeNameDefinition")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, TYPE_NAME_DEFINITION, "<type name definition>");
    result = typeNameDefinition_0(builder, level + 1);
    result = result && identifier(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // !(definition_keywords)
  private static boolean typeNameDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeNameDefinition_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NOT_);
    result = !typeNameDefinition_0_0(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // (definition_keywords)
  private static boolean typeNameDefinition_0_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeNameDefinition_0_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = definition_keywords(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // schemaDefinition |
  //     typeDefinition |
  //     directiveDefinition
  public static boolean typeSystemDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typeSystemDefinition")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _COLLAPSE_, TYPE_SYSTEM_DEFINITION, "<type system definition>");
    result = schemaDefinition(builder, level + 1);
    if (!result) result = typeDefinition(builder, level + 1);
    if (!result) result = directiveDefinition(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // '|'? typeName pipeUnionMember*
  public static boolean unionMembers(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unionMembers")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, UNION_MEMBERS, "<union members>");
    result = unionMembers_0(builder, level + 1);
    result = result && typeName(builder, level + 1);
    result = result && unionMembers_2(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // '|'?
  private static boolean unionMembers_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unionMembers_0")) return false;
    consumeToken(builder, PIPE);
    return true;
  }

  // pipeUnionMember*
  private static boolean unionMembers_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unionMembers_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!pipeUnionMember(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "unionMembers_2", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // '=' unionMembers
  public static boolean unionMembership(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unionMembership")) return false;
    if (!nextTokenIs(builder, EQUALS)) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, UNION_MEMBERSHIP, null);
    result = consumeToken(builder, EQUALS);
    pinned = result; // pin = 1
    result = result && unionMembers(builder, level + 1);
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  /* ********************************************************** */
  // description? 'union' typeNameDefinition directives? unionMembership?
  public static boolean unionTypeDefinition(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unionTypeDefinition")) return false;
    boolean result, pinned;
    Marker marker = enter_section_(builder, level, _NONE_, UNION_TYPE_DEFINITION, "<union type definition>");
    result = unionTypeDefinition_0(builder, level + 1);
    result = result && consumeToken(builder, UNION_KEYWORD);
    pinned = result; // pin = 2
    result = result && report_error_(builder, typeNameDefinition(builder, level + 1));
    result = pinned && report_error_(builder, unionTypeDefinition_3(builder, level + 1)) && result;
    result = pinned && unionTypeDefinition_4(builder, level + 1) && result;
    exit_section_(builder, level, marker, result, pinned, null);
    return result || pinned;
  }

  // description?
  private static boolean unionTypeDefinition_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unionTypeDefinition_0")) return false;
    description(builder, level + 1);
    return true;
  }

  // directives?
  private static boolean unionTypeDefinition_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unionTypeDefinition_3")) return false;
    directives(builder, level + 1);
    return true;
  }

  // unionMembership?
  private static boolean unionTypeDefinition_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unionTypeDefinition_4")) return false;
    unionMembership(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // stringValue |
  //     intValue |
  //     floatValue |
  //     booleanValue |
  //     nullValue |
  //     enumValue |
  //     arrayValue |
  //     objectValue
  public static boolean value(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "value")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _COLLAPSE_, VALUE, "<value>");
    result = stringValue(builder, level + 1);
    if (!result) result = intValue(builder, level + 1);
    if (!result) result = floatValue(builder, level + 1);
    if (!result) result = booleanValue(builder, level + 1);
    if (!result) result = nullValue(builder, level + 1);
    if (!result) result = enumValue(builder, level + 1);
    if (!result) result = arrayValue(builder, level + 1);
    if (!result) result = objectValue(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

}
