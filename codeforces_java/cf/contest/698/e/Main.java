import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && IntStream.range(0, 6).map(i -> sc.nextInt()).toArray() instanceof int[] pr
            && IntStream.range(0, 86400).filter(x -> (pr[2] < 0 || x / 3600 == pr[2]) && (pr[1] < 0 || x / 60 % 60 == pr[1]) && (pr[0] < 0 || x % 60 == pr[0])).toArray() instanceof int[] tod
            && new IntPredicate[1] instanceof IntPredicate[] ok
            && (ok[0] = d -> Integer.valueOf(d + 719468) instanceof Integer z && Integer.valueOf(z / 146097) instanceof Integer era && Integer.valueOf(z - era * 146097) instanceof Integer doe
                && Integer.valueOf((doe - doe / 1460 + doe / 36524 - doe / 146096) / 365) instanceof Integer yoe && Integer.valueOf(doe - (365 * yoe + yoe / 4 - yoe / 100)) instanceof Integer doy
                && Integer.valueOf((5 * doy + 2) / 153) instanceof Integer mp && Integer.valueOf(doy - (153 * mp + 2) / 5 + 1) instanceof Integer dom && Integer.valueOf(mp < 10 ? mp + 3 : mp - 9) instanceof Integer mo
                && Integer.valueOf((d + 3) % 7 + 1) instanceof Integer dow
                && (pr[5] < 0 || mo == pr[5]) && (pr[3] < 0 && pr[4] < 0 || (pr[3] < 0 ? dom == pr[4] : pr[4] < 0 ? dow == pr[3] : dom == pr[4] || dow == pr[3]))) != null
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            ? IntStream.range(0, n).mapToObj(qi -> Long.valueOf(sc.nextLong() + 1) instanceof Long t && Integer.valueOf((int) (t / 86400)) instanceof Integer d && Integer.valueOf((int) (t % 86400)) instanceof Integer x
                && Integer.valueOf(Arrays.binarySearch(tod, x)) instanceof Integer bs && Integer.valueOf(bs >= 0 ? bs : -bs - 1) instanceof Integer pos
                ? (ok[0].test(d) && pos < tod.length ? d * 86400L + tod[pos] : IntStream.range(d + 1, d + 20000).filter(ok[0]).findFirst().getAsInt() * 86400L + tod[0]) : 0L)
                .map(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
