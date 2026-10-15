import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.range(0, s.nextInt()).map(i -> s.nextInt()).toArray()).ifPresent(a -> System.out.print(
            Arrays.stream(a).sum() % a.length != 0 ? "Unrecoverable configuration."
            : Arrays.stream(a).filter(x -> x != Arrays.stream(a).sum() / a.length).count() == 0 ? "Exemplary pages."
            : Arrays.stream(a).filter(x -> x != Arrays.stream(a).sum() / a.length).count() != 2 ? "Unrecoverable configuration."
            : (Arrays.stream(a).sum() / a.length - Arrays.stream(a).min().getAsInt()) + " ml. from cup #" + (IntStream.range(0, a.length).boxed().min(Comparator.comparingInt(i -> a[i])).get() + 1) + " to cup #" + (IntStream.range(0, a.length).boxed().max(Comparator.comparingInt(i -> a[i])).get() + 1) + ".")));
    }
}

