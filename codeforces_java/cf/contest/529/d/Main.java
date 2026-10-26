import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer t
            && new ArrayDeque<int[]>() instanceof ArrayDeque<int[]> dq && new int[]{0, 0} instanceof int[] st
            && IntStream.range(0, n).map(i -> s.next().split(":") instanceof String[] p ? Integer.parseInt(p[0]) * 3600 + Integer.parseInt(p[1]) * 60 + Integer.parseInt(p[2]) : 0).toArray() instanceof int[] ts
            && IntStream.range(0, n).map(i -> (Integer) ts[i] instanceof Integer cur
                && Stream.generate(() -> 0).takeWhile(z -> !dq.isEmpty() && dq.peekFirst()[1] + t <= cur).allMatch(z -> dq.pollFirst() != null)
                ? dq.size() < m ? (Integer) (++st[0]) instanceof Integer id && dq.offerLast(new int[]{id, cur}) ? (st[1] = Math.max(st[1], dq.size())) * 0 + id : 0
                    : (dq.peekLast()[1] = cur) * 0 + dq.peekLast()[0] + (st[1] = Math.max(st[1], dq.size())) * 0 : 0).toArray() instanceof int[] ids
            ? st[1] < m ? "No solution" : st[0] + "\n" + Arrays.stream(ids).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
