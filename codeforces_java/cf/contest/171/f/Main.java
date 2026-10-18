import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(12_000_000) instanceof Integer lim
            && new boolean[lim + 1] instanceof boolean[] comp
            && IntStream.rangeClosed(2, (int) Math.sqrt(lim)).filter(i -> !comp[i]).allMatch(i -> IntStream.iterate(i * i, j -> j <= lim, j -> j + i).allMatch(j -> (comp[j] = true)))
            && ((IntPredicate) x -> x <= lim ? x > 1 && !comp[x] : IntStream.rangeClosed(2, (int) Math.sqrt(x)).noneMatch(d -> x % d == 0)) instanceof IntPredicate prime
            ? IntStream.rangeClosed(2, lim).filter(p -> !comp[p] && Integer.valueOf(Integer.parseInt(new StringBuilder(String.valueOf(p)).reverse().toString())) instanceof Integer r && r != p && prime.test(r)).skip(n - 1).findFirst().getAsInt()
            : 0);
    }
}
