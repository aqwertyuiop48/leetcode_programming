/*
 * @lc app=leetcode id=3449 lang=java
 *
 * [3449] Maximize the Minimum Game Score
 */

class Solution { public long maxScore(int[] pts, int M) { return M < pts.length ? 0L : Optional.of(new long[]{1L, 1000000000000000000L, 0L, 0L, 0L, 0L, 0L, 0L, 0L}).map(st -> IntStream.range(0, 62).filter(step -> st[0] <= st[1]).mapToLong(step -> (((st[3] = st[0] + (st[1] - st[0]) / 2L) * 0L) == 0L) && (((st[4] = 0L) * 0L) == 0L) && (((st[5] = 0L) * 0L) == 0L) && (((st[6] = 0L) * 0L) == 0L) ? (!IntStream.range(0, pts.length).anyMatch(i -> (((st[7] = (st[3] + pts[i] - 1L) / pts[i]) * 0L) == 0L) && (st[5] >= st[7] ? (((st[5] = 0L) * 0L) + ((st[6]++) * 0L)) : (((st[8] = st[7] - st[5]) * 0L) + ((st[4] += 2L * st[8] - 1L + st[6]) * 0L) + ((st[5] = st[8] - 1L) * 0L) + ((st[6] = 0L) * 0L)) ) == 0L && st[4] > M ) ? (((st[2] = st[3]) * 0L) + ((st[0] = st[3] + 1L) * 0L)) : ((st[1] = st[3] - 1L) * 0L)) : 0L ).sum() * 0L == 0L ? st[2] : st[2] ).get(); } }
