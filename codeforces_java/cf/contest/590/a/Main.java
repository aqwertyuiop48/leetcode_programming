import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] nums && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                : st[2] == 1 && (nums[st[1]++] = st[0]) >= 0 && (st[0] = 0) + (st[2] = 0) == 0).count() >= 0
            && (Integer) nums[0] instanceof Integer n && Arrays.copyOfRange(nums, 1, n + 1) instanceof int[] a && a.clone() instanceof int[] res
            && IntStream.range(0, n).map(i -> i == 0 || i == n - 1 || a[i] == a[i - 1] || a[i] == a[i + 1] ? 0 : 1).toArray() instanceof int[] un
            && new int[n + 1] instanceof int[] end
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).filter(i -> (end[i] = un[i] == 0 ? -1 : i + 1 < n && un[i + 1] == 1 ? end[i + 1] : i) >= -1).count() >= 0
            && new int[1] instanceof int[] steps
            && IntStream.range(0, n).filter(l -> un[l] == 1 && un[l - 1] == 0 && (Integer) end[l] instanceof Integer r && (Integer) (r - l + 1) instanceof Integer len
                && (steps[0] = Math.max(steps[0], (len + 1) / 2)) >= 0
                && IntStream.rangeClosed(l, r).filter(j -> (res[j] = a[l - 1] == a[r + 1] ? a[l - 1] : j - l < len / 2 ? a[l - 1] : a[r + 1]) >= 0).count() >= 0).count() >= 0
            ? steps[0] + "\n" + Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
