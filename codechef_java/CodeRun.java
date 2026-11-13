 import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[3];
        check a = new check();
        for (int i = 0; i < 3; i++){
            arr[i] = in.nextInt();
        }
        a.bubble(arr);

    }}
 class check {
 public  void bubble(int[] nums){
    int n  = nums.length;
    for (int i = 0; i < n - 1; i++){
        for (int j = 0; j < n - i - 1; j++){
            if (nums[j] > nums[j + 1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
    }
    System.out.println(nums[1]);
    }}
