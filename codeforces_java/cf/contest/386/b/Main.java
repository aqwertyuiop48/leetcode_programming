import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] t
            && Integer.valueOf(s.nextInt()) instanceof Integer T
            ? IntStream.range(0, n).map(i -> (int) Arrays.stream(t).filter(x -> x >= t[i] && x <= t[i] + T).count()).max().getAsInt() : "");
    }
}
