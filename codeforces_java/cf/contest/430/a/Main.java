import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] key = new long[n];
        for (int i = 0; i < n; i++) key[i] = Long.parseLong(st.nextToken()) * 1024 + i;
        // coordinates up to 100, so encoding is safe
        Arrays.sort(key);
        int[] col = new int[n];
        for (int i = 0; i < n; i++) col[(int) (key[i] & 1023)] = i & 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(col[i]).append(i + 1 < n ? " " : "\n");
        System.out.print(sb);
    }
}
