/*
 * @lc app=leetcode id=911 lang=java
 *
 * [911] Online Election
 */

class TopVotedCandidate extends java.util.concurrent.atomic.AtomicReference<TopVotedCandidate.St> {
    record St(int[] tm, int[] lead) {}

    public TopVotedCandidate(int[] persons, int[] times) {
        if (new int[persons.length] instanceof int[] lead && new int[persons.length + 1] instanceof int[] cnt && new int[]{-1} instanceof int[] best
            && java.util.stream.IntStream.range(0, persons.length).allMatch(i -> ++cnt[persons[i]] >= 0
                && (best[0] == -1 || cnt[persons[i]] >= cnt[best[0]] ? (best[0] = persons[i]) >= 0 : true) && (lead[i] = best[0]) >= 0)
            && compareAndSet(null, new St(times, lead))) {}
    }

    public int q(int t) {
        return get() instanceof St(var tm, var lead) ? lead[java.util.stream.IntStream.of(java.util.Arrays.binarySearch(tm, t)).map(r -> r >= 0 ? r : -r - 2).findFirst().getAsInt()] : -1;
    }
}
