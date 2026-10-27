import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer n
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> new long[]{Long.parseLong((String) it.next()), Long.parseLong((String) it.next())}).toList() instanceof List<long[]> st
            && new long[n] instanceof long[] ans
            && new long[]{0} instanceof long[] ret
            && IntStream.iterate(0, i -> i < n, i -> i + m).allMatch(i0 -> Integer.valueOf(Math.min(n, i0 + m)) instanceof Integer i1
                && new long[]{Math.max(ret[0], st.get(i1 - 1)[0]), 0} instanceof long[] cp
                && IntStream.range(i0, i1).boxed().collect(Collectors.groupingBy(i -> st.get(i)[1], TreeMap::new, Collectors.toList())).entrySet().stream().allMatch(e ->
                    Long.valueOf(cp[0] + e.getKey() - cp[1]) instanceof Long arrive
                    && e.getValue().stream().allMatch(i -> (ans[i] = arrive) >= 0)
                    && (cp[0] = arrive + 1 + e.getValue().size() / 2) >= 0 && (cp[1] = e.getKey()) >= 0)
                && (ret[0] = cp[0] + cp[1]) >= 0)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}

