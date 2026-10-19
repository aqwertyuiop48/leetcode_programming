import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[+=]") instanceof String[] p
            && Integer.valueOf(p[0].length()) instanceof Integer la
            && Integer.valueOf(p[1].length()) instanceof Integer lb
            && Integer.valueOf(p[2].length()) instanceof Integer lc
            && IntStream.range(0, 9).map(i -> i < la ? p[0].charAt(la - 1 - i) - '0' : -1).toArray() instanceof int[] da
            && IntStream.range(0, 9).map(i -> i < lb ? p[1].charAt(lb - 1 - i) - '0' : -1).toArray() instanceof int[] db
            && IntStream.range(0, 9).map(i -> i < lc ? p[2].charAt(lc - 1 - i) - '0' : -1).toArray() instanceof int[] dc
            && new int[8193] instanceof int[] dp
            && new int[8193] instanceof int[] par
            && new int[8193] instanceof int[] dg
            && IntStream.range(0, 8193).allMatch(i -> (dp[i] = 1000000) > 0)
            && (dp[8192] = 0) == 0
            && (IntStream.rangeClosed(0, 70).allMatch(cc ->
                IntStream.range(0, 8193).filter(ps -> dp[ps] == cc).allMatch(ps ->
                    Integer.valueOf(ps & 8191) instanceof Integer s
                    && Integer.valueOf(s & 7) instanceof Integer f
                    && Integer.valueOf(s >> 3 & 1) instanceof Integer c
                    && Integer.valueOf(s >> 4 & 7) instanceof Integer k
                    && Integer.valueOf(s >> 7 & 7) instanceof Integer j
                    && Integer.valueOf(s >> 10 & 7) instanceof Integer i
                    && IntStream.range(0, 882).allMatch(o ->
                        Integer.valueOf(o % 21) instanceof Integer xo
                        && ((f & 1) == 1 ? xo == 0 : xo >= 1 && (xo <= 10 || xo != 11 || ps == 8192))
                        && Integer.valueOf(o / 21 % 21) instanceof Integer yo
                        && ((f & 2) == 2 ? yo == 0 : yo >= 1 && (yo <= 10 || yo != 11 || ps == 8192))
                        && Integer.valueOf(xo == 0 ? 0 : (xo - 1) % 10) instanceof Integer xd
                        && Integer.valueOf(yo == 0 ? 0 : (yo - 1) % 10) instanceof Integer yd
                        && Integer.valueOf((xd + yd + c) % 10) instanceof Integer zd
                        && Integer.valueOf(o / 441) instanceof Integer zt
                        && ((f & 4) == 4 ? zt == 0 && zd == 0 : zt == 0 || zd != 0 || ps == 8192)
                        && Integer.valueOf((xo > 10 ? 1 : 0) | (yo > 10 ? 2 : 0) | ((f & 4) == 0 && zt == 1 ? 4 : 0) | f) instanceof Integer nf
                        && Integer.valueOf(((i + (xo != 0 && xd == da[i] ? 1 : 0)) * 8 + j + (yo != 0 && yd == db[j] ? 1 : 0)) * 8 + k + ((f & 4) == 0 && zd == dc[k] ? 1 : 0)) instanceof Integer ijk
                        && Integer.valueOf(((ijk * 2 + (xd + yd + c) / 10) << 3) + nf) instanceof Integer ns
                        && Integer.valueOf(cc + (xo != 0 ? 1 : 0) + (yo != 0 ? 1 : 0) + ((f & 4) == 0 ? 1 : 0)) instanceof Integer cost
                        && (dp[ns] <= cost
                            || ((dp[ns] = cost) > 0
                                && (par[ns] = ps) >= 0
                                && (dg[ns] = xd | (xo != 0 ? 16 : 0) | yd << 5 | (yo != 0 ? 512 : 0) | zd << 10 | ((f & 4) == 0 ? 16384 : 0)) > 0))
                        || true)))
                || true)
            && Integer.valueOf(((la * 8 + lb) * 8 + lc) * 16 + 7) instanceof Integer fs
            && new int[]{fs} instanceof int[] cur
            && new StringBuilder[]{new StringBuilder(), new StringBuilder(), new StringBuilder()} instanceof StringBuilder[] sb
            && IntStream.range(0, 40).allMatch(r ->
                cur[0] == 8192
                || (Integer.valueOf(dg[cur[0]]) instanceof Integer w
                    && ((w & 16) == 0 || sb[0].append((char) ('0' + (w & 15))) != null)
                    && ((w & 512) == 0 || sb[1].append((char) ('0' + (w >> 5 & 15))) != null)
                    && ((w & 16384) == 0 || sb[2].append((char) ('0' + (w >> 10 & 15))) != null)
                    && (cur[0] = par[cur[0]]) >= 0))
            ? sb[0] + "+" + sb[1] + "=" + sb[2]
            : "");
    }
}
