import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).map(tk -> Arrays.stream(tk).mapToInt(Integer::parseInt).toArray()).map(t -> (Integer) t[0] instanceof Integer n && Arrays.copyOfRange(t, 1, n + 1) instanceof int[] a && IntStream.of(a).sorted().toArray() instanceof int[] so && IntStream.range(0, n).map(i -> Arrays.binarySearch(so, a[i])).toArray() instanceof int[] r && new int[n] instanceof int[] pos && IntStream.range(0, n).allMatch(i -> (pos[r[i]] = i) >= 0) && new ArrayList<String>() instanceof ArrayList<String> out && IntStream.range(0, n).filter(i -> Integer.toString(a[i]).chars().allMatch(c -> c == '4' || c == '7')).findFirst() instanceof OptionalInt lk ? (lk.isEmpty() ? (IntStream.range(0, n).allMatch(i -> r[i] == i) ? "0" : "-1") : (Integer) r[lk.getAsInt()] instanceof Integer tt && ((BiPredicate<Integer, Integer>) (x, y) -> (Integer) r[x] instanceof Integer rx && (Integer) r[y] instanceof Integer ry && (r[x] = ry) >= 0 && (r[y] = rx) >= 0 && (pos[ry] = x) >= 0 && (pos[rx] = y) >= 0 && out.add((x + 1) + " " + (y + 1))) instanceof BiPredicate<Integer, Integer> swap && IntStream.range(0, n).filter(i -> i != tt && r[i] != i).allMatch(i -> (pos[tt] == i || swap.test(pos[tt], i)) && swap.test(pos[i], i)) ? out.size() + (out.isEmpty() ? "" : "\n" + String.join("\n", out)) : "") : "").ifPresent(System.out::println);
    }
}
