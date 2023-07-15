public class Binary_search {
    public static void main(String[] args) {
        
        int[] arr = {12, 14, 15, 20 ,29 ,45, 90};
        int target = 90;

        int ans = search(arr, target);
        System.out.println(ans);

    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        


        while(start <= end){

            int mid = (start + end) /2;
            if (target < arr[mid]) {
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
