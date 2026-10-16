import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(s.nextInt()).ifPresent(k ->
            Optional.of(Arrays.asList("H He Li Be B C N O F Ne Na Mg Al Si P S Cl Ar K Ca Sc Ti V Cr Mn Fe Co Ni Cu Zn Ga Ge As Se Br Kr Rb Sr Y Zr Nb Mo Tc Ru Rh Pd Ag Cd In Sn Sb Te I Xe Cs Ba La Ce Pr Nd Pm Sm Eu Gd Tb Dy Ho Er Tm Yb Lu Hf Ta W Re Os Ir Pt Au Hg Tl Pb Bi Po At Rn Fr Ra Ac Th Pa U Np Pu Am Cm Bk Cf Es Fm".split(" "))).ifPresent(pt ->
            Optional.of(IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new)).ifPresent(ing ->
            Optional.of(IntStream.range(0, k).mapToObj(i -> s.next()).toArray(String[]::new)).ifPresent(prod ->
            Optional.of(Arrays.stream(ing).mapToInt(x -> pt.indexOf(x) + 1).toArray()).ifPresent(v ->
            Optional.of(new int[k]).ifPresent(P ->
            Optional.of(new int[1 << n]).ifPresent(sum ->
            Optional.of(new boolean[1 << n]).ifPresent(dp ->
                System.out.print(IntStream.range(0, k).allMatch(j -> (P[j] = (j > 0 ? P[j - 1] : 0) + pt.indexOf(prod[j]) + 1) > 0)
                    && IntStream.range(1, 1 << n).allMatch(m -> (sum[m] = sum[m & (m - 1)] + v[Integer.numberOfTrailingZeros(m)]) > 0)
                    && IntStream.of(P).max().getAsInt() == sum[(1 << n) - 1]
                    && (dp[0] = true)
                    && IntStream.range(0, 1 << n).filter(m -> dp[m]).allMatch(m -> IntStream.range(0, n).filter(e -> (m >> e & 1) == 0 && sum[m] + v[e] <= IntStream.of(P).filter(p -> p > sum[m]).min().orElse(0)).allMatch(e -> (dp[m | 1 << e] = true)))
                    && dp[(1 << n) - 1]
                    ? Optional.of(new int[]{(1 << n) - 1}).map(cur ->
                        IntStream.range(0, n).map(it ->
                            Optional.of(IntStream.range(0, n).filter(e -> (cur[0] >> e & 1) == 1 && dp[cur[0] ^ 1 << e] && sum[cur[0] ^ 1 << e] + v[e] <= IntStream.of(P).filter(p -> p > sum[cur[0] ^ 1 << e]).min().orElse(0)).findFirst().getAsInt())
                                .map(e -> (cur[0] ^= 1 << e) >= 0 ? e : e).get()).toArray())
                        .map(rev -> IntStream.range(0, n).map(i -> rev[n - 1 - i]).toArray())
                        .map(ord -> "YES\n" + IntStream.range(0, k).mapToObj(j ->
                            IntStream.range(0, n).filter(i -> IntStream.rangeClosed(0, i).map(q -> v[ord[q]]).sum() > (j > 0 ? P[j - 1] : 0) && IntStream.rangeClosed(0, i).map(q -> v[ord[q]]).sum() <= P[j]).mapToObj(i -> ing[ord[i]]).collect(Collectors.joining("+")) + "->" + prod[j]).collect(Collectors.joining("\n"))).get()
                    : "NO")))))))))));
    }
}



