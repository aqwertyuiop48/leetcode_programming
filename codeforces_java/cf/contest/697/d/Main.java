import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && Integer.valueOf(Integer.parseInt(st.nextToken())) instanceof Integer n
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] sz && new double[n + 1] instanceof double[] e
            && IntStream.rangeClosed(2, n).filter(i -> (par[i] = Integer.parseInt(st.nextToken())) > 0).count() >= 0
            && IntStream.range(0, n + 1).filter(i -> (sz[i] = 1) > 0).count() >= 0
            && IntStream.range(0, n - 1).filter(k -> (sz[par[n - k]] += sz[n - k]) > 0).count() >= 0 && (e[1] = 1) == 1
            && IntStream.rangeClosed(2, n).filter(i -> (e[i] = e[par[i]] + 1 + (sz[par[i]] - 1 - sz[i]) / 2.0) > 0).count() >= 0
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(e[i])).collect(Collectors.joining(" ")) : "");
    }
}
