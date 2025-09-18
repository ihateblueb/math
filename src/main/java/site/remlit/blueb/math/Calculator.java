package site.remlit.blueb.math;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Calculator {
    public static Map<String, String> memory = Collections.emptyMap();

    public static void main(String[] args) {
        System.out.println("Now accepting input.");

        Scanner scanner =  new Scanner(System.in);

        while (true) {
            try {
                String line = scanner.nextLine();
                if (line.equals("exit")) return;
                eval(line);
            } catch (Exception ex) {
                System.out.println(
                        ex.getClass().getSimpleName() + ": " + ex.getMessage()
                );
            }
        }
    }

    public static void eval(@NotNull String expression) {
        if (expression.equals("clear")) {
            memory.clear();
            System.out.println("Memory cleared.");
            return;
        }

        if (expression.isBlank()) {
            System.out.println("Empty expression.");
            return;
        }

        String[] split = expression
                .replace(" ", "")
                .split("");
        ArrayList<Token> tokens = new ArrayList<>();

        for (String token : split) {
            switch (token) {
                case "(":
                    tokens.add(Token.OPEN_PARENTHESES);
                    break;
                case ")":
                    tokens.add(Token.CLOSED_PARENTHESES);
                    break;
                case "{":
                    tokens.add(Token.OPEN_CURLY_BRACKET);
                    break;
                case "}":
                    tokens.add(Token.CLOSED_CURLY_BRACKET);
                    break;

                case ",":
                    tokens.add(Token.COMMA);
                    break;
                case ".":
                    tokens.add(Token.PERIOD);
                    break;
                case "!":
                    tokens.add(Token.EXCLAMATION);
                    break;

                case "=":
                    tokens.add(Token.EQUAL);
                    break;
                case "+":
                    tokens.add(Token.PLUS);
                    break;
                case "-":
                    tokens.add(Token.MINUS);
                    break;
                case "*":
                    tokens.add(Token.MULTIPLY);
                    break;
                case "/":
                    tokens.add(Token.DIVIDE);
                    break;
                case "^":
                    tokens.add(Token.EXPONENT);
                    break;

                case "0":
                    tokens.add(Token.DIGIT_ZERO);
                    break;
                case "1":
                    tokens.add(Token.DIGIT_ONE);
                    break;
                case "2":
                    tokens.add(Token.DIGIT_TWO);
                    break;
                case "3":
                    tokens.add(Token.DIGIT_THREE);
                    break;
                case "4":
                    tokens.add(Token.DIGIT_FOUR);
                    break;
                case "5":
                    tokens.add(Token.DIGIT_FIVE);
                    break;
                case "6":
                    tokens.add(Token.DIGIT_SIX);
                    break;
                case "7":
                    tokens.add(Token.DIGIT_SEVEN);
                    break;
                case "8":
                    tokens.add(Token.DIGIT_EIGHT);
                    break;
                case "9":
                    tokens.add(Token.DIGIT_NINE);
                    break;

                default:
                    throw new SyntaxException("Unknown token '"+token+"'");
            }
        }

        System.out.println(tokens);
    }
}
