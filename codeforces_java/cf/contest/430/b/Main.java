import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
        int best = 0;
        for (int p = 0; p <= n; p++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < p; i++) list.add(a[i]);
            list.add(x);
            for (int i = p; i < n; i++) list.add(a[i]);
            boolean removed = false;
            while (true) {
                int m = list.size();
                int s = -1, e = -1;
                for (int i = 0; i < m; ) {
                    int j = i;
                    while (j < m && list.get(j).equals(list.get(i))) j++;
                    if (j - i >= 3) { s = i; e = j; break; }
                    i = j;
                }
                if (s < 0) break;
                removed = true;
                for (int q = e - 1; q >= s; q--) list.remove(q);
            }
            if (removed) best = Math.max(best, n + 1 - list.size() - 1);
        }
        System.out.println(best);
    }
}
