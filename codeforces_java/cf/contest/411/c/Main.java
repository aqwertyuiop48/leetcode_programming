import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.range(0, 8).map(i -> s.nextInt()).toArray() instanceof int[] v
            && ((IntBinaryOperator) (o1, o2) -> (Integer) (o1 == 0 ? v[0] : v[2]) instanceof Integer d1 && (Integer) (o1 == 0 ? v[3] : v[1]) instanceof Integer at1
                && (Integer) (o2 == 0 ? v[4] : v[6]) instanceof Integer d2 && (Integer) (o2 == 0 ? v[7] : v[5]) instanceof Integer at2
                ? d1 > at2 && at1 > d2 ? 1 : d2 > at1 && at2 > d1 ? -1 : 0 : 0) instanceof IntBinaryOperator w
            ? IntStream.range(0, 2).anyMatch(o1 -> IntStream.range(0, 2).allMatch(o2 -> w.applyAsInt(o1, o2) == 1)) ? "Team 1"
                : IntStream.range(0, 2).allMatch(o1 -> IntStream.range(0, 2).anyMatch(o2 -> w.applyAsInt(o1, o2) == -1)) ? "Team 2" : "Draw" : "");
    }
}
