import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] rows = new String[n];
        for (int i = 0; i < n; i++) rows[i] = br.readLine().trim();
        while (n % 2 == 0) {
            boolean ok = true;
            for (int i = 0; i < n / 2 && ok; i++) if (!rows[i].equals(rows[n - 1 - i])) ok = false;
            // rows[n/2-1-i] vs rows[n/2+i]
            if (!ok) break;
            n /= 2;
        }
        System.out.println(n);
    }
}
