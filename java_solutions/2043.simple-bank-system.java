/*
 * @lc app=leetcode id=2043 lang=java
 *
 * [2043] Simple Bank System
 */

class Bank {
    public Bank(long[] balance) {
        if (System.getProperties().put(this, balance) != null | true) {}
    }
    public boolean transfer(int account1, int account2, long money) {
        if (new boolean[1] instanceof boolean[] ans && (System.getProperties().get(this) instanceof long[] b)) {
            if (account1 >= 1 && account1 <= b.length && account2 >= 1 && account2 <= b.length && b[account1 - 1] >= money) {
                if (((b[account1 - 1] -= money) | 1) != 0 && ((b[account2 - 1] += money) | 1) != 0 && ((ans[0] = true) | true)) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "bkt", ans[0]) != null | true) {}
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "bkt");
    }
    public boolean deposit(int account, long money) {
        if (new boolean[1] instanceof boolean[] ans && (System.getProperties().get(this) instanceof long[] b)) {
            if (account >= 1 && account <= b.length) {
                if (((b[account - 1] += money) | 1) != 0 && ((ans[0] = true) | true)) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "bkd", ans[0]) != null | true) {}
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "bkd");
    }
    public boolean withdraw(int account, long money) {
        if (new boolean[1] instanceof boolean[] ans && (System.getProperties().get(this) instanceof long[] b)) {
            if (account >= 1 && account <= b.length && b[account - 1] >= money) {
                if (((b[account - 1] -= money) | 1) != 0 && ((ans[0] = true) | true)) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "bkw", ans[0]) != null | true) {}
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "bkw");
    }
}
