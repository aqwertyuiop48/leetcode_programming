import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
        long best = Long.MIN_VALUE;
        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                int len = r - l + 1;
                int[] in = new int[len];
                int[] out = new int[n - len];
                int p = 0, q = 0;
                for (int i = 0; i < n; i++) {
                    if (i >= l && i <= r) in[p++] = a[i]; else out[q++] = a[i];
                }
                Arrays.sort(in);
                Arrays.sort(out);
                long sum = 0;
                for (int v : in) sum += v;
                int t = Math.min(k, Math.min(len, out.length));
                for (int i = 0; i < t; i++) {
                    int o = out[out.length - 1 - i];
                    if (o > in[i]) sum += o - in[i]; else break;
                }
                best = Math.max(best, sum);
            }
        }
        System.out.println(best);
    }
}
