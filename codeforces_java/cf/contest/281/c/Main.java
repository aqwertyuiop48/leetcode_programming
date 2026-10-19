import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner in
            && Integer.valueOf(in.nextInt()) instanceof Integer w0 && Integer.valueOf(in.nextInt()) instanceof Integer h0 && Integer.valueOf(in.nextInt()) instanceof Integer al
            && Double.valueOf(Math.max(w0, h0)) instanceof Double w && Double.valueOf(Math.min(w0, h0)) instanceof Double h
            && Double.valueOf(Math.toRadians(al > 90 ? 180 - al : al)) instanceof Double a
            && Double.valueOf(Math.sin(a)) instanceof Double s && Double.valueOf(Math.cos(a)) instanceof Double c
            ? String.format("%.9f", a >= 2 * Math.atan2(h, w) - 1e-12 ? h * h / s
                : Double.valueOf(2 * c * (1 + c)) instanceof Double det
                    && Double.valueOf((w * (1 + c) - s * h) / det) instanceof Double x && Double.valueOf((h * (1 + c) - s * w) / det) instanceof Double y
                    ? w * h - (x * x + y * y) * s * c : 0.0) : "");
    }
}
