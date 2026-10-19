import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? n - Arrays.stream(a).map(x -> (int) Arrays.stream(a).filter(y -> y >= x && y <= 2 * x).count()).max().getAsInt() : "");
    }
}
