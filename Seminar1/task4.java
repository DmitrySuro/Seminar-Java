package Seminar1;
public class task4 {public static void main(String[] args) {
    int[] nums = {3,2,2,3};
    int elem = 3;
    int temp = 0;
    for (int i = 0; i < nums.length; i++) {
       if (nums[i] == elem) 
       {
            temp = nums[i];
            nums[i] = nums[nums.length - 1-i];
            nums[nums.length - 1-i] = temp;
       }
       System.out.printf("%d %d %d %d",nums[0],nums[1],nums[2],nums[3]);
    }
}
    
}
