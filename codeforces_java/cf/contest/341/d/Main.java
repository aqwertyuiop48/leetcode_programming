import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw && new long[b0.length / 2 + 2] instanceof long[] nums && new long[1] instanceof long[] cur && new int[] {0, 0, 2, 0} instanceof int[] f && new int[b0.length / 8 + 2] instanceof int[] PS
            && IntStream.range(0, raw.length).mapToLong(i -> raw[i] >= 48 ? (cur[0] = cur[0] * 10 + raw[i] - 48) * 0 + (f[1] = 1) * 0L : f[1] == 1 ? (nums[f[0]] = cur[0]) * 0 + (f[0] == f[2] ? (PS[f[3]++] = f[0]) * 0 + (f[2] += cur[0] == 1 ? 5 : 6) * 0 : 0) + (f[0]++) * 0 + (cur[0] = 0) * 0 + (f[1] = 0) * 0 : 0L).sum() == 0
            && Integer.valueOf((int) nums[0]) instanceof Integer n && Integer.valueOf((int) nums[1]) instanceof Integer m
            && Integer.valueOf((n + 1) >> 1) instanceof Integer H && Integer.valueOf(H + 1) instanceof Integer S
            && new int[S * 20] instanceof int[] CH && new int[S] instanceof int[] dnl && new int[S] instanceof int[] upl
            && IntStream.range(0, S * 10).allMatch(i -> (CH[i] = i % 10 == 0 ? i / 10 : CH[i - 1] & (CH[i - 1] - 1)) >= 0 && (CH[S * 10 + i] = i % 10 == 0 ? i / 10 : CH[S * 10 + i - 1] + (CH[S * 10 + i - 1] & -CH[S * 10 + i - 1])) >= 0
                && (i % 10 < 9 || ((dnl[i / 10] = Integer.bitCount(i / 10)) >= 0 && (upl[i / 10] = (int) IntStream.range(0, 10).filter(k -> CH[S * 10 + i - 9 + k] > 0 && CH[S * 10 + i - 9 + k] <= H).count()) >= 0)))
            && new long[4 * S * S] instanceof long[] T && new long[m] instanceof long[] ACC && new int[3] instanceof int[] R && new long[1] instanceof long[] LR && new int[5] instanceof int[] W
            && new int[4 * m] instanceof int[] LEN && new int[4 * m] instanceof int[] LY && new int[4 * m] instanceof int[] CB && new int[4 * m] instanceof int[] CX && new int[4 * m] instanceof int[] CY && new int[4 * m] instanceof int[] KD && new int[4 * m] instanceof int[] PX && new int[4 * m] instanceof int[] PY
            && IntStream.range(0, m).allMatch(q -> (W[0] = (int) nums[PS[q]]) > 0 && (W[1] = (int) nums[PS[q] + 1]) >= 0 && (W[2] = (int) nums[PS[q] + 2]) >= 0 && (W[3] = (int) nums[PS[q] + 3]) >= 0 && (W[4] = (int) nums[PS[q] + 4]) >= 0
                && (PX[(q * 4 + 0)] = W[0] == 1 ? W[3] : W[1]) > -9 && (PY[(q * 4 + 0)] = W[0] == 1 ? W[4] : W[2]) > -9
                && (KD[(q * 4 + 0)] = W[0]) > 0
                && (LEN[(q * 4 + 0)] = (W[0] == 1 ? PX[(q * 4 + 0)] > 0 && PY[(q * 4 + 0)] > 0 : PX[(q * 4 + 0)] <= n && PY[(q * 4 + 0)] <= n) ? (W[0] == 1 ? dnl[(PX[(q * 4 + 0)] + 1) >> 1] : upl[(PX[(q * 4 + 0)] + 1) >> 1]) : 0) >= 0
                && (LY[(q * 4 + 0)] = W[0] == 1 ? dnl[Math.min(H, (PY[(q * 4 + 0)] + 1) >> 1)] : upl[Math.min(H, (PY[(q * 4 + 0)] + 1) >> 1)]) >= 0
                && (CB[(q * 4 + 0)] = (((PX[(q * 4 + 0)] & 1) << 1) | (PY[(q * 4 + 0)] & 1)) * S * S) != 12345678 && (CX[(q * 4 + 0)] = (W[0] == 1 ? 0 : S * 10) + Math.min(H, Math.max(0, (PX[(q * 4 + 0)] + 1) >> 1)) * 10) >= 0 && (CY[(q * 4 + 0)] = (W[0] == 1 ? 0 : S * 10) + Math.min(H, Math.max(0, (PY[(q * 4 + 0)] + 1) >> 1)) * 10) >= 0
                && (PX[(q * 4 + 1)] = W[0] == 1 ? W[1] - 1 : W[3] + 1) > -9 && (PY[(q * 4 + 1)] = W[0] == 1 ? W[4] : W[2]) > -9
                && (KD[(q * 4 + 1)] = W[0]) > 0
                && (LEN[(q * 4 + 1)] = (W[0] == 1 ? PX[(q * 4 + 1)] > 0 && PY[(q * 4 + 1)] > 0 : PX[(q * 4 + 1)] <= n && PY[(q * 4 + 1)] <= n) ? (W[0] == 1 ? dnl[(PX[(q * 4 + 1)] + 1) >> 1] : upl[(PX[(q * 4 + 1)] + 1) >> 1]) : 0) >= 0
                && (LY[(q * 4 + 1)] = W[0] == 1 ? dnl[Math.min(H, (PY[(q * 4 + 1)] + 1) >> 1)] : upl[Math.min(H, (PY[(q * 4 + 1)] + 1) >> 1)]) >= 0
                && (CB[(q * 4 + 1)] = (((PX[(q * 4 + 1)] & 1) << 1) | (PY[(q * 4 + 1)] & 1)) * S * S) != 12345678 && (CX[(q * 4 + 1)] = (W[0] == 1 ? 0 : S * 10) + Math.min(H, Math.max(0, (PX[(q * 4 + 1)] + 1) >> 1)) * 10) >= 0 && (CY[(q * 4 + 1)] = (W[0] == 1 ? 0 : S * 10) + Math.min(H, Math.max(0, (PY[(q * 4 + 1)] + 1) >> 1)) * 10) >= 0
                && (PX[(q * 4 + 2)] = W[0] == 1 ? W[3] : W[1]) > -9 && (PY[(q * 4 + 2)] = W[0] == 1 ? W[2] - 1 : W[4] + 1) > -9
                && (KD[(q * 4 + 2)] = W[0]) > 0
                && (LEN[(q * 4 + 2)] = (W[0] == 1 ? PX[(q * 4 + 2)] > 0 && PY[(q * 4 + 2)] > 0 : PX[(q * 4 + 2)] <= n && PY[(q * 4 + 2)] <= n) ? (W[0] == 1 ? dnl[(PX[(q * 4 + 2)] + 1) >> 1] : upl[(PX[(q * 4 + 2)] + 1) >> 1]) : 0) >= 0
                && (LY[(q * 4 + 2)] = W[0] == 1 ? dnl[Math.min(H, (PY[(q * 4 + 2)] + 1) >> 1)] : upl[Math.min(H, (PY[(q * 4 + 2)] + 1) >> 1)]) >= 0
                && (CB[(q * 4 + 2)] = (((PX[(q * 4 + 2)] & 1) << 1) | (PY[(q * 4 + 2)] & 1)) * S * S) != 12345678 && (CX[(q * 4 + 2)] = (W[0] == 1 ? 0 : S * 10) + Math.min(H, Math.max(0, (PX[(q * 4 + 2)] + 1) >> 1)) * 10) >= 0 && (CY[(q * 4 + 2)] = (W[0] == 1 ? 0 : S * 10) + Math.min(H, Math.max(0, (PY[(q * 4 + 2)] + 1) >> 1)) * 10) >= 0
                && (PX[(q * 4 + 3)] = W[0] == 1 ? W[1] - 1 : W[3] + 1) > -9 && (PY[(q * 4 + 3)] = W[0] == 1 ? W[2] - 1 : W[4] + 1) > -9
                && (KD[(q * 4 + 3)] = W[0]) > 0
                && (LEN[(q * 4 + 3)] = (W[0] == 1 ? PX[(q * 4 + 3)] > 0 && PY[(q * 4 + 3)] > 0 : PX[(q * 4 + 3)] <= n && PY[(q * 4 + 3)] <= n) ? (W[0] == 1 ? dnl[(PX[(q * 4 + 3)] + 1) >> 1] : upl[(PX[(q * 4 + 3)] + 1) >> 1]) : 0) >= 0
                && (LY[(q * 4 + 3)] = W[0] == 1 ? dnl[Math.min(H, (PY[(q * 4 + 3)] + 1) >> 1)] : upl[Math.min(H, (PY[(q * 4 + 3)] + 1) >> 1)]) >= 0
                && (CB[(q * 4 + 3)] = (((PX[(q * 4 + 3)] & 1) << 1) | (PY[(q * 4 + 3)] & 1)) * S * S) != 12345678 && (CX[(q * 4 + 3)] = (W[0] == 1 ? 0 : S * 10) + Math.min(H, Math.max(0, (PX[(q * 4 + 3)] + 1) >> 1)) * 10) >= 0 && (CY[(q * 4 + 3)] = (W[0] == 1 ? 0 : S * 10) + Math.min(H, Math.max(0, (PY[(q * 4 + 3)] + 1) >> 1)) * 10) >= 0)
            && (IntStream.range(0, (4 * m) << 4).filter(g -> (g & 15) < LEN[g >> 4])
                .mapToLong(g -> (R[0] = CB[g >> 4] + CH[CX[g >> 4] + (g & 15)] * S) >= 0 && (R[1] = CY[g >> 4]) >= 0 && (R[2] = LY[g >> 4]) >= 0
                    ? KD[g >> 4] == 1 ? (ACC[g >> 6] ^= (R[2] > 0 ? T[R[0] + CH[R[1] + 0]] : 0L) ^ (R[2] > 1 ? T[R[0] + CH[R[1] + 1]] : 0L) ^ (R[2] > 2 ? T[R[0] + CH[R[1] + 2]] : 0L) ^ (R[2] > 3 ? T[R[0] + CH[R[1] + 3]] : 0L) ^ (R[2] > 4 ? T[R[0] + CH[R[1] + 4]] : 0L) ^ (R[2] > 5 ? T[R[0] + CH[R[1] + 5]] : 0L) ^ (R[2] > 6 ? T[R[0] + CH[R[1] + 6]] : 0L) ^ (R[2] > 7 ? T[R[0] + CH[R[1] + 7]] : 0L) ^ (R[2] > 8 ? T[R[0] + CH[R[1] + 8]] : 0L)) : (LR[0] = nums[PS[g >> 6] + 5]) + (R[2] > 0 ? (T[R[0] + CH[R[1] + 0]] ^= LR[0]) : 0L) + (R[2] > 1 ? (T[R[0] + CH[R[1] + 1]] ^= LR[0]) : 0L) + (R[2] > 2 ? (T[R[0] + CH[R[1] + 2]] ^= LR[0]) : 0L) + (R[2] > 3 ? (T[R[0] + CH[R[1] + 3]] ^= LR[0]) : 0L) + (R[2] > 4 ? (T[R[0] + CH[R[1] + 4]] ^= LR[0]) : 0L) + (R[2] > 5 ? (T[R[0] + CH[R[1] + 5]] ^= LR[0]) : 0L) + (R[2] > 6 ? (T[R[0] + CH[R[1] + 6]] ^= LR[0]) : 0L) + (R[2] > 7 ? (T[R[0] + CH[R[1] + 7]] ^= LR[0]) : 0L) + (R[2] > 8 ? (T[R[0] + CH[R[1] + 8]] ^= LR[0]) : 0L)
                    : 0L).sum() & 0L) == 0L)
            System.out.println(IntStream.range(0, m).filter(q -> nums[PS[q]] == 1).mapToObj(q -> String.valueOf(ACC[q])).collect(Collectors.joining("\n")));
    }
}
