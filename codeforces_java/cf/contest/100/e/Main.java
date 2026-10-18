import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(Stream.generate(s::next).limit(n).map(x -> x.equals("on")).toList()).ifPresent(st -> Optional.of(new int[n + 1]).ifPresent(t -> Optional.of(IntStream.generate(s::nextInt).limit(s.nextInt()).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))).ifPresent(m -> Optional.of(m.entrySet().stream().filter(e -> e.getValue() % 2 == 1 && e.getKey() >= 1 && e.getKey() <= n).flatMapToInt(e -> IntStream.iterate(e.getKey(), j -> j <= n, j -> j + e.getKey())).map(j -> t[j] ^= 1).sum()).ifPresent(z -> System.out.print(IntStream.rangeClosed(1, n).mapToObj(i -> (st.get(i - 1) ^ (t[i] == 1)) ? "on" : "off").collect(Collectors.joining(" ")))))))));
    }
}




