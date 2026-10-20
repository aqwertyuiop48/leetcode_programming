import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Integer.valueOf((int) it.nextLong()) instanceof Integer m
            && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] a && new long[1] instanceof long[] add
            ? IntStream.range(0, m).mapToObj(i -> Long.valueOf(it.nextLong()) instanceof Long t
                ? t == 1 ? (a[(int) it.nextLong() - 1] = it.nextLong() - add[0]) > Long.MIN_VALUE ? (String) null : (String) null
                : t == 2 ? (add[0] += it.nextLong()) > Long.MIN_VALUE ? (String) null : (String) null
                : String.valueOf(a[(int) it.nextLong() - 1] + add[0])
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
