import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).nextLine().trim() instanceof String line && line.split(":-", -1) instanceof String[] parts
            && Arrays.stream(parts[0].split("[^_]+")).filter(s -> !s.isEmpty()).map(String::length).toList() instanceof List<Integer> jaw
            && Arrays.stream(parts[1].split("[,.]")).filter(s -> !s.isBlank()).map(s -> s.split("[<>]") instanceof String[] ab ? s.indexOf('<') >= 0 ? new int[] {ab[0].trim().length(), ab[1].trim().length()} : new int[] {ab[1].trim().length(), ab[0].trim().length()} : null).toList() instanceof List<int[]> edges
            && new int[line.length() + 2] instanceof int[] fixed && Arrays.fill(fixed, -1) == null || true
            ? ((BooleanSupplier) () -> new int[line.length() + 2] instanceof int[] lo && new int[line.length() + 2] instanceof int[] hi
                && IntStream.range(0, lo.length).allMatch(i -> (lo[i] = Math.max(fixed[i], 0)) >= 0 && (hi[i] = fixed[i] >= 0 ? fixed[i] : 9) >= 0)
                && IntStream.range(0, 100).allMatch(r -> edges.stream().allMatch(e -> (lo[e[1]] = Math.max(lo[e[1]], lo[e[0]] + 1)) >= 0) && edges.stream().allMatch(e -> (hi[e[0]] = Math.min(hi[e[0]], hi[e[1]] - 1)) > Integer.MIN_VALUE))
                && IntStream.range(0, lo.length).allMatch(i -> lo[i] <= hi[i])) instanceof BooleanSupplier feas
                ? feas.getAsBoolean() && jaw.stream().distinct().allMatch(x -> IntStream.range(0, 10).filter(v -> (fixed[x] = v) >= 0 && feas.getAsBoolean()).findFirst().isPresent())
                    ? jaw.stream().map(x -> String.valueOf(fixed[x])).collect(Collectors.joining()) : "false" : "" : "");
    }
}
