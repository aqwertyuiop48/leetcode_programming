import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(n -> Optional.of(s.next()).ifPresent(m ->
            System.out.println(
                ((Function<char[], String>) (arr -> arr.length == 1 || arr[0] != '0'
                        ? new String(arr)
                        : IntStream.range(1, arr.length).filter(i -> arr[i] != '0').findFirst().stream()
                            .mapToObj(i -> new StringBuilder(new String(arr)).deleteCharAt(i).insert(0, arr[i]).toString())
                            .findFirst().orElse(new String(arr)))) instanceof Function<char[], String> minimalArrangement
                && n.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString().toCharArray() instanceof char[] arr
                && minimalArrangement.apply(arr).equals(m)
                ? "OK"
                : "WRONG_ANSWER"))));
    }
}





