import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(t.nextToken())).toArray() instanceof int[] a
            ? (a[n - 1] == 15 ? "DOWN" : a[n - 1] == 0 ? "UP" : n == 1 ? "-1" : a[n - 1] > a[n - 2] ? "UP" : "DOWN") : "");
    }
}
