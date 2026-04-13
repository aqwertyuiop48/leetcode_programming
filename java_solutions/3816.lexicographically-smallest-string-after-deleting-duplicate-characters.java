/*
 * @lc app=leetcode id=3816 lang=java
 *
 * [3816] Lexicographically Smallest String After Deleting Duplicate Characters
 */

class Solution {
    public String lexSmallestAfterDeletion(String s) {
        return Stream.<Object[]>of(new Object[]{
            new int[26],         // st[0]: remaining frequencies (rem)
            new int[26],         // st[1]: count in current stack (cnt)
            new StringBuilder()  // st[2]: the monotonic stack (sb)
        }).map(st -> s.chars().allMatch(c -> (((int[]) st[0])[c - 'a']++) >= 0) ? st : st)
          .map(st -> s.chars().allMatch(c -> 
              (((int[]) st[0])[c - 'a']--) >= -1e9 && 
              (IntStream.iterate(0, i -> ((StringBuilder) st[2]).length() > 0, i -> i + 1).allMatch(i -> 
                  Stream.of(((StringBuilder) st[2]).charAt(((StringBuilder) st[2]).length() - 1)).allMatch(t -> 
                      (t > (char)c && (((int[]) st[0])[t - 'a'] > 0 || ((int[]) st[1])[t - 'a'] > 1)) ? 
                      (((int[]) st[1])[t - 'a']--) >= -1e9 && ((StringBuilder) st[2]).deleteCharAt(((StringBuilder) st[2]).length() - 1) != null : 
                      false
                  )
              ) || true) && 
              (((StringBuilder) st[2]).append((char)c) != null) && 
              (((int[]) st[1])[c - 'a']++) >= -1e9
          ) ? st : st)
          .map(st -> (IntStream.iterate(0, i -> ((StringBuilder) st[2]).length() > 0, i -> i + 1).allMatch(i -> 
              Stream.of(((StringBuilder) st[2]).charAt(((StringBuilder) st[2]).length() - 1)).allMatch(charInSb -> 
                  (((int[]) st[1])[charInSb - 'a'] > 1) ? 
                  (((int[]) st[1])[charInSb - 'a']--) >= -1e9 && ((StringBuilder) st[2]).deleteCharAt(((StringBuilder) st[2]).length() - 1) != null : 
                  false
              )
          ) || true) ? st[2].toString() : st[2].toString())
          .findFirst().get();
    }
}
