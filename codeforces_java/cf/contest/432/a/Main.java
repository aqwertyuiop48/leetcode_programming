import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            ? IntStream.range(0, n).filter(i -> s.nextInt() + k <= 5).count() / 3 : 0);
    }
}
