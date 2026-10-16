import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt(), s.nextInt()} instanceof int[] nm
            && new int[nm[0] + 1] instanceof int[] deg
            && IntStream.rangeClosed(0, nm[0]).toArray() instanceof int[] par
            && new int[1] instanceof int[] cyc
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr
            && fr.getAndSet(x -> par[x] == x ? x : (par[x] = fr.get().applyAsInt(par[x]))) == null
            && fr.get() instanceof IntUnaryOperator find
            && new ArrayList<String>() instanceof ArrayList<String> out
            && IntStream.range(0, nm[1]).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).allMatch(e ->
                (find.applyAsInt(e[0]) == find.applyAsInt(e[1]) ? cyc[0]++ >= 0 : (par[find.applyAsInt(e[0])] = find.applyAsInt(e[1])) >= 0)
                && ++deg[e[0]] > 0 && ++deg[e[1]] > 0)
            && IntStream.rangeClosed(1, nm[0]).allMatch(v -> deg[v] <= 2)
            ? (cyc[0] > 0
                ? (cyc[0] == 1 && IntStream.rangeClosed(1, nm[0]).allMatch(v -> deg[v] == 2) ? "YES\n0" : "NO")
                : (IntStream.rangeClosed(1, nm[0]).allMatch(i -> IntStream.rangeClosed(i + 1, nm[0]).allMatch(j ->
                        !(deg[i] < 2 && deg[j] < 2 && find.applyAsInt(i) != find.applyAsInt(j))
                        || (par[find.applyAsInt(i)] = find.applyAsInt(j)) >= 0 && ++deg[i] > 0 && ++deg[j] > 0 && out.add(i + " " + j)))
                    && IntStream.rangeClosed(1, nm[0]).filter(v -> deg[v] < 2).toArray() instanceof int[] ends
                    && out.add(ends[0] + " " + ends[ends.length - 1])
                    ? "YES\n" + out.size() + "\n" + String.join("\n", out)
                    : "NO"))
            : "NO");
    }
}




