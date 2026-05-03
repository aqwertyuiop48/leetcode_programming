/*
 * @lc app=leetcode id=468 lang=java
 *
 * [468] Validate IP Address
 */

record Solution() {
    public String validIPAddress(String queryIP) {
        return queryIP.matches("^((25[0-5]|(2[0-4]|1[0-9]|[1-9]|)[0-9])(\\.(?!$)|$)){4}$") ? "IPv4" : queryIP.matches("^([0-9a-fA-F]{1,4}(:(?!$)|$)){8}$") ? "IPv6" : "Neither";
    }
}
