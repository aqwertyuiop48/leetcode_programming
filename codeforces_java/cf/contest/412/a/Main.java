import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        if (k - 1 <= n - k) {
            for (int i = k; i > 1; i--) sb.append("LEFT\n");
            for (int i = 0; i < n; i++) {
                sb.append("PRINT ").append(s.charAt(i)).append('\n');
                if (i < n - 1) sb.append("RIGHT\n");
            }
        } else {
            for (int i = k; i < n; i++) sb.append("RIGHT\n");
            for (int i = n - 1; i >= 0; i--) {
                sb.append("PRINT ").append(s.charAt(i)).append('\n');
                if (i > 0) sb.append("LEFT\n");
            }
        }
        System.out.print(sb);
    }
}
