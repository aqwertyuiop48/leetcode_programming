import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            ? IntStream.range(0, n).boxed().reduce((x, y) -> (a[x] + m - 1) / m > (a[y] + m - 1) / m ? x : y).get() + 1 : "");
    }
}
