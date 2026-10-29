import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner in && Integer.valueOf(in.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> in.nextInt()).sorted().toArray() instanceof int[] a
            ? IntStream.range(0, n).mapToLong(i -> Math.abs((long) a[i] - (i + 1))).sum() : "");
    }
}

