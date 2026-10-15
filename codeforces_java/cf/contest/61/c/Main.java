import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            System.out.println(
                sc.next() instanceof String a
                && sc.next() instanceof String b
                && new BigInteger(sc.next(), Integer.parseInt(a)) instanceof BigInteger v
                && new int[]{v.intValue()} instanceof int[] rem
                && List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1) instanceof List<Integer> vals
                && List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I") instanceof List<String> syms
                ? (b.equals("R")
                    ? IntStream.range(0, 13).mapToObj(i -> Optional.of(syms.get(i).repeat(rem[0] / vals.get(i))).filter(t -> (rem[0] %= vals.get(i)) >= 0).get()).collect(Collectors.joining())
                    : v.toString(Integer.parseInt(b)).toUpperCase())
                : ""));
    }
}


