import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n && new int[n] instanceof int[] ca && new int[n] instanceof int[] cb && new int[2 * n + 1] instanceof int[] pb && new int[2 * n + 1] instanceof int[] color && IntStream.range(0, n).filter(i -> (pb[ca[i] = Integer.parseInt(st.nextToken())] = cb[i] = Integer.parseInt(st.nextToken())) > 0 && (pb[cb[i]] = ca[i]) > 0).count() >= 0 && IntStream.rangeClosed(1, 2 * n).filter(v -> color[v] == 0 && IntStream.iterate(v, u -> pb[u] % 2 == 1 ? pb[u] + 1 : pb[u] - 1).takeWhile(u -> color[u] == 0).map(u -> (color[u] = 1) + (color[pb[u]] = 2)).max().isPresent()).count() >= 0 ? IntStream.range(0, n).mapToObj(i -> color[ca[i]] + " " + color[cb[i]]).collect(Collectors.joining("\n")) : "");
    }
}
