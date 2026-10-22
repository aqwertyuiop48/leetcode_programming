import java.io.*;
import java.util.*;

public class Main {
    static int k;
    static int[] c, rem, kids;
    static int leaves;

    static boolean go(int idx) {
        if (idx == k) {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                if (kids[i] + rem[i] < 2) return false;
                sum += rem[i];
            }
            return sum == leaves;
        }
        for (int p = 0; p < idx; p++) {
            if (rem[p] >= c[idx]) {
                // symmetry: skip identical-state parents
                boolean dup = false;
                for (int q = 0; q < p; q++) if (c[q] == c[p] && rem[q] == rem[p] && kids[q] == kids[p]) { dup = true; break; }
                if (dup) continue;
                rem[p] -= c[idx];
                kids[p]++;
                if (go(idx + 1)) return true;
                rem[p] += c[idx];
                kids[p]--;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        leaves = 0;
        ArrayList<Integer> in = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            if (a[i] == 1) leaves++; else in.add(a[i]);
        }
        if (n == 1) { System.out.println(a[0] == 1 ? "YES" : "NO"); return; }
        if (leaves * 2 <= n) { System.out.println("NO"); return; }
        Collections.sort(in, Collections.reverseOrder());
        k = in.size();
        c = new int[k];
        for (int i = 0; i < k; i++) { c[i] = in.get(i); if (c[i] == 2) { System.out.println("NO"); return; } }
        if (k == 0 || c[0] != n || (k > 1 && c[1] == n)) { System.out.println("NO"); return; }
        rem = new int[k];
        kids = new int[k];
        for (int i = 0; i < k; i++) rem[i] = c[i] - 1;
        System.out.println(go(1) ? "YES" : "NO");
    }
}
