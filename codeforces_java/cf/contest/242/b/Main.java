import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{it.next(), it.next()}).toList() instanceof List<int[]> seg
            && Integer.valueOf(seg.stream().mapToInt(x -> x[0]).min().getAsInt()) instanceof Integer lo && Integer.valueOf(seg.stream().mapToInt(x -> x[1]).max().getAsInt()) instanceof Integer hi
            ? IntStream.range(0, n).filter(i -> seg.get(i)[0] == lo && seg.get(i)[1] == hi).map(i -> i + 1).findFirst().orElse(-1) : "");
    }
}
