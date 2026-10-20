import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && new int[8] instanceof int[] c && IntStream.range(0, n).allMatch(i -> c[Integer.parseInt(it.next())]++ >= 0)
            && c[5] == 0 && c[7] == 0 && c[6] >= c[3] && c[2] == c[4] + c[6] - c[3] && c[1] == n / 3 && c[4] + c[6] == c[1]
            ? Stream.of(Collections.nCopies(c[4], "1 2 4"), Collections.nCopies(c[6] - c[3], "1 2 6"), Collections.nCopies(c[3], "1 3 6")).flatMap(List::stream).collect(Collectors.joining("\n")) : "-1");
    }
}
