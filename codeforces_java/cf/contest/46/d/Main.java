import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[]{s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] lbf
                && new int[]{s.nextInt()} instanceof int[] qa
                && new ArrayList<int[]>() instanceof ArrayList<int[]> cars
                && new int[qa[0] + 1][] instanceof int[][] byReq
                && IntStream.rangeClosed(1, qa[0]).mapToObj(qi ->
                    new int[]{s.nextInt(), s.nextInt()} instanceof int[] tv
                    ? tv[0] == 1
                        ? IntStream.rangeClosed(0, cars.size()).filter(g ->
                                (g == 0 ? 0 : cars.get(g - 1)[1] + lbf[1]) + tv[1] + (g == cars.size() ? 0 : lbf[2]) <= (g == cars.size() ? lbf[0] : cars.get(g)[0])).findFirst() instanceof OptionalInt g
                            ? g.isEmpty()
                                ? "-1"
                                : (Integer) (g.getAsInt() == 0 ? 0 : cars.get(g.getAsInt() - 1)[1] + lbf[1]) instanceof Integer start
                                    && (byReq[qi] = new int[]{start, start + tv[1]}) != null
                                    && cars.addAll(g.getAsInt(), List.of(byReq[qi]))
                                    ? String.valueOf(start)
                                    : ""
                            : ""
                        : cars.remove(byReq[tv[1]]) ? "" : ""
                    : "").filter(o -> !o.isEmpty()).collect(Collectors.joining("\n")) instanceof String out
                ? out
                : ""));
    }
}
