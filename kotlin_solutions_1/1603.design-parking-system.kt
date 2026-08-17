/*
 * @lc app=leetcode id=1603 lang=kotlin
 *
 * [1603] Design Parking System
 */

class ParkingSystem(big: Int, medium: Int, small: Int, private val count: IntArray = intArrayOf(0, big, medium, small)) { fun addCar(carType: Int): Boolean = count[carType]-- > 0 }