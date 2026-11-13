import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n
            && new int[n] instanceof int[] a
            && IntStream.range(0, n).allMatch(i -> (a[i] = Integer.parseInt(tk[1 + i])) > 0)
            && Integer.valueOf(tk[n + 1]) instanceof Integer k
            && new int[k] instanceof int[] b
            && IntStream.range(0, k).allMatch(i -> (b[i] = Integer.parseInt(tk[n + 2 + i])) > 0)
            && new int[n + 1] instanceof int[] pre
            && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + a[i]) > 0)
            && new int[k + 1] instanceof int[] en
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, k).allMatch(j -> (en[j + 1] = Arrays.binarySearch(pre, IntStream.rangeClosed(0, j).map(x -> b[x]).sum())) > en[j]
                && Integer.valueOf(IntStream.range(en[j], en[j + 1]).map(x -> a[x]).max().getAsInt()) instanceof Integer mx
                && (en[j + 1] - en[j] == 1
                    || IntStream.range(en[j], en[j + 1]).filter(q -> a[q] == mx && ((q > en[j] && a[q - 1] < mx) || (q < en[j + 1] - 1 && a[q + 1] < mx))).boxed().findFirst().orElse(-1) instanceof Integer p
                    && p >= 0
                    && Integer.valueOf(p - en[j]) instanceof Integer nl
                    && Integer.valueOf(en[j + 1] - 1 - p) instanceof Integer nr
                    && Integer.valueOf(j + nl + 1) instanceof Integer idx
                    && (nl > 0 && a[p - 1] < mx
                        ? IntStream.range(0, nl).allMatch(t -> sb.append(idx - t).append(" L\n").length() > 0)
                            && IntStream.range(0, nr).allMatch(t -> sb.append(j + 1).append(" R\n").length() > 0)
                        : IntStream.range(0, nr).allMatch(t -> sb.append(idx).append(" R\n").length() > 0)
                            && IntStream.range(0, nl).allMatch(t -> sb.append(idx - t).append(" L\n").length() > 0))))
            && en[k] == n
            ? "YES\n" + sb.toString().trim() : "NO");
    }
}
