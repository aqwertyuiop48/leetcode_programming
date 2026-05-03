/*
 * @lc app=leetcode id=929 lang=java
 *
 * [929] Unique Email Addresses
 */

record Solution() {
    public int numUniqueEmails(String[] emails) {
        return (int) java.util.Arrays.stream(emails).map(e -> e.split("@")).map(p -> p[0].split("\\+")[0].replace(".", "") + "@" + p[1]).distinct().count();
    }
}
