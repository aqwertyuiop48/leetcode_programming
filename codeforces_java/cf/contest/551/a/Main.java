import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? Arrays.stream(a).mapToObj(x -> String.valueOf(1 + Arrays.stream(a).filter(y -> y > x).count())).collect(Collectors.joining(" ")) : "");
    }
}
