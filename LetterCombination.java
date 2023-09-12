import java.lang.reflect.Array;
import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        letter("", "2");
        ArrayList<String> res = new ArrayList<>();
        res = letterRet("", "12");
        System.out.println(res);
    }

    static void letter(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';

        for(int  i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a'+i);
            letter(p+ch, up.substring(1));
        }
        
    }    

    static ArrayList<String> letterRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';

        ArrayList<String> out = new ArrayList<>();

        for(int  i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a'+i);
            out.addAll(letterRet(p+ch, up.substring(1)));
        }
        return out;
    }
}
