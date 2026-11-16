import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] nums
            && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 && raw[i] < 58
                ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[2] = 1)
                : raw[i] <= 32 && st[2] == 1 ? (nums[st[1]++] = st[0]) + (st[0] = 0) + (st[2] = 0) : 0) != Integer.MIN_VALUE || true).count() >= 0
            && (Integer) nums[0] instanceof Integer n
            && IntStream.rangeClosed(0, 4 * n).map(r -> r == 0 ? 0 : nums[3 * r - 2]).toArray() instanceof int[] ra
            && IntStream.rangeClosed(0, 4 * n).map(r -> r == 0 ? 0 : nums[3 * r - 1]).toArray() instanceof int[] rb
            && IntStream.rangeClosed(0, 4 * n).map(r -> r == 0 ? 0 : nums[3 * r]).toArray() instanceof int[] rc
            && new int[n + 1] instanceof int[] head
            && new int[8 * n + 2] instanceof int[] nx
            && new int[8 * n + 2] instanceof int[] er
            && new int[1] instanceof int[] ec
            && IntStream.rangeClosed(1, 4 * n).filter(r -> (er[++ec[0]] = r) > 0 && (nx[ec[0]] = head[rb[r]]) >= 0 && (head[rb[r]] = ec[0]) > 0
                && (rc[r] == rb[r] || (er[++ec[0]] = r) > 0 && (nx[ec[0]] = head[rc[r]]) >= 0 && (head[rc[r]] = ec[0]) > 0) || true).count() >= 0
            && IntStream.generate(() -> 4).limit(n + 1).toArray() instanceof int[] cnt
            && new boolean[4 * n + 1] instanceof boolean[] done
            && new ArrayDeque<Integer>(IntStream.rangeClosed(1, 4 * n).boxed().collect(Collectors.toList())) instanceof ArrayDeque<Integer> q
            && new ArrayList<Integer>() instanceof ArrayList<Integer> order
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).filter(r -> !done[r]
                && cnt[rb[r]] - (rb[r] == ra[r] ? 1 : 0) + 1 <= 9
                && cnt[rc[r]] - (rc[r] == ra[r] ? 1 : 0) + (rc[r] == rb[r] ? 1 : 0) + 1 <= 9
                && (done[r] = true) && cnt[ra[r]]-- > -1 && cnt[rb[r]]++ > -1 && cnt[rc[r]]++ > -1 && order.add(r)
                && IntStream.iterate(head[ra[r]], e -> e > 0, e -> nx[e]).filter(e -> q.add(er[e]) || true).count() >= 0 || true).count() >= 0
            ? (order.size() == 4 * n ? "YES\n" + order.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "NO")
            : "");
    }
}
