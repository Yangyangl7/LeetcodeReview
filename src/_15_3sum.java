import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//Note: The solution set must not contain duplicate triplets.
//For example, given array S = [-1, 0, 1, 2, -1, -4],
//
//A solution set is:
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
public class _15_3sum {
	  public List<List<Integer>> threeSum(int[] nums) {
	       List<List<Integer>> ans = new ArrayList<>();
	  
	       Arrays.sort(nums);
	       
	       for (int i = 0; i < nums.length; i++) {
	    	   int target = 0 - nums[i];
	    	   int lo = i + 1;
	    	   int hi = nums.length - 1;
	    	   if (i == 0 || (i > 0 && lo != i)) {
	    		   while (lo < hi) {
	    			   if (target == nums[lo] + nums[hi]) {
	    				   ans.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
	    				   while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
	    				   while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
	    				   lo++;
	    				   hi--;
	    			   }
	    			   else if (target > nums[lo] + nums[hi]) lo++;
	    			   else hi--;
	    		   }
	    	   }
	       }
	       
	       return ans;
	  }
}
