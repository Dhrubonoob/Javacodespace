public class Maximum_wealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {9,1,6},
            {7,3,3}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts){
       
        int max_wealth = 0;
        for(int person = 0; person < accounts.length; person++){
            int sum = 0;
            for(int account = 0; account<accounts[person].length;account++){
                sum += accounts[person][account];
            }
            if(sum > max_wealth){
                max_wealth = sum;
            }
        }
        return max_wealth;
    }
}

