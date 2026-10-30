import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String a && s.next() instanceof String b && s.next() instanceof String c
            && (Function<String, int[]>) (t -> IntStream.range(0, 26).map(k -> (int) t.chars().filter(h -> h == 'a' + k).count()).toArray()) instanceof Function<String, int[]> f
            && f.apply(a) instanceof int[] ca && f.apply(b) instanceof int[] cb && f.apply(c) instanceof int[] cc
            && (Integer) IntStream.range(0, 26).filter(k -> cb[k] > 0).map(k -> ca[k] / cb[k]).min().getAsInt() instanceof Integer mx
            && (IntUnaryOperator) (x -> IntStream.range(0, 26).filter(k -> cc[k] > 0).map(k -> (ca[k] - x * cb[k]) / cc[k]).min().getAsInt()) instanceof IntUnaryOperator yf
            && IntStream.rangeClosed(0, mx).boxed().max(Comparator.<Integer>comparingInt(x -> x + yf.applyAsInt(x))).get() instanceof Integer bx
            && (Integer) yf.applyAsInt(bx) instanceof Integer by
            ? b.repeat(bx) + c.repeat(by) + IntStream.range(0, 26).mapToObj(k -> String.valueOf((char) ('a' + k)).repeat(ca[k] - bx * cb[k] - by * cc[k])).collect(Collectors.joining()) : "");
    }
}
