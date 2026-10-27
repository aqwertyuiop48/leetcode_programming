import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, m).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? IntStream.of(0, 1).mapToLong(mode -> new PriorityQueue<Integer>(mode == 0 ? Comparator.<Integer>reverseOrder() : Comparator.<Integer>naturalOrder()) instanceof PriorityQueue<Integer> pq
                && Arrays.stream(a).allMatch(x -> pq.add(x))
                ? IntStream.range(0, n).mapToLong(i -> Integer.valueOf(pq.poll()) instanceof Integer x && (x - 1 <= 0 || pq.add(x - 1)) ? x : 0).sum() : 0).boxed().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}

