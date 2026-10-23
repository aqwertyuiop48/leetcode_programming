import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String in && in.substring(2, in.indexOf("):-")) instanceof String jaws && in.substring(in.indexOf(":-") + 2, in.length() - 1) instanceof String stom
            && Arrays.stream(jaws.split("[^_]+")).filter(x -> !x.isEmpty()).mapToInt(String::length).toArray() instanceof int[] runs
            && Arrays.stream(stom.split(",")).map(c -> c.contains("<") ? new int[]{c.split("[<>]")[0].length(), c.split("[<>]")[1].length()} : new int[]{c.split("[<>]")[1].length(), c.split("[<>]")[0].length()}).toArray(int[][]::new) instanceof int[][] cons
            && IntStream.concat(IntStream.of(runs), Arrays.stream(cons).flatMapToInt(c -> IntStream.of(c[0], c[1]))).distinct().toArray() instanceof int[] vars
            && new int[1100] instanceof int[] idxOf && IntStream.range(0, vars.length).allMatch(i -> (idxOf[vars[i]] = i) >= 0) && new int[vars.length] instanceof int[] fixed && IntStream.range(0, vars.length).allMatch(i -> (fixed[i] = -1) == -1)
            && ((java.util.function.BooleanSupplier) () -> new int[vars.length] instanceof int[] lo && new int[vars.length] instanceof int[] hi
                && IntStream.range(0, vars.length).allMatch(i -> (lo[i] = Math.max(fixed[i], 0)) >= 0 && (hi[i] = fixed[i] >= 0 ? fixed[i] : 9) >= 0)
                && (IntStream.range(0, 60).allMatch(r -> Arrays.stream(cons).allMatch(c -> (lo[idxOf[c[1]]] = Math.min(100, Math.max(lo[idxOf[c[1]]], lo[idxOf[c[0]]] + 1))) >= 0 && (hi[idxOf[c[0]]] = Math.max(-100, Math.min(hi[idxOf[c[0]]], hi[idxOf[c[1]]] - 1))) > -1000)) || true)
                && IntStream.range(0, vars.length).allMatch(i -> lo[i] <= hi[i])) instanceof java.util.function.BooleanSupplier feas
            && IntStream.range(0, vars.length).allMatch(i -> IntStream.rangeClosed(0, 9).anyMatch(v -> (fixed[i] = v) == v && feas.getAsBoolean()))
            && IntStream.range(0, vars.length).allMatch(i -> fixed[i] >= 0)
            ? IntStream.of(runs).mapToObj(r -> String.valueOf(fixed[idxOf[r]])).collect(Collectors.joining()) : "false");
    }
}
