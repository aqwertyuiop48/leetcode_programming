import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new BufferedReader(new InputStreamReader(System.in)).lines().toList()).ifPresent(L ->
            Optional.of(Integer.parseInt(L.get(0).trim())).ifPresent(n ->
            Optional.of(Arrays.stream(L.get(1).trim().split("(?<=[.!?]) ")).mapToInt(String::length).toArray()).ifPresent(a ->
            Optional.of(new int[]{0, 0}).ifPresent(st ->
                System.out.print(IntStream.of(a).anyMatch(l -> l > n) ? "Impossible" : IntStream.of(a).allMatch(l -> st[1] > 0 && st[1] + 1 + l <= n ? (st[1] += 1 + l) > 0 : (st[0] += 1) > 0 & (st[1] = l) > 0) ? st[0] : -1)))));
    }
}

