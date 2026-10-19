import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] len
            && IntStream.range(0, n).boxed().flatMap(r -> IntStream.range(0, len[r]).mapToObj(c -> new int[]{r + 1, c + 1})).toList() instanceof List<int[]> cells
            && cells.stream().mapToInt(c -> it.next()).toArray() instanceof int[] val
            && new int[val.length + 1] instanceof int[] pos && IntStream.range(0, val.length).allMatch(i -> (pos[val[i]] = i) >= 0)
            && new ArrayList<String>() instanceof ArrayList<String> sw
            && IntStream.range(0, val.length).allMatch(i -> val[i] == i + 1 || Integer.valueOf(pos[i + 1]) instanceof Integer j
                && sw.add(cells.get(i)[0] + " " + cells.get(i)[1] + " " + cells.get(j)[0] + " " + cells.get(j)[1])
                && (pos[val[i]] = j) >= 0 && (val[j] = val[i]) > 0 && (val[i] = i + 1) > 0 && (pos[i + 1] = i) >= 0)
            ? sw.size() + (sw.isEmpty() ? "" : "\n" + String.join("\n", sw)) : "");
    }
}
