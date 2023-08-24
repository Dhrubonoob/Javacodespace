public class Practice_set_eight {
    public static void main(String args[]){

        int[] arr = {1,2,3,2,1};

        System.out.println(keySearching(arr, 4));

    }

    static int keySearching(int[] arr, int key){
        int peak = peakIndex(arr);
        int searchInFirsthalf = binarySearch(arr, key, 0, peak);

        if(searchInFirsthalf != -1){
            return searchInFirsthalf;
        }
        return binarySearch(arr, key, peak+1, arr.length-1);
    }

    static int peakIndex(int[] arr){
        int s = 0;
        int e = arr.length-1;

        int mid = s + (e-s)/2;
        if(arr[mid] < arr[mid+1]){
            s = mid + 1;
        }else{
            e = mid;
        }

        return s;
    }

    static int binarySearch(int[] arr, int key, int s, int e){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(key > arr[mid]){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }
}
