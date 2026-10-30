import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).split("[ \r\n]+") instanceof String[] tk && (Integer) Integer.parseInt(tk[0]) instanceof Integer n && (Integer) Integer.parseInt(tk[1]) instanceof Integer q
            && new TreeMap<Integer, int[]>() instanceof TreeMap<Integer, int[]> tm
            ? IntStream.range(0, q).mapToObj(i -> (Integer) Integer.parseInt(tk[2 + 3 * i]) instanceof Integer x && (Integer) Integer.parseInt(tk[3 + 3 * i]) instanceof Integer y && (Boolean) tk[4 + 3 * i].equals("U") instanceof Boolean up
                ? tm.containsKey(x) ? "0"
                    : (Integer) (up ? (tm.higherEntry(x) instanceof Map.Entry<Integer, int[]> hi ? (hi.getValue()[0] == 1 ? hi.getValue()[1] : 0) + y - (n + 1 - hi.getKey()) : y)
                        : (tm.lowerEntry(x) instanceof Map.Entry<Integer, int[]> lo ? (lo.getValue()[0] == 0 ? lo.getValue()[1] : 0) + x - lo.getKey() : x)) instanceof Integer res
                    && tm.put(x, new int[]{up ? 1 : 0, res}) == null ? String.valueOf(res) : ""
                : "").collect(Collectors.joining("\n")) : "");
    }
}
