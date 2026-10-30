import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t && (Integer) Integer.parseInt(t[0]) instanceof Integer n && (Integer) Integer.parseInt(t[1]) instanceof Integer s
            && new long[100001] instanceof long[] sell && new long[100001] instanceof long[] buy
            && IntStream.range(0, n).filter(i -> t[2 + 3 * i].equals("S") ? (sell[Integer.parseInt(t[3 + 3 * i])] += Integer.parseInt(t[4 + 3 * i])) < 0 : (buy[Integer.parseInt(t[3 + 3 * i])] += Integer.parseInt(t[4 + 3 * i])) < 0).count() >= 0
            ? Stream.concat(IntStream.range(0, 100001).filter(p -> sell[p] > 0).limit(s).boxed().sorted(Comparator.reverseOrder()).map(p -> "S " + p + " " + sell[p]),
                IntStream.range(0, 100001).map(i -> 100000 - i).filter(p -> buy[p] > 0).limit(s).boxed().map(p -> "B " + p + " " + buy[p])).collect(Collectors.joining("\n"))
            : "");
    }
}
