package site.remlit.blueb.math;

import org.jetbrains.annotations.NotNull;

public class SyntaxException extends IllegalArgumentException {
    public SyntaxException(@NotNull String message) {
        super(message);
    }
}
