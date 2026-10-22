import java.io.*;
import java.util.*;

public class Main {
    static long[] X, Y;
    static long best = Long.MAX_VALUE;
    static long[] tx, ty;

    static void upd(int i, int j) {
        long dx = X[i] - X[j], dy = Y[i] - Y[j];
        long d = dx * dx + dy * dy;
        if (d < best) best = d;
    }

    // points sorted by x; after call, sorted by y in [l,r)
    static void rec(int l, int r) {
        if (r - l <= 3) {
            for (int i = l; i < r; i++) for (int j = i + 1; j < r; j++) upd(i, j);
            // sort by y (insertion)
            for (int i = l + 1; i < r; i++) {
                long x = X[i], y = Y[i];
                int j = i - 1;
                while (j >= l && Y[j] > y) { X[j + 1] = X[j]; Y[j + 1] = Y[j]; j--; }
                X[j + 1] = x; Y[j + 1] = y;
            }
            return;
        }
        int mid = (l + r) >>> 1;
        long midx = X[mid];
        rec(l, mid);
        rec(mid, r);
        // merge by y
        int i = l, j = mid, k = l;
        while (i < mid && j < r) {
            if (Y[i] <= Y[j]) { tx[k] = X[i]; ty[k] = Y[i]; i++; } else { tx[k] = X[j]; ty[k] = Y[j]; j++; }
            k++;
        }
        while (i < mid) { tx[k] = X[i]; ty[k] = Y[i]; i++; k++; }
        while (j < r) { tx[k] = X[j]; ty[k] = Y[j]; j++; k++; }
        for (k = l; k < r; k++) { X[k] = tx[k]; Y[k] = ty[k]; }
        int cnt = 0;
        int[] strip = new int[r - l];
        for (k = l; k < r; k++) {
            long dx = X[k] - midx;
            if (dx * dx < best) {
                for (int q = cnt - 1; q >= 0; q--) {
                    long dy = Y[k] - Y[strip[q]];
                    if (dy * dy >= best) break;
                    upd(k, strip[q]);
                }
                strip[cnt++] = k;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        in.nextToken();
        int n = (int) in.nval;
        X = new long[n]; Y = new long[n]; tx = new long[n]; ty = new long[n];
        long s = 0;
        for (int i = 0; i < n; i++) {
            in.nextToken();
            s += (long) in.nval;
            X[i] = i; Y[i] = s;
        }
        rec(0, n);
        System.out.println(best);
    }
}
