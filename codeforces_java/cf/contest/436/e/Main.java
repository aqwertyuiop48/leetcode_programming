import java.util.*;
import java.io.*;

public class Main {
    static final long OFF = 2000000000L;
    static int n;
    static long[] a, b;
    static int[] state;
    static PriorityQueue<Long> hA = new PriorityQueue<>(), hB = new PriorityQueue<>(), hC0 = new PriorityQueue<>(),
            hC1 = new PriorityQueue<>(), hD2 = new PriorityQueue<>();

    static long enc(long key, int idx) {
        return ((key + OFF) << 20) | idx;
    }

    static long keyOf(long e) {
        return (e >> 20) - OFF;
    }

    static int idxOf(long e) {
        return (int) (e & ((1 << 20) - 1));
    }

    // peek valid entry
    static long peek(PriorityQueue<Long> h, int need) {
        while (!h.isEmpty()) {
            long e = h.peek();
            if (state[idxOf(e)] == need) return e;
            h.poll();
        }
        return Long.MIN_VALUE;
    }

    static void push(int i) {
        if (state[i] == 0) {
            hA.add(enc(a[i], i));
            hC0.add(enc(b[i], i));
        } else if (state[i] == 1) {
            hB.add(enc(b[i] - a[i], i));
            hC1.add(enc(-a[i], i));
        } else {
            hD2.add(enc(-(b[i] - a[i]), i));
        }
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        n = (int) st.nval;
        st.nextToken();
        int w = (int) st.nval;
        a = new long[n];
        b = new long[n];
        state = new int[n];
        for (int i = 0; i < n; i++) {
            st.nextToken();
            a[i] = (long) st.nval;
            st.nextToken();
            b[i] = (long) st.nval;
            push(i);
        }
        long total = 0;
        final long NONE = Long.MIN_VALUE;
        for (int step = 0; step < w; step++) {
            long best = Long.MAX_VALUE;
            int op = -1;
            long eA = peek(hA, 0), eB = peek(hB, 1), eC0 = peek(hC0, 0), eC1 = peek(hC1, 1), eD2 = peek(hD2, 2);
            if (eA != NONE) {
                long c = keyOf(eA);
                if (c < best) { best = c; op = 0; }
            }
            if (eB != NONE) {
                long c = keyOf(eB);
                if (c < best) { best = c; op = 1; }
            }
            if (eC0 != NONE && eC1 != NONE) {
                long c = keyOf(eC0) + keyOf(eC1);
                if (c < best) { best = c; op = 2; }
            }
            if (eC0 != NONE && eD2 != NONE) {
                long c = keyOf(eC0) + keyOf(eD2);
                if (c < best) { best = c; op = 3; }
            }
            total += best;
            if (op == 0) {
                int i = idxOf(eA);
                state[i] = 1;
                push(i);
            } else if (op == 1) {
                int i = idxOf(eB);
                state[i] = 2;
                push(i);
            } else if (op == 2) {
                int i = idxOf(eC0), j = idxOf(eC1);
                state[i] = 2;
                state[j] = 0;
                push(i);
                push(j);
            } else {
                int i = idxOf(eC0), j = idxOf(eD2);
                state[i] = 2;
                state[j] = 1;
                push(i);
                push(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(total).append('\n');
        for (int i = 0; i < n; i++) sb.append(state[i]);
        sb.append('\n');
        System.out.print(sb);
    }
}
