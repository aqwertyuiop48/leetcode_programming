import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Double) s.nextDouble() instanceof Double a && (Double) s.nextDouble() instanceof Double b && (Double) s.nextDouble() instanceof Double c
            && (Double) Math.sqrt(Math.max(0, b * b - 4 * a * c)) instanceof Double d
            ? d == 0 ? String.valueOf(-b / (2 * a) + 0.0) : String.valueOf(Math.min((-b - d) / (2 * a), (-b + d) / (2 * a))) + " " + Math.max((-b - d) / (2 * a), (-b + d) / (2 * a)) : "");
    }
}
