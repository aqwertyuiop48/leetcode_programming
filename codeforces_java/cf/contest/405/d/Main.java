import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new boolean[1000002] instanceof boolean[] in
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] x
            && IntStream.of(x).allMatch(v -> (in[v] = true))
            ? n + "\n" + Stream.concat(IntStream.of(x).filter(v -> !in[1000001 - v]).mapToObj(v -> 1000001 - v),
                IntStream.rangeClosed(1, 500000).filter(z -> !in[z] && !in[1000001 - z]).limit(IntStream.of(x).filter(v -> v < 1000001 - v && in[1000001 - v]).count())
                    .boxed().flatMap(z -> Stream.of(z, 1000001 - z))).map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
