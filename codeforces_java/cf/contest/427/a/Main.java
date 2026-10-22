import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long free = 0, bad = 0;
        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(st.nextToken());
            if (v == -1) { if (free > 0) free--; else bad++; }
            else free += v;
        }
        System.out.println(bad);
    }
}
