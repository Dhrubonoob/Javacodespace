

public class RepeatedNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};


        int ans = repeatedNumber(nums);
        
        System.out.println(ans);
    }


    static int repeatedNumber(int[] nums){
        int i = 0;
        while (i<nums.length) {

            if(nums[i] != i+1){
                int currentIndex = nums[i] - 1;
                if(nums[i] != nums[currentIndex]){
                swap(nums, i , currentIndex);
                }else{
                return nums[i];
                }

            }else{
                i++;
            }
        }    
        

        return -1;
               
    }
    
    

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
