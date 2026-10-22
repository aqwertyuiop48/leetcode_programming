import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int run = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(st.nextToken());
            if (v <= t) { run++; if (run >= c) ans++; } else run = 0;
        }
        System.out.println(ans);
    }
}
