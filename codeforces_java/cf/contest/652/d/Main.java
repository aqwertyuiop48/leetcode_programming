import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && Integer.valueOf(st.nextToken()) instanceof Integer n
            && new long[n] instanceof long[] l && new long[n] instanceof long[] r
            && IntStream.range(0, n).filter(i -> (l[i] = Long.parseLong(st.nextToken()) + 1000000000L) + 0 * (r[i] = Long.parseLong(st.nextToken()) + 1000000000L) < 0).count() == 0
            && IntStream.range(0, n).mapToLong(i -> (l[i] << 18) | i).sorted().toArray() instanceof long[] lk
            && IntStream.range(0, n).mapToLong(i -> (r[i] << 18) | i).sorted().toArray() instanceof long[] rks
            && new int[n] instanceof int[] rank && new int[262146] instanceof int[] bit && new int[n] instanceof int[] ans && new int[1] instanceof int[] q && new int[1] instanceof int[] u
            && IntStream.range(0, n).filter(j -> (rank[(int) (rks[j] & 262143)] = j + 1) < 0).count() == 0
            && IntStream.range(0, n).filter(j -> Integer.valueOf((int) (lk[n - 1 - j] & 262143)) instanceof Integer idx
                && (ans[idx] = bit[q[0] = rank[idx] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1] + bit[q[0] &= q[0] - 1]) + 0 * (u[0] = rank[idx]) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) + (bit[u[0]]++ + 0 * (u[0] = Math.min(u[0] + (u[0] & -u[0]), 262145))) < 0).count() == 0
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(String.valueOf((char) 10))) : "");
    }
}
