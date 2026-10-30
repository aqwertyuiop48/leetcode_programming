import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b && Integer.valueOf(s.nextInt()) instanceof Integer c
            && Integer.valueOf(a * b * c) instanceof Integer N
            && new int[N + 1] instanceof int[] d
            && IntStream.rangeClosed(1, (int) Math.sqrt(N) + 1).filter(i -> i * i <= N).allMatch(i ->
                IntStream.iterate(i * i, j -> j <= N, j -> j + i).allMatch(j -> (d[j] += j == i * i ? 1 : 2) > 0))
            ? IntStream.range(0, N).mapToLong(t -> d[(t / (b * c) + 1) * ((t / c) % b + 1) * (t % c + 1)]).sum() % (1L << 30) : "");
    }
}
