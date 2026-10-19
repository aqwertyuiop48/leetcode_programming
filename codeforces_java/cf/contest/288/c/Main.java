import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new int[n + 1] instanceof int[] p && IntStream.rangeClosed(0, n).allMatch(i -> (p[i] = -1) < 0)
            && IntStream.iterate(n, i -> i >= 0, i -> i - 1).allMatch(i -> p[i] >= 0 || i == 0 && (p[0] = 0) == 0 || Integer.valueOf((Integer.highestOneBit(i) * 2 - 1) ^ i) instanceof Integer j && (p[i] = j) >= 0 && (p[j] = i) >= 0)
            ? (long) n * (n + 1) + "\n" + Arrays.stream(p).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
