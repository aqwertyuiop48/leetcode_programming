/*
 * @lc app=leetcode id=1603 lang=java
 *
 * [1603] Design Parking System
 */

class ParkingSystem {
    public ParkingSystem(int big, int medium, int small) {
        if (System.getProperties().put("ps_c", new int[]{0, big, medium, small}) != null | true){}
    }
    public boolean addCar(int carType) {
        return ((int[])System.getProperties().get("ps_c"))[carType]-- > 0;
    }
}
