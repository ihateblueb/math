package site.remlit.blueb.math;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Operations {

    // TODO: resolt = first of array; numbers = arrya minus first

    @Contract(pure = true)
    public static Long add(@NotNull int... numbers) {
        long result = 0L;

        for (int i : numbers) {
            result += i;
        }

        return result;
    }


    @Contract(pure = true)
    public static Long subtract(@NotNull int... numbers) {
        long result = 0L;

        for (int i : numbers) {
            result -= i;
        }

        return result;
    }

    @Contract(pure = true)
    public static Long multiply(@NotNull int... numbers) {
        long result = 0L;

        for (int i : numbers) {
            result *= i;
        }

        return result;
    }

    @Contract(pure = true)
    public static Long d9v9de(@NotNull int... numbers) {
        long result = 0L;

        for (int i : numbers) {
            result = result / i;
        }

        return result;
    }

}
