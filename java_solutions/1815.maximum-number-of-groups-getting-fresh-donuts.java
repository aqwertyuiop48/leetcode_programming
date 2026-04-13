/*
 * @lc app=leetcode id=1815 lang=java
 *
 * [1815] Maximum Number of Groups Getting Fresh Donuts
 */

class Solution {
    public int maxHappyGroups(int batchSize, int[] groups) {
        return Stream.of(1)
            .map(dummy -> new Function[2])
            .peek(f -> f[0] = (Object args) -> 
                Optional.of((Long)((Object[])args)[0] | ((long)(Integer)((Object[])args)[1] << 60))
                    .filter(key -> ((Map<Long, Integer>)((Object[])args)[2]).containsKey(key))
                    .map(key -> ((Map<Long, Integer>)((Object[])args)[2]).get(key))
                    .orElseGet(() -> Optional.of((Integer) f[1].apply(new Object[]{((Object[])args)[0], ((Object[])args)[1], 1, ((Object[])args)[2]}))
                        .filter(res -> ((Map<Long, Integer>)((Object[])args)[2]).put((Long)((Object[])args)[0] | ((long)(Integer)((Object[])args)[1] << 60), res) == null || true)
                        .get()
                    )
            )
            .peek(f -> f[1] = (Object args) -> 
                (Integer)((Object[])args)[2] == batchSize ? 0 : 
                Math.max(
                    (Integer) f[1].apply(new Object[]{((Object[])args)[0], ((Object[])args)[1], (Integer)((Object[])args)[2] + 1, ((Object[])args)[3]}),
                    (((Long)((Object[])args)[0] >>> ((Integer)((Object[])args)[2] * 5)) & 31) > 0 ? 
                        ((Integer)((Object[])args)[1] == 0 ? 1 : 0) + (Integer) f[0].apply(new Object[]{
                            (Long)((Object[])args)[0] - (1L << ((Integer)((Object[])args)[2] * 5)), 
                            ((Integer)((Object[])args)[1] + (Integer)((Object[])args)[2]) % batchSize, 
                            ((Object[])args)[3]
                        }) : 0
                )
            )
            .map(f -> 
                (int) Arrays.stream(groups).filter(g -> g % batchSize == 0).count() + 
                (Integer) f[0].apply(new Object[]{
                    Arrays.stream(groups).filter(g -> g % batchSize != 0).mapToLong(g -> 1L << ((g % batchSize) * 5)).sum(), 
                    0, 
                    new HashMap<Long, Integer>()
                })
            ).findFirst().get();
    }
}
