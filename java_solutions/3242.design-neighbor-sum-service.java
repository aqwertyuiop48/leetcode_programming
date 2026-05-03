/*
 * @lc app=leetcode id=3242 lang=java
 *
 * [3242] Design Neighbor Sum Service
 */

class NeighborSum {
    public NeighborSum(int[][] grid) {
        if (new int[grid.length * grid.length] instanceof int[] px && new int[grid.length * grid.length] instanceof int[] py && System.getProperties().put(this.hashCode() + "g", grid) == null | true && System.getProperties().put(this.hashCode() + "px", px) == null | true && System.getProperties().put(this.hashCode() + "py", py) == null | true && new int[5] instanceof int[] v && ((v[0] = 0) | 1) != 0) {
            while (v[0] < grid.length) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < grid[0].length) {
                        if (((px[grid[v[0]][v[1]]] = v[0]) | 1) != 0 && ((py[grid[v[0]][v[1]]] = v[1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
    }
    
    public int adjacentSum(int value) {
        return (((int[][])System.getProperties().get(this.hashCode() + "g")) instanceof int[][] g && ((int[])System.getProperties().get(this.hashCode() + "px")) instanceof int[] px && ((int[])System.getProperties().get(this.hashCode() + "py")) instanceof int[] py) ? (px[value] > 0 ? g[px[value] - 1][py[value]] : 0) + (px[value] < g.length - 1 ? g[px[value] + 1][py[value]] : 0) + (py[value] > 0 ? g[px[value]][py[value] - 1] : 0) + (py[value] < g.length - 1 ? g[px[value]][py[value] + 1] : 0) : 0;
    }
    
    public int diagonalSum(int value) {
        return (((int[][])System.getProperties().get(this.hashCode() + "g")) instanceof int[][] g && ((int[])System.getProperties().get(this.hashCode() + "px")) instanceof int[] px && ((int[])System.getProperties().get(this.hashCode() + "py")) instanceof int[] py) ? (px[value] > 0 && py[value] > 0 ? g[px[value] - 1][py[value] - 1] : 0) + (px[value] > 0 && py[value] < g.length - 1 ? g[px[value] - 1][py[value] + 1] : 0) + (px[value] < g.length - 1 && py[value] > 0 ? g[px[value] + 1][py[value] - 1] : 0) + (px[value] < g.length - 1 && py[value] < g.length - 1 ? g[px[value] + 1][py[value] + 1] : 0) : 0;
    }
}
