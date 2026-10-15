import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(s.nextInt()).ifPresent(k ->
            Optional.of(IntStream.generate(s::nextInt).limit(n).toArray()).ifPresent(a ->
            Optional.of(new double[]{0, 1000}).ifPresent(lh ->
                System.out.print(IntStream.range(0, 200).allMatch(it -> Optional.of((lh[0] + lh[1]) / 2).map(m ->
                    IntStream.of(a).mapToDouble(x -> x > m ? (x - m) * (1 - k / 100.0) : x - m).sum() >= 0 ? (lh[0] = m) : (lh[1] = m)).isPresent())
                    ? String.format(Locale.US, "%.9f", lh[0]) : ""))))));
    }
}

