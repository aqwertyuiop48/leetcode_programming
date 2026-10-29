import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> -s.nextInt()).sorted().toArray() instanceof int[] a && IntStream.range(0, m).map(i -> -s.nextInt()).sorted().toArray() instanceof int[] b
            ? n > m || IntStream.range(0, n).anyMatch(i -> a[i] < b[i]) ? "YES" : "NO" : "");
    }
}

