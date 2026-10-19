import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).mapToObj(i -> new int[]{it.nextInt(), it.nextInt()}).toList() instanceof List<int[]> g
            ? g.stream().mapToLong(x -> g.stream().filter(y -> y[1] == x[0]).count()).sum() : "");
    }
}
