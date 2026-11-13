import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && IntStream.range(0, 6).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] f
            && Long.valueOf(f[0]) instanceof Long fs && Long.valueOf(f[1]) instanceof Long fm && Long.valueOf(f[2]) instanceof Long fh && Long.valueOf(f[3]) instanceof Long fw && Long.valueOf(f[4]) instanceof Long fd && Long.valueOf(f[5]) instanceof Long fmo
            && ((IntUnaryOperator) from -> IntStream.range(from, 86400).filter(x -> (fh == -1 || x / 3600 == fh) && (fm == -1 || x / 60 % 60 == fm) && (fs == -1 || x % 60 == fs)).findFirst().orElse(-1)) instanceof IntUnaryOperator ft
            && Integer.valueOf(ft.applyAsInt(0)) instanceof Integer t0
            && ((LongPredicate) d -> Long.valueOf(d + 719468) instanceof Long z && Long.valueOf(z / 146097) instanceof Long era && Long.valueOf(z - era * 146097) instanceof Long doe
                && Long.valueOf((doe - doe / 1460 + doe / 36524 - doe / 146096) / 365) instanceof Long yoe && Long.valueOf(doe - (365 * yoe + yoe / 4 - yoe / 100)) instanceof Long doy
                && Long.valueOf((5 * doy + 2) / 153) instanceof Long mp && Long.valueOf(doy - (153 * mp + 2) / 5 + 1) instanceof Long dd && Long.valueOf(mp < 10 ? mp + 3 : mp - 9) instanceof Long mon && Long.valueOf((d + 3) % 7 + 1) instanceof Long dw
                && (fmo == -1 || mon.longValue() == fmo) && (fd == -1 && fw == -1 ? true : fd != -1 && fw != -1 ? dd.longValue() == fd || dw.longValue() == fw : fd != -1 ? dd.longValue() == fd : dw.longValue() == fw)) instanceof LongPredicate dayOK
            && Integer.valueOf(tk.nextToken()) instanceof Integer n
            ? IntStream.range(0, n).mapToObj(i -> Long.valueOf(Long.parseLong(tk.nextToken()) + 1) instanceof Long tg && Long.valueOf(tg / 86400) instanceof Long d0 && Integer.valueOf((int) (tg % 86400)) instanceof Integer tod
                && Long.valueOf(LongStream.iterate(d0, d -> d + 1).filter(d -> dayOK.test(d) && (d != d0 || ft.applyAsInt(tod) >= 0)).findFirst().getAsLong()) instanceof Long day
                ? Long.toString(day * 86400 + (day.longValue() == d0.longValue() ? ft.applyAsInt(tod) : t0)) : "").collect(Collectors.joining("\n")) : "");
    }
}
