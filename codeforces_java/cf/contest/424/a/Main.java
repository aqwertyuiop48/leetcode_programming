import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[] c = s.next().toCharArray();
        int up = 0;
        for (char ch : c) if (ch == 'X') up++;
        int ch = 0;
        for (int i = 0; i < n && up < n / 2; i++) if (c[i] == 'x') { c[i] = 'X'; up++; ch++; }
        for (int i = 0; i < n && up > n / 2; i++) if (c[i] == 'X') { c[i] = 'x'; up--; ch++; }
        System.out.println(ch);
        System.out.println(new String(c));
    }
}
