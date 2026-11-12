import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Integer.valueOf(st.nextToken()) instanceof Integer m
            && new String[n] instanceof String[] nm
            && new int[n] instanceof int[] rg
            && new int[n] instanceof int[] sc
            && IntStream.range(0, n).allMatch(i -> (nm[i] = st.nextToken()) != null && (rg[i] = Integer.parseInt(st.nextToken())) > 0 && (sc[i] = Integer.parseInt(st.nextToken())) >= 0)
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> -sc[i])).collect(Collectors.groupingBy(i -> rg[i])) instanceof Map<Integer, List<Integer>> g
            ? IntStream.rangeClosed(1, m).mapToObj(r -> g.get(r) instanceof List<Integer> l
                ? (l.size() > 2 && sc[l.get(1)] == sc[l.get(2)] ? "?" : nm[l.get(0)] + " " + nm[l.get(1)])
                : "").collect(Collectors.joining("\n"))
            : "");
    }
}
