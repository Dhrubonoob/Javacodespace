public class FindUnique {
    public static void main(String[] args) {
        
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(findUnique(arr));
    }

    static int findUnique(int[] arr){
        int result = 0;
        for(int num : arr){
            result = result ^ num;
        }
        return result;
    }
}
