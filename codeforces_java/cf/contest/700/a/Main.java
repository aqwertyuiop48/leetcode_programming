import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Double.valueOf(sc.nextInt()) instanceof Double n && Double.valueOf(sc.nextInt()) instanceof Double l
            && Double.valueOf(sc.nextInt()) instanceof Double v1 && Double.valueOf(sc.nextInt()) instanceof Double v2 && Double.valueOf(sc.nextInt()) instanceof Double k
            && Double.valueOf(Math.ceil(n / k)) instanceof Double g
            && Double.valueOf(l / (1 + 2 * (g - 1) * v1 / (v1 + v2))) instanceof Double d
            ? String.format(Locale.ROOT, "%.10f", d / v2 + (l - d) / v1) : "");
    }
}
