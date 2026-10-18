import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Double.valueOf(s.nextDouble()) instanceof Double x1 && Double.valueOf(s.nextDouble()) instanceof Double y1 && Double.valueOf(s.nextDouble()) instanceof Double r1
            && Double.valueOf(s.nextDouble()) instanceof Double x2 && Double.valueOf(s.nextDouble()) instanceof Double y2 && Double.valueOf(s.nextDouble()) instanceof Double r2
            && Double.valueOf(Math.hypot(x1 - x2, y1 - y2)) instanceof Double d
            ? String.format("%.15f", d >= r1 + r2 ? (d - r1 - r2) / 2 : d + Math.min(r1, r2) <= Math.max(r1, r2) ? (Math.max(r1, r2) - Math.min(r1, r2) - d) / 2 : 0.0)
            : "");
    }
}
