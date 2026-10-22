import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), a = s.nextInt(), b = s.nextInt();
        boolean[] like = new boolean[n + 1];
        for (int i = 0; i < a; i++) like[s.nextInt()] = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) sb.append(like[i] ? 1 : 2).append(i < n ? " " : "");
        System.out.println(sb);
    }
}
