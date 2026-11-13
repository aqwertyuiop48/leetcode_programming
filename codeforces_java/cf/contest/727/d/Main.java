import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Arrays.stream(t, 0, 6).mapToInt(Integer::parseInt).toArray() instanceof int[] cnt
            && Integer.valueOf(t[6]) instanceof Integer n
            && List.of("S", "M", "L", "XL", "XXL", "XXXL") instanceof List<String> names
            && IntStream.range(0, n).map(i -> names.indexOf(t[7 + i].split(",")[0])).toArray() instanceof int[] lo
            && new int[n] instanceof int[] res
            && IntStream.range(0, n).filter(i -> t[7 + i].indexOf(',') < 0).allMatch(i -> --cnt[lo[i]] >= 0 && (res[i] = lo[i]) >= 0)
            && IntStream.range(0, 5).allMatch(k -> IntStream.range(0, n).filter(i -> t[7 + i].indexOf(',') > 0 && lo[i] == k)
                .allMatch(i -> cnt[k] > 0 ? --cnt[k] >= 0 && (res[i] = k) >= 0 : --cnt[k + 1] >= 0 && (res[i] = k + 1) >= 0))
            ? "YES\n" + Arrays.stream(res).mapToObj(names::get).collect(Collectors.joining("\n")) : "NO");
    }
}
