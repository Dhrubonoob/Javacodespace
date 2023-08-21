public class Floor {
    public static void main(String[] args) {
        
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        int target = 15;

        int ans = floorNumber(arr, target);
        System.out.println(ans);

    }
    static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }
}
