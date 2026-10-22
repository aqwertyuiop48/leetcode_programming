import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] ans = new int[m];
        for (int r = 0; r < n; r++) {
            String s = br.readLine();
            for (int c = 0; c < m; c++) {
                char ch = s.charAt(c);
                if (r == 0) continue;
                if (ch == 'U') {
                    if (r % 2 == 0) ans[c]++;
                } else if (ch == 'L') {
                    if (c - r >= 0) ans[c - r]++;
                } else if (ch == 'R') {
                    if (c + r < m) ans[c + r]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) sb.append(ans[i]).append(i + 1 < m ? " " : "\n");
        System.out.print(sb);
    }
}
