/*
 * @lc app=leetcode id=4009 lang=java
 *
 * [4009] Minimum Possible Maximum Waiting Time
 */

class Solution {
    public int minMaxWaitingTime(int[] demand, int[] fuel) {
        return Stream.<Map<Object, int[]>>of(new HashMap<>())
            .mapToInt(memo -> Collections.singletonList(new Function[1]).stream()
                .peek(fn -> fn[0] = (Function<int[], int[]>) state -> Stream.of(List.of(state[0], state[1], state[2], state[3], state[4]))
                    .map(key -> memo.containsKey(key) 
                        ? memo.get(key) 
                        : Stream.of(
                            state[0] == demand.length 
                                ? new int[]{state[0], 0} 
                                : Stream.concat(
                                    state[1] >= demand[state[0]] 
                                        ? Stream.of((int[]) fn[0].apply(new int[]{
                                            state[0] + 1, 
                                            state[1] - demand[state[0]], 
                                            state[2], 
                                            demand[state[0]], 
                                            Math.max(0, state[4] - state[3])
                                        })).map(nxt -> new int[]{nxt[0], Math.max(nxt[1], state[3])})
                                        : Stream.<int[]>empty(),
                                    state[2] >= demand[state[0]] 
                                        ? Stream.of((int[]) fn[0].apply(new int[]{
                                            state[0] + 1, 
                                            state[1], 
                                            state[2] - demand[state[0]], 
                                            Math.max(0, state[3] - state[4]), 
                                            demand[state[0]]
                                        })).map(nxt -> new int[]{nxt[0], Math.max(nxt[1], state[4])})
                                        : Stream.<int[]>empty()
                                ).reduce((a, b) -> (a[0] > b[0] || (a[0] == b[0] && a[1] < b[1])) ? a : b)
                                .orElse(new int[]{state[0], 0})
                        ).peek(res -> memo.put(key, res)).findFirst().get()
                    ).findFirst().get()
                )
                .map(fn -> (int[]) fn[0].apply(new int[]{0, fuel[0], fuel[1], 0, 0}))
                .mapToInt(res -> res[0] > 0 ? res[1] : -1)
                .findFirst().getAsInt()
            ).findFirst().getAsInt();
    }
}
