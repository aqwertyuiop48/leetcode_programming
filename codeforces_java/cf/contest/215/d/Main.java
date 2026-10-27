import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long m
            ? IntStream.range(0, n).mapToLong(i -> Long.valueOf(s.nextLong()) instanceof Long t && Long.valueOf(s.nextLong()) instanceof Long T
                && Long.valueOf(s.nextLong()) instanceof Long x && Long.valueOf(s.nextLong()) instanceof Long c
                ? T - t <= 0 ? c + m * x : T - t >= m ? c : Math.min(c * ((m + T - t - 1) / (T - t)), c + m * x) : 0).sum() : "");
    }
}

