import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(t[2]) instanceof Integer k
            && new int[n + 1] instanceof int[] rt && new int[n + 1] instanceof int[] rc && new int[m + 1] instanceof int[] ct && new int[m + 1] instanceof int[] cc
            && IntStream.range(0, k).allMatch(q -> Integer.parseInt(t[3 + 3 * q]) == 1
                ? (rt[Integer.parseInt(t[4 + 3 * q])] = q + 1) > 0 && (rc[Integer.parseInt(t[4 + 3 * q])] = Integer.parseInt(t[5 + 3 * q])) >= 0
                : (ct[Integer.parseInt(t[4 + 3 * q])] = q + 1) > 0 && (cc[Integer.parseInt(t[4 + 3 * q])] = Integer.parseInt(t[5 + 3 * q])) >= 0)
            ? IntStream.rangeClosed(1, n).mapToObj(i -> IntStream.rangeClosed(1, m).mapToObj(j -> String.valueOf(rt[i] > ct[j] ? rc[i] : cc[j])).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
