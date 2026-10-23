import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.rangeClosed(1, 1000).boxed().min(Comparator.comparingLong(h -> IntStream.range(0, n).filter(i -> a[i] != h + i * k).count())).get() instanceof Integer h
            ? IntStream.range(0, n).filter(i -> a[i] != h + i * k).count() + IntStream.range(0, n).filter(i -> a[i] != h + i * k)
                .mapToObj(i -> "\n" + (a[i] < h + i * k ? "+ " : "- ") + (i + 1) + " " + Math.abs(a[i] - h - i * k)).collect(Collectors.joining()) : "");
    }
}
