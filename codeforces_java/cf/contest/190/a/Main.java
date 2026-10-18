import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            ? n == 0 && m > 0 ? "Impossible" : Math.max(n, m) + " " + (m == 0 ? n : n + m - 1)
            : "");
    }
}
