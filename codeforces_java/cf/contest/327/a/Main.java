import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && IntStream.range(1, t[0] + 1).map(i -> t[i]).toArray() instanceof int[] a
            ? Arrays.stream(a).sum() + IntStream.range(0, a.length).map(i -> IntStream.range(i, a.length).map(j -> IntStream.rangeClosed(i, j).map(k -> 1 - 2 * a[k]).sum()).max().getAsInt()).max().getAsInt() : "");
    }
}
