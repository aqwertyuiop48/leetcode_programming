import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            Optional.of(sc.nextInt()).ifPresent(n ->
            Optional.of(sc.hasNext() ? sc.next() : "").ifPresent(s ->
            Optional.of(s.chars().filter(c -> c != 61).toArray()).ifPresent(t ->
            Optional.of(new int[t.length + 1]).ifPresent(l ->
            Optional.of(new int[t.length + 1]).ifPresent(r ->
            Optional.of(new int[]{0}).ifPresent(c ->
                System.out.print(IntStream.range(0, 1).allMatch(z -> (l[0] = 1) > 0 && (r[t.length] = 1) > 0
                    && IntStream.range(1, t.length + 1).allMatch(j -> (l[j] = t[j - 1] == 82 ? l[j - 1] + 1 : 1) > 0)
                    && IntStream.range(0, t.length).allMatch(q -> (r[t.length - 1 - q] = t[t.length - 1 - q] == 76 ? r[t.length - q] + 1 : 1) > 0))
                    ? IntStream.range(0, n).map(i -> Math.max(l[(c[0] += i > 0 && s.charAt(i - 1) != '=' ? 1 : 0)], r[c[0]])).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : ""))))))));
    }
}



