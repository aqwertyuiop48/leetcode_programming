import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b && Integer.valueOf(s.nextInt()) instanceof Integer c
            && new int[a * b * c + 1] instanceof int[] d
            && IntStream.rangeClosed(1, a * b * c).allMatch(i -> IntStream.iterate(i, j -> j <= a * b * c, j -> j + i).allMatch(j -> ++d[j] > 0))
            ? IntStream.rangeClosed(1, a).mapToLong(i -> IntStream.rangeClosed(1, b).mapToLong(j -> IntStream.rangeClosed(1, c).mapToLong(k -> d[i * j * k]).sum()).sum()).sum() % (1L << 30) : "");
    }
}
