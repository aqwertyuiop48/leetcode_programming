import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            IntStream.generate(s::nextInt).limit(s.nextInt()).boxed().collect(Collectors.toSet()) instanceof Set<Integer> st
            ? IntStream.iterate(1, i -> i + 1).filter(i -> !st.contains(i)).findFirst().getAsInt() : 0));
    }
}


