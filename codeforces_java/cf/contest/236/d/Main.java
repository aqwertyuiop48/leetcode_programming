import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new double[]{0, 0} instanceof double[] st
            ? String.format("%.15f", IntStream.range(0, n).mapToDouble(i -> Double.valueOf(s.nextDouble()) instanceof Double p && Double.valueOf(p * (2 * st[0] + 1)) instanceof Double add && (st[0] = (st[0] + 1) * p) >= 0 ? add : 0).sum()) : "");
    }
}
