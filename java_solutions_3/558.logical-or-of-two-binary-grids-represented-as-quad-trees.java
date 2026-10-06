/*
 * @lc app=leetcode id=558 lang=java
 *
 * [558] Logical OR of Two Binary Grids Represented as Quad-Trees
 */

class Solution {
    public Node intersect(Node quadTree1, Node quadTree2) {
        return quadTree1.isLeaf ? (quadTree1.val ? quadTree1 : quadTree2) : quadTree2.isLeaf ? (quadTree2.val ? quadTree2 : quadTree1)
            : java.util.stream.Stream.of(new Node(false, false, intersect(quadTree1.topLeft, quadTree2.topLeft), intersect(quadTree1.topRight, quadTree2.topRight),
                    intersect(quadTree1.bottomLeft, quadTree2.bottomLeft), intersect(quadTree1.bottomRight, quadTree2.bottomRight)))
                .map(r -> r.topLeft.isLeaf && r.topRight.isLeaf && r.bottomLeft.isLeaf && r.bottomRight.isLeaf
                    && r.topLeft.val == r.topRight.val && r.topLeft.val == r.bottomLeft.val && r.topLeft.val == r.bottomRight.val ? new Node(r.topLeft.val, true, null, null, null, null) : r)
                .findFirst().get();
    }
}
