import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt();
        if (2 * k > n - 1) { System.out.println(-1); return; }
        StringBuilder sb = new StringBuilder();
        sb.append((long) n * k).append('\n');
        for (int i = 0; i < n; i++)
            for (int j = 1; j <= k; j++)
                sb.append(i + 1).append(' ').append((i + j) % n + 1).append('\n');
        System.out.print(sb);
    }
}
