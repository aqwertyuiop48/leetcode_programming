import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner in && Integer.valueOf(in.nextInt()) instanceof Integer n
            ? n % 2 == 0 ? 0 : new long[]{1, 3, 15, 133, 2025, 37851, 1030367, 36362925}[n / 2] % 1000000007L * LongStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y % 1000000007L) % 1000000007L : "");
    }
}
