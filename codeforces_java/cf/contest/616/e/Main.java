import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Long.valueOf(t[0]) instanceof Long n && Long.valueOf(t[1]) instanceof Long m
            && Long.valueOf(1000000007L) instanceof Long P && Long.valueOf((long) Math.sqrt(n)) instanceof Long K && Long.valueOf(Math.min(n, m)) instanceof Long M
            && Long.valueOf(LongStream.rangeClosed(1, Math.min(K, M)).map(i -> i * (n / i) % P).sum() % P
                + LongStream.rangeClosed(1, M > K ? n / (K + 1) : 0).map(q -> Long.valueOf(Math.max(n / (q + 1) + 1, K + 1)) instanceof Long lo && Long.valueOf(Math.min(n / q, M)) instanceof Long hi && lo <= hi
                    ? ((lo + hi) % 2 == 0 ? (lo + hi) / 2 % P * ((hi - lo + 1) % P) % P : (lo + hi) % P * ((hi - lo + 1) / 2 % P) % P) * (q % P) % P : 0L).sum() % P) instanceof Long sub
            ? ((n % P * (m % P) % P - sub) % P + P) % P : "");
    }
}
