import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.range(0, 4).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? s.next().chars().map(c -> a[c - '1']).sum() : 0);
    }
}
