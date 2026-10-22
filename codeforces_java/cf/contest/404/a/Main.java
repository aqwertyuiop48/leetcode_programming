import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] g = new String[n];
        for (int i = 0; i < n; i++) g[i] = br.readLine().trim();
        char d = g[0].charAt(0), o = g[0].charAt(1);
        boolean ok = d != o;
        for (int i = 0; i < n && ok; i++)
            for (int j = 0; j < n; j++) {
                char c = g[i].charAt(j);
                if (i == j || i + j == n - 1) { if (c != d) { ok = false; break; } }
                else if (c != o) { ok = false; break; }
            }
        System.out.println(ok ? "YES" : "NO");
    }
}
