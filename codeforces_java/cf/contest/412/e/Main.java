import java.util.*;
import java.io.*;
public class Main {
    static boolean letter(char c) { return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'); }
    static boolean digit(char c) { return c >= '0' && c <= '9'; }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) { System.out.println(0); return; }
        int n = s.length();
        int[] pl = new int[n + 1]; // letters prefix
        for (int i = 0; i < n; i++) pl[i + 1] = pl[i] + (letter(s.charAt(i)) ? 1 : 0);
        int[] runStart = new int[n]; // start of [A-Za-z0-9_] run ending at i
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean ok = letter(c) || digit(c) || c == '_';
            runStart[i] = ok ? (i > 0 && runStart[i - 1] >= 0 ? runStart[i - 1] : i) : -1;
        }
        int[] letRun = new int[n + 1]; // letters run length starting at i
        for (int i = n - 1; i >= 0; i--) letRun[i] = letter(s.charAt(i)) ? letRun[i + 1] + 1 : 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '@') continue;
            if (i == 0 || runStart[i - 1] < 0) continue;
            long ls = pl[i] - pl[runStart[i - 1]];
            if (ls == 0) continue;
            int j = i + 1;
            while (j < n && (letter(s.charAt(j)) || digit(s.charAt(j)))) j++;
            if (j == i + 1 || j >= n || s.charAt(j) != '.') continue;
            ans += ls * letRun[j + 1];
        }
        System.out.println(ans);
    }
}
