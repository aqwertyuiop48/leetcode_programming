import java.io.*;
import java.util.*;

public class Main {
    static int[] self(char[] s) {
        int n = s.length;
        int[] m = new int[n];
        int[] prev = new int[n + 2], cur = new int[n + 2];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                cur[j] = s[i] == s[j] ? prev[j + 1] + 1 : 0;
                if (i != j && cur[j] > m[i]) m[i] = cur[j];
            }
            int[] t = prev; prev = cur; cur = t;
        }
        return m;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().trim().toCharArray();
        char[] t = br.readLine().trim().toCharArray();
        int[] m1 = self(s), m2 = self(t);
        int n = s.length, m = t.length;
        int best = Integer.MAX_VALUE;
        int[] prev = new int[m + 2], cur = new int[m + 2];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                cur[j] = s[i] == t[j] ? prev[j + 1] + 1 : 0;
                int L = Math.max(m1[i], m2[j]) + 1;
                if (cur[j] >= L && L < best) best = L;
            }
            int[] tt = prev; prev = cur; cur = tt;
        }
        System.out.println(best == Integer.MAX_VALUE ? -1 : best);
    }
}
