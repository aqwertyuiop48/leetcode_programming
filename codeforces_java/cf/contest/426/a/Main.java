import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long s = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long sum = 0, mx = 0;
        for (int i = 0; i < n; i++) {
            long v = Long.parseLong(st.nextToken());
            sum += v;
            mx = Math.max(mx, v);
        }
        System.out.println(sum - mx <= s ? "YES" : "NO");
    }
}
