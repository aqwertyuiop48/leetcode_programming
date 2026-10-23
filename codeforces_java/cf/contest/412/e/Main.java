import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).toCharArray() instanceof char[] c
            && ((Predicate<Character>) ch -> Character.isLetterOrDigit(ch) && ch < 128 || ch == '_') instanceof Predicate<Character> loc
            ? IntStream.range(0, c.length).filter(i -> c[i] == '@').mapToLong(i ->
                Stream.iterate(i - 1, j -> j >= 0 && loc.test(c[j]), j -> j - 1).filter(j -> Character.isLetter(c[j]) && c[j] < 128).count()
                * ((Long) Stream.iterate(i + 1, j -> j < c.length && Character.isLetterOrDigit(c[j]) && c[j] < 128, j -> j + 1).count() instanceof Long dl && dl > 0 && i + 1 + dl < c.length && c[(int) (i + 1 + dl)] == '.'
                    ? Stream.iterate((int) (i + 2 + dl), j -> j < c.length && Character.isLetter(c[j]) && c[j] < 128, j -> j + 1).count() : 0)).sum() : 0);
    }
}
