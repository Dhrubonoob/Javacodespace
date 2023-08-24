public class Practice_set_seven {
    public static void main(String args[]){

        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(searchingKeyInRotatedArray(arr, 0, 0, arr.length-1));
    }

    static int searchingKeyInRotatedArray(int[] arr, int key, int start, int end){

        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;
        if(key == arr[mid]){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if(key >= arr[start] && key <= arr[mid]){
                return searchingKeyInRotatedArray(arr, key, start, mid-1);
            }
            return searchingKeyInRotatedArray(arr, key, mid+1, end);
        }

        if(key >= arr[mid] && key <= arr[end]){
            return searchingKeyInRotatedArray(arr, key, mid+1, end);
        }
        return searchingKeyInRotatedArray(arr, key, start, mid-1);
    }
}
