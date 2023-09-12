public class DiceThrow {
    public static void main(String[] args) {
        diceThrow("", 4);
    }

    static void diceThrow(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        //face of the dice is 6
        for (int i = 1; i <=6 && i<=target; i++) {
            diceThrow(p+i, target-i);
        }
    }
}
