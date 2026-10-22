import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        for (long x1 = 1; x1 < a; x1++) {
            long y2s = a * a - x1 * x1;
            long y1 = (long) Math.sqrt((double) y2s);
            while (y1 * y1 > y2s) y1--;
            while ((y1 + 1) * (y1 + 1) <= y2s) y1++;
            if (y1 * y1 != y2s || y1 == 0) continue;
            for (long x2 = 1; x2 < b; x2++) {
                long t = b * b - x2 * x2;
                long y2 = (long) Math.sqrt((double) t);
                while (y2 * y2 > t) y2--;
                while ((y2 + 1) * (y2 + 1) <= t) y2++;
                if (y2 * y2 != t || y2 == 0) continue;
                for (int sx = -1; sx <= 1; sx += 2) for (int sy = -1; sy <= 1; sy += 2) {
                    long vx = sx * x2, vy = sy * y2;
                    if (x1 * vx + y1 * vy != 0) continue;
                    if (x1 == vx || y1 == vy) continue;
                    System.out.println("YES\n0 0\n" + x1 + " " + y1 + "\n" + vx + " " + vy);
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
