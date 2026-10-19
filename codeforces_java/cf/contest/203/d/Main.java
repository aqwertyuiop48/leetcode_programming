import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Double.valueOf(s.nextDouble()) instanceof Double a && Double.valueOf(s.nextDouble()) instanceof Double b && Double.valueOf(s.nextDouble()) instanceof Double m
            && Double.valueOf(s.nextDouble()) instanceof Double vx && Double.valueOf(s.nextDouble()) instanceof Double vy && Double.valueOf(s.nextDouble()) instanceof Double vz
            && Double.valueOf(m / -vy) instanceof Double t
            && ((DoubleBinaryOperator) (p, l) -> Double.valueOf(p - 2 * l * Math.floor(p / (2 * l))) instanceof Double q ? q > l ? 2 * l - q : q : 0) instanceof DoubleBinaryOperator refl
            ? String.format("%.10f %.10f", refl.applyAsDouble(a / 2 + vx * t, a), refl.applyAsDouble(vz * t, b)) : "");
    }
}
