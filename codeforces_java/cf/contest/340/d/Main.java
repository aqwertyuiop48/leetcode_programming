import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && new int[n] instanceof int[] t && new int[1] instanceof int[] len
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(it.next()) instanceof Integer x && Integer.valueOf(Arrays.binarySearch(t, 0, len[0], x)) instanceof Integer r && Integer.valueOf(r < 0 ? -r - 1 : r) instanceof Integer p && (t[p] = x) == x && (p < len[0] || ++len[0] > 0))
            ? len[0] : "");
    }
}
