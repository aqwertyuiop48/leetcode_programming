import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n * m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && new int[m] instanceof int[] tot && new int[n * m] instanceof int[] sent
            && IntStream.range(0, k).allMatch(i -> (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer x && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer y && ++tot[y] > 0 && ++sent[x * m + y] > 0)
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf(IntStream.range(0, m).filter(c -> a[i * m + c] == 1).map(c -> tot[c] - sent[i * m + c]).sum())).collect(Collectors.joining(" ")) : "");
    }
}
