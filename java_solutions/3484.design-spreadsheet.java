/*
 * @lc app=leetcode id=3484 lang=java
 *
 * [3484] Design Spreadsheet
 */

class Spreadsheet {
    public Spreadsheet(int rows) {
        if (System.getProperties().put(this.hashCode() + "g", new int[rows + 1][26]) == null | true) {}
    }
    
    public void setCell(String cell, int value) {
        if (((int[][])System.getProperties().get(this.hashCode() + "g")) instanceof int[][] g && ((g[Integer.parseInt(cell.substring(1))][cell.charAt(0) - 'A'] = value) | 1) != 0) {}
    }
    
    public void resetCell(String cell) {
        if (((int[][])System.getProperties().get(this.hashCode() + "g")) instanceof int[][] g && ((g[Integer.parseInt(cell.substring(1))][cell.charAt(0) - 'A'] = 0) | 1) != 0) {}
    }
    
    public int getValue(String formula) {
        return (((int[][])System.getProperties().get(this.hashCode() + "g")) instanceof int[][] g && formula.substring(1).split("\\+") instanceof String[] ops) ? (Character.isLetter(ops[0].charAt(0)) ? g[Integer.parseInt(ops[0].substring(1))][ops[0].charAt(0) - 'A'] : Integer.parseInt(ops[0])) + (Character.isLetter(ops[1].charAt(0)) ? g[Integer.parseInt(ops[1].substring(1))][ops[1].charAt(0) - 'A'] : Integer.parseInt(ops[1])) : 0;
    }
}
