import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && Integer.valueOf(Integer.parseInt(st.nextToken())) instanceof Integer n
            && new int[n + 1] instanceof int[] a && new int[n + 1] instanceof int[] vis && new int[n + 1] instanceof int[] reps && new int[]{0, 0} instanceof int[] cl
            && IntStream.rangeClosed(1, n).filter(i -> (a[i] = Integer.parseInt(st.nextToken())) > 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(i -> vis[i] == 0
                && IntStream.iterate(i, x -> vis[x] == 0, x -> a[x]).filter(x -> (vis[x] = i) > 0 && (cl[1] = x) > 0).count() >= 0
                && (vis[a[cl[1]]] != i || (reps[cl[0]++] = a[cl[1]]) > 0)).count() >= 0
            && Integer.valueOf(IntStream.range(0, cl[0]).map(j -> reps[j]).filter(x -> a[x] == x).findFirst().orElse(reps[0])) instanceof Integer r
            && Long.valueOf(IntStream.range(0, cl[0]).map(j -> reps[j]).filter(x -> a[x] != r && (a[x] = r) > 0).count()) instanceof Long ch
            ? ch + "\n" + IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(a[i])).collect(Collectors.joining(" ")) : "");
    }
}
