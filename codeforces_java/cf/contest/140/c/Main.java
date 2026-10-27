import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToLong(Long::parseLong).toArray() instanceof long[] in
            && Integer.valueOf((int) in[0]) instanceof Integer n
            && Arrays.stream(in, 1, n + 1).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting())) instanceof Map<Long, Long> cnt
            && new PriorityQueue<Long>(Comparator.reverseOrder()) instanceof PriorityQueue<Long> pq
            && cnt.entrySet().stream().allMatch(e -> pq.add(e.getValue() << 31 | e.getKey()))
            && new StringBuilder() instanceof StringBuilder sb
            && new int[1] instanceof int[] k
            && IntStream.range(0, n / 3).allMatch(i -> pq.size() < 3
                || (Stream.generate(pq::poll).limit(3).toList() instanceof List<Long> t
                    && sb.append(t.stream().mapToLong(v -> v & 0x7FFFFFFFL).boxed().sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining(" "))).append('\n') != null
                    && ++k[0] > 0
                    && t.stream().allMatch(v -> (v >> 31) <= 1 || pq.add(v - (1L << 31)))))
            ? k[0] + "\n" + sb.toString().stripTrailing()
            : "");
    }


}

