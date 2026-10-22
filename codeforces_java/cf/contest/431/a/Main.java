import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) a[i] = Integer.parseInt(st.nextToken());
        String s = br.readLine().trim();
        long r = 0;
        for (char ch : s.toCharArray()) r += a[ch - '1'];
        System.out.println(r);
    }
}
