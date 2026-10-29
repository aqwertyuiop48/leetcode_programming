import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m && Integer.valueOf(s.nextInt()) instanceof Integer d
            && IntStream.range(0, n * m).map(i -> s.nextInt()).sorted().toArray() instanceof int[] a
            ? Arrays.stream(a).anyMatch(x -> (x - a[0]) % d != 0) ? -1 : Arrays.stream(a).map(x -> Math.abs(x - a[a.length / 2]) / d).sum() : "");
    }
}

