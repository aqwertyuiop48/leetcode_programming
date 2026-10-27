import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : rd.getAsInt()).toArray() instanceof int[] val
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> out
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> in
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(rd.getAsInt()) instanceof Integer u && Integer.valueOf(rd.getAsInt()) instanceof Integer v && out.get(u).add(v) && in.get(v).add(u))
            && new boolean[n + 1] instanceof boolean[] fw
            && new boolean[n + 1] instanceof boolean[] bw
            && new ArrayDeque<Integer>(IntStream.rangeClosed(1, n).filter(i -> val[i] == 1).boxed().toList()) instanceof ArrayDeque<Integer> q1
            && q1.stream().allMatch(v -> (fw[v] = true))
            && Stream.generate(q1::poll).takeWhile(Objects::nonNull).allMatch(v -> out.get(v).stream().filter(u -> val[u] != 1 && !fw[u]).allMatch(u -> (fw[u] = true) && q1.add(u)))
            && new ArrayDeque<Integer>(IntStream.rangeClosed(1, n).filter(i -> val[i] == 2).boxed().toList()) instanceof ArrayDeque<Integer> q2
            && q2.stream().allMatch(v -> (bw[v] = true))
            && Stream.generate(q2::poll).takeWhile(Objects::nonNull).allMatch(v -> in.get(v).stream().filter(u -> !bw[u]).allMatch(u -> (bw[u] = true) && (val[u] == 1 || q2.add(u))))
            ? IntStream.rangeClosed(1, n).mapToObj(i -> fw[i] && bw[i] ? "1" : "0").collect(Collectors.joining("\n"))
            : "");
    }
}

