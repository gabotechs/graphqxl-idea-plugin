package com.github.gabotechs.graphqxlideaplugin.language

enum class GraphQXLCompletionKeyword(val text: String) {
    QUERY("query"),
    SUBSCRIPTION("subscription"),
    MUTATION("mutation"),
    EXTEND("extend"),
    SCHEMA("schema"),
    SCALAR("scalar"),
    TYPE("type"),
    INTERFACE("interface"),
    INPUT("input"),
    ENUM("enum"),
    UNION("union"),
    DIRECTIVE("directive"),
    IMPLEMENTS("implements"),
    ON("on"),
    REPEATABLE("repeatable"),
    TRUE("true"),
    FALSE("false");
}
