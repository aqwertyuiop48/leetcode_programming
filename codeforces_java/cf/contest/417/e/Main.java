import java.util.*;

public class Main {
    static int[] build(int n) {
        int[] a = new int[n];
        if (n == 1) { a[0] = 1; return a; }
        if (n == 2) { a[0] = 3; a[1] = 4; return a; }
        Arrays.fill(a, 1);
        if (n % 2 == 0) {
            a[n - 1] = (n - 2) / 2;
        } else {
            a[0] = 2;
            a[n - 1] = (n + 1) / 2;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int[] a = build(n), b = build(m);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append((long) a[i] * b[j]);
                sb.append(j + 1 < m ? ' ' : '\n');
            }
        }
        System.out.print(sb);
    }
}
