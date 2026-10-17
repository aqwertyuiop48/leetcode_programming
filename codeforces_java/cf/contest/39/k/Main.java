import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new java.io.BufferedReader(new java.io.InputStreamReader(System.in), 1 << 16).lines().toList() instanceof List<String> lines
            && Arrays.stream(lines.get(0).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] h
            && Integer.valueOf(h[0]) instanceof Integer n
            && Integer.valueOf(h[1]) instanceof Integer m
            && lines.stream().skip(1).limit(n).map(String::trim).toArray(String[]::new) instanceof String[] g
            && IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(0, m)
                .filter(j -> g[i].charAt(j) == '*' && (i == 0 || g[i - 1].charAt(j) != '*') && (j == 0 || g[i].charAt(j - 1) != '*'))
                .mapToObj(j -> new int[]{i, i + (int) IntStream.range(i, n).takeWhile(x -> g[x].charAt(j) == '*').count() - 1,
                    j, j + (int) IntStream.range(j, m).takeWhile(x -> g[i].charAt(x) == '*').count() - 1})).toList() instanceof List<int[]> ob
            && Integer.valueOf(ob.size()) instanceof Integer k
            && ob.stream().mapToInt(o -> o[0]).toArray() instanceof int[] R1
            && ob.stream().mapToInt(o -> o[1]).toArray() instanceof int[] R2
            && ob.stream().mapToInt(o -> o[2]).toArray() instanceof int[] C1
            && ob.stream().mapToInt(o -> o[3]).toArray() instanceof int[] C2
            && IntStream.range(0, k).boxed().flatMap(i -> Stream.concat(Stream.of(new int[]{i}),
                IntStream.range(i + 1, k).boxed().flatMap(j -> Stream.concat(Stream.of(new int[]{i, j}),
                    IntStream.range(j + 1, k).mapToObj(l -> new int[]{i, j, l}))))) instanceof Stream<int[]> subs
            ? subs.mapToLong(sub ->
                (Integer) sub[0] instanceof Integer sa
                && (Integer) sub[sub.length > 1 ? 1 : 0] instanceof Integer sb
                && (Integer) sub[sub.length > 2 ? 2 : 0] instanceof Integer sc
                && (Integer) Math.min(R1[sa], Math.min(R1[sb], R1[sc])) instanceof Integer br1
                && (Integer) Math.max(R2[sa], Math.max(R2[sb], R2[sc])) instanceof Integer br2
                && (Integer) Math.min(C1[sa], Math.min(C1[sb], C1[sc])) instanceof Integer bc1
                && (Integer) Math.max(C2[sa], Math.max(C2[sb], C2[sc])) instanceof Integer bc2
                && IntStream.range(0, k).noneMatch(t -> t != sa && t != sb && t != sc && R1[t] <= br2 && R2[t] >= br1 && C1[t] <= bc2 && C2[t] >= bc1)
                && IntStream.range(0, k).filter(t -> t != sa && t != sb && t != sc).toArray() instanceof int[] oth
                && Integer.valueOf(Arrays.stream(oth).filter(t -> C1[t] <= bc2 && C2[t] >= bc1 && R2[t] < br1).map(t -> R2[t]).max().orElse(-1)) instanceof Integer U
                && Integer.valueOf(Arrays.stream(oth).filter(t -> C1[t] <= bc2 && C2[t] >= bc1 && R1[t] > br2).map(t -> R1[t]).min().orElse(n)) instanceof Integer D
                && Integer.valueOf(Arrays.stream(oth).filter(t -> R1[t] <= br2 && R2[t] >= br1 && C2[t] < bc1).map(t -> C2[t] + 1).max().orElse(0)) instanceof Integer baseLo
                && Integer.valueOf(Arrays.stream(oth).filter(t -> R1[t] <= br2 && R2[t] >= br1 && C1[t] > bc2).map(t -> C1[t] - 1).min().orElse(m - 1)) instanceof Integer baseHi
                && Arrays.stream(oth).filter(t -> R2[t] < br1 && C2[t] < bc1 && R2[t] > U).toArray() instanceof int[] tl
                && Arrays.stream(oth).filter(t -> R2[t] < br1 && C1[t] > bc2 && R2[t] > U).toArray() instanceof int[] tr
                && Arrays.stream(oth).filter(t -> R1[t] > br2 && C2[t] < bc1 && R1[t] < D).toArray() instanceof int[] bl
                && Arrays.stream(oth).filter(t -> R1[t] > br2 && C1[t] > bc2 && R1[t] < D).toArray() instanceof int[] brr
                && IntStream.concat(IntStream.concat(Arrays.stream(tl).map(t -> R2[t]), Arrays.stream(tr).map(t -> R2[t])), IntStream.of(br1)).distinct().sorted().toArray() instanceof int[] e1
                && IntStream.concat(IntStream.concat(Arrays.stream(bl).map(t -> R1[t]), Arrays.stream(brr).map(t -> R1[t])), IntStream.of(br2)).distinct().sorted().toArray() instanceof int[] s2
                && Arrays.stream(e1).map(e -> Arrays.stream(tl).filter(t -> R2[t] >= e).map(t -> C2[t] + 1).max().orElse(0)).toArray() instanceof int[] fL
                && Arrays.stream(e1).map(e -> Arrays.stream(tr).filter(t -> R2[t] >= e).map(t -> C1[t] - 1).min().orElse(m - 1)).toArray() instanceof int[] fR
                && Arrays.stream(s2).map(e -> Arrays.stream(bl).filter(t -> R1[t] <= e).map(t -> C2[t] + 1).max().orElse(0)).toArray() instanceof int[] gL
                && Arrays.stream(s2).map(e -> Arrays.stream(brr).filter(t -> R1[t] <= e).map(t -> C1[t] - 1).min().orElse(m - 1)).toArray() instanceof int[] gR
                ? IntStream.range(0, e1.length).mapToLong(a -> (long) (e1[a] - (a == 0 ? U : e1[a - 1]))
                    * IntStream.range(0, s2.length).mapToLong(b -> (long) ((b + 1 < s2.length ? s2[b + 1] : D) - s2[b])
                        * (bc1 - Math.max(baseLo, Math.max(fL[a], gL[b])) + 1)
                        * (Math.min(baseHi, Math.min(fR[a], gR[b])) - bc2 + 1)).sum()).sum()
                : 0L).sum()
            : 0L);
    }
}

