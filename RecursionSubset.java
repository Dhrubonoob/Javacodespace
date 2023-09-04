public class RecursionSubset {
    public static void main(String[] args) {
        skip("", "baacagah");
        System.out.println(skipTwo("baacagah"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }

    }

    static String skipTwo(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skipTwo(up.substring(1));
        }else{
            return ch + skipTwo(up.substring(1));
        }
    }
}
