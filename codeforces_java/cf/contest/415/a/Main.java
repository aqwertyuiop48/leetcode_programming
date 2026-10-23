import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, m).map(i -> s.nextInt()).toArray() instanceof int[] b
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(IntStream.of(b).filter(x -> x <= i).findFirst().getAsInt())).collect(Collectors.joining(" ")) : "");
    }
}
