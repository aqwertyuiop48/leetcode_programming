import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), k = sc.nextLong();
        if (n == 1) { System.out.println(k == 0 ? "1" : "-1"); return; }
        long m = n / 2;
        if (k < m) { System.out.println(-1); return; }
        long x = k - (m - 1);
        StringBuilder sb = new StringBuilder();
        sb.append(x).append(' ').append(2 * x);
        long cur = 2 * x + 1;
        for (long i = 2; i < n; i++) { sb.append(' ').append(cur++); }
        System.out.println(sb);
    }
}
