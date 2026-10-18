import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToInt(Integer::parseInt).toArray() instanceof int[] in
            && Integer.valueOf(in[0]) instanceof Integer n
            && Arrays.copyOfRange(in, 2, 2 + n) instanceof int[] a
            && new TreeSet<Long>() instanceof TreeSet<Long> set
            && IntStream.range(0, n).allMatch(i -> a[i] == 0 || set.add(((long) a[i] << 20) | i))
            && new StringBuilder() instanceof StringBuilder sb
            && new int[1] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> set.isEmpty()
                || (set.pollLast() instanceof Long t
                    && Long.valueOf(t >> 20) instanceof Long d
                    && set.size() >= d
                    && Stream.generate(set::pollLast).limit(d).toList() instanceof List<Long> top
                    && top.stream().allMatch(x ->
                        sb.append((t & 1048575) + 1).append(' ').append((x & 1048575) + 1).append('\n') != null
                        && ++cnt[0] > 0
                        && ((x >> 20) > 1 ? set.add(x - (1L << 20)) : true))))
            && set.isEmpty()
            ? "Yes\n" + cnt[0] + "\n" + sb.toString().stripTrailing()
            : "No");
    }
}
