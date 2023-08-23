public class RotatedBinarySearch {
    public static void main(String args[]){

        int[] arr = {4,5,6,7,0,1,2};

        int result = binarySearch(arr, 0, arr.length-1, 2);

        System.out.println(result);


    }

    static int binarySearch(int[] arr, int start, int end, int target){

        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid] ){
            if(target >= arr[start] && target <= arr[mid] ){
                return binarySearch(arr, start, mid-1, target);
            }
            return binarySearch(arr, mid+1, end, target);
        }

        if(target >= arr[mid] && target <= arr[end]){
            return binarySearch(arr, mid+1, end, target);
        }
        return binarySearch(arr, start, mid-1, target);
    }
}
