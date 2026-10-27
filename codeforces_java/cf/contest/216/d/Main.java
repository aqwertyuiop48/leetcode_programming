import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, it.next()).map(j -> it.next()).sorted().toArray()).toList() instanceof List<int[]> p
            && ((ToIntBiFunction<int[], Integer>) (arr, x) -> Integer.valueOf(Arrays.binarySearch(arr, x)) instanceof Integer r ? r >= 0 ? r : -r - 1 : 0) instanceof ToIntBiFunction<int[], Integer> lo
            && ((ToIntBiFunction<int[], Integer>) (arr, x) -> Integer.valueOf(Arrays.binarySearch(arr, x)) instanceof Integer r ? r >= 0 ? r + 1 : -r - 1 : 0) instanceof ToIntBiFunction<int[], Integer> hi
            ? IntStream.range(0, n).mapToLong(i -> IntStream.range(0, p.get(i).length - 1).filter(j -> IntStream.of((i + n - 1) % n, (i + 1) % n)
                .map(o -> lo.applyAsInt(p.get(o), p.get(i)[j + 1]) - hi.applyAsInt(p.get(o), p.get(i)[j])).distinct().count() > 1).count()).sum() : "");
    }
}

