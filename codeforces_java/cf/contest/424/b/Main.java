import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long sp = s.nextLong();
        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) {
            long x = s.nextLong(), y = s.nextLong(), k = s.nextLong();
            a[i][0] = x * x + y * y; a[i][1] = k;
        }
        Arrays.sort(a, (p, q) -> Long.compare(p[0], q[0]));
        long need = 1000000 - sp;
        if (need <= 0) { System.out.println("0.0000000"); return; }
        long cur = 0;
        for (int i = 0; i < n; i++) {
            cur += a[i][1];
            if (cur >= need) { System.out.printf("%.7f%n", Math.sqrt((double) a[i][0])); return; }
        }
        System.out.println(-1);
    }
}
