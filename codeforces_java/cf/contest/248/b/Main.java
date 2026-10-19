import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? n < 3 ? "-1" : Integer.valueOf((210 - IntStream.range(0, n - 1).reduce(1, (r, i) -> r * 10 % 210) % 210) % 210) instanceof Integer add
                ? n == 3 ? String.valueOf(100 + add) : "1" + "0".repeat(n - 4) + String.format("%03d", add) : "" : "");
    }
}
