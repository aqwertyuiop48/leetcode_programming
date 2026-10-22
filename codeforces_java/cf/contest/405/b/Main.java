import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();
        char l = 'L';
        int last = -1; // index of last non-dot, -1 virtual
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            char c = i == n ? 'R' : s.charAt(i);
            if (c == '.') continue;
            int len = i - last - 1;
            if (l == 'L' && c == 'R') ans += len;
            else if (l == 'R' && c == 'L') ans += len % 2;
            l = c; last = i;
        }
        System.out.println(ans);
    }
}
