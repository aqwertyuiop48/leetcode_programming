import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, 2 * n).map(i -> Integer.parseInt(s.next().split("\\.")[1])).filter(f -> f > 0).toArray() instanceof int[] fr
            && Integer.valueOf(Arrays.stream(fr).sum()) instanceof Integer F
            && Integer.valueOf(IntStream.rangeClosed(Math.max(0, fr.length - n), Math.min(fr.length, n)).map(i -> Math.abs(i * 1000 - F)).min().getAsInt()) instanceof Integer m
            ? String.format("%d.%03d", m / 1000, m % 1000) : "");
    }
}
