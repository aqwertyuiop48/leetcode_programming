import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && (n == 1 ? a[0] > 0 : n == 2 ? Math.min(a[0], a[1]) != (int) Math.floor(Math.abs(a[0] - a[1]) * (1 + Math.sqrt(5)) / 2) : (a[0] ^ a[1] ^ a[2]) != 0)
            ? "BitLGM" : "BitAryo");
    }
}
