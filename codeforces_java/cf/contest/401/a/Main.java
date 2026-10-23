import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer x
            ? (Math.abs(IntStream.range(0, n).map(i -> s.nextInt()).sum()) + x - 1) / x : 0);
    }
}
