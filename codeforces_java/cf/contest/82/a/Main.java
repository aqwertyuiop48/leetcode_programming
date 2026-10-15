import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Long.valueOf(new Scanner(System.in).nextLong()) instanceof Long n
            && Integer.valueOf(IntStream.range(0, 40).filter(k -> 5 * ((1L << (k + 1)) - 1) >= n).findFirst().getAsInt()) instanceof Integer k
            ? new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"}[(int) ((n - 1 - 5 * ((1L << k) - 1)) >> k)] : "");
    }
}

