import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new BufferedReader(new InputStreamReader(System.in)).lines().map(x -> x.replaceAll("\\s", "")).filter(x -> !x.isEmpty()).toList()).ifPresent(l -> Optional.of(new int[2]).ifPresent(c -> Optional.of(l.subList(1, Math.min(l.size(), Integer.parseInt(l.get(0)) + 1)).stream().map(t -> new long[]{2 * Long.parseLong(t.substring(1, t.indexOf(','))) + (t.charAt(0) == '(' ? 1 : 0), 2 * Long.parseLong(t.substring(t.indexOf(',') + 1, t.length() - 1)) - (t.charAt(t.length() - 1) == ')' ? 1 : 0)}).filter(p -> p[0] <= p[1]).flatMap(p -> Stream.of(new long[]{p[0], 1}, new long[]{p[1] + 1, -1})).sorted(Comparator.<long[]>comparingLong(x -> x[0]).thenComparingLong(x -> x[1])).mapToInt(ev -> c[1] = Math.max(c[1], c[0] += (int) ev[1])).sum()).ifPresent(z -> System.out.print(c[1]))));
    }
}

