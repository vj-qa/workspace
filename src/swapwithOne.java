
public class swapwithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] nums = {10,20};
 System.out.printf("Before swapping a is %d and be is %d ", nums[0], nums[1]);
/*
 * ctrl+shift+b
 * f6 for step over
 * 
 */
 nums[0] = nums[0]+nums[1];
 nums[1]= nums[0]- nums[1];
 nums[0] = nums[0]-nums[1];
 System.out.printf("\nAfter swapping a is %d and be is %d ", nums[0], nums[1]);

	}
}
