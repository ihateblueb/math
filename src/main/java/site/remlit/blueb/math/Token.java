package site.remlit.blueb.math;

public enum Token {
    OPEN_PARENTHESES,
    CLOSED_PARENTHESES,
    OPEN_CURLY_BRACKET,
    CLOSED_CURLY_BRACKET,

    COMMA,
    PERIOD,
    EXCLAMATION,

    EQUAL,
    PLUS,
    MINUS,
    MULTIPLY,
    DIVIDE,
    EXPONENT,

    DIGIT_ZERO,
    DIGIT_ONE,
    DIGIT_TWO,
    DIGIT_THREE,
    DIGIT_FOUR,
    DIGIT_FIVE,
    DIGIT_SIX,
    DIGIT_SEVEN,
    DIGIT_EIGHT,
    DIGIT_NINE;

    public static boolean isDigit(Token token) {
        return (token == Token.DIGIT_ZERO || token == Token.DIGIT_ONE || token == DIGIT_TWO ||
                token == DIGIT_THREE ||  token == DIGIT_FOUR || token == DIGIT_FIVE ||
                token == DIGIT_SIX || token == DIGIT_SEVEN || token == DIGIT_EIGHT ||
                token == DIGIT_NINE);
    }
}
