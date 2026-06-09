/*
 * @lc app=leetcode id=449 lang=java
 *
 * [449] Serialize and Deserialize BST
 */

public class Codec {
    public String serialize(TreeNode root) {
        return root == null ? "" : java.util.stream.Stream.of(0).map(_v -> new java.util.StringJoiner(",")).peek(sj -> java.util.stream.Stream.of(new java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<TreeNode>>()).peek(ref -> ref.set(n -> java.util.stream.Stream.of(n).filter(x -> x != null).peek(x -> sj.add(String.valueOf(x.val))).peek(x -> ref.get().accept(x.left)).forEach(x -> ref.get().accept(x.right)))).forEach(ref -> ref.get().accept(root))).map(sj -> sj.toString()).findFirst().get();
    }
    public TreeNode deserialize(String data) {
        return data.isEmpty() ? null : java.util.stream.Stream.of(0).map(_v -> new Object[]{data.split(","), new int[]{0}, new java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, TreeNode>>()}).peek(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, TreeNode>>) a[2]).set((min, max) -> ((int[]) a[1])[0] >= ((String[]) a[0]).length ? null : java.util.stream.Stream.of(Integer.parseInt(((String[]) a[0])[((int[]) a[1])[0]])).filter(val -> val > min && val < max).peek(val -> ((int[]) a[1])[0]++).map(val -> new TreeNode(val, ((java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, TreeNode>>) a[2]).get().apply(min, val), ((java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, TreeNode>>) a[2]).get().apply(val, max))).findFirst().orElse(null))).map(a -> ((java.util.concurrent.atomic.AtomicReference<java.util.function.BiFunction<Integer, Integer, TreeNode>>) a[2]).get().apply(Integer.MIN_VALUE, Integer.MAX_VALUE)).findFirst().get();
    }
}
