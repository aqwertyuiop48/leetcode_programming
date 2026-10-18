import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> new int[]{rd.getAsInt(), rd.getAsInt(), rd.getAsInt()}).toList() instanceof List<int[]> bus
            && IntStream.range(0, m).mapToObj(i -> new int[]{rd.getAsInt(), rd.getAsInt(), rd.getAsInt()}).toList() instanceof List<int[]> man
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> bus.get(i)[2])).toList() instanceof List<Integer> ordT
            && new int[n] instanceof int[] rankOf
            && IntStream.range(0, n).allMatch(r -> (rankOf[ordT.get(r)] = r) >= 0)
            && ordT.stream().mapToInt(i -> bus.get(i)[2]).toArray() instanceof int[] ts
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> -bus.get(i)[1])).toList() instanceof List<Integer> ordF
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingInt((Integer j) -> -man.get(j)[1])).toList() instanceof List<Integer> ordP
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, n) * 2 - 1)) instanceof Integer sz
            && IntStream.generate(() -> Integer.MAX_VALUE).limit(2 * sz).toArray() instanceof int[] tr
            && IntStream.generate(() -> -1).limit(m).toArray() instanceof int[] ans
            && new int[]{0} instanceof int[] ptr
            && ordP.stream().allMatch(j ->
                IntStream.iterate(ptr[0], k -> k < n && bus.get(ordF.get(k))[1] >= man.get(j)[1], k -> k + 1)
                    .allMatch(k -> (tr[sz + rankOf[ordF.get(k)]] = bus.get(ordF.get(k))[0]) > 0
                        && IntStream.iterate((sz + rankOf[ordF.get(k)]) >> 1, i -> i >= 1, i -> i >> 1).allMatch(i -> (tr[i] = Math.min(tr[2 * i], tr[2 * i + 1])) > 0)
                        && (ptr[0] = k + 1) > 0)
                && Integer.valueOf(Arrays.binarySearch(ts, man.get(j)[2])) instanceof Integer bs
                && Integer.valueOf(bs >= 0 ? bs : -bs - 1) instanceof Integer lo
                && Integer.valueOf(lo >= n ? 0 : IntStream.iterate(lo + sz, i -> true, i -> (i >> Integer.numberOfTrailingZeros(~i)) == 0 ? 0 : (i >> Integer.numberOfTrailingZeros(~i)) + 1)
                    .filter(i -> i == 0 || tr[i] <= man.get(j)[0]).findFirst().getAsInt()) instanceof Integer first
                && (ans[j] = first == 0 ? -1 : ordT.get(IntStream.iterate(first, i -> true, i -> tr[2 * i] <= man.get(j)[0] ? 2 * i : 2 * i + 1).filter(i -> i >= sz).findFirst().getAsInt() - sz) + 1) != Integer.MIN_VALUE)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}
