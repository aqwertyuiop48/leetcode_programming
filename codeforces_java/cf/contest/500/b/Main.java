import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] p
            && IntStream.range(0, n).mapToObj(i -> sc.next()).toArray(String[]::new) instanceof String[] s
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] comp
            && new int[n] instanceof int[] queue
            && new int[2] instanceof int[] ht
            && IntStream.range(0, n).allMatch(i ->
                comp[i] >= 0
                || (comp[i] = i) >= 0
                    && (queue[0] = i) >= 0
                    && (ht[1] = 1) > 0
                    && IntStream.iterate(0, h -> h < ht[1], h -> h + 1).allMatch(h ->
                        IntStream.range(0, n).allMatch(j ->
                            comp[j] >= 0 || s[queue[h]].charAt(j) != '1' || ((comp[j] = i) >= 0 && (queue[ht[1]++] = j) >= 0))))
            && IntStream.range(0, n).mapToLong(i -> comp[i] * 1024L + p[i]).sorted().map(x -> x & 1023).toArray() instanceof long[] vals
            && IntStream.range(0, n).mapToLong(i -> comp[i] * 1024L + i).sorted().map(x -> x & 1023).toArray() instanceof long[] poss
            && new int[n] instanceof int[] res
            && IntStream.range(0, n).allMatch(k -> (res[(int) poss[k]] = (int) vals[k]) > 0)
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}
