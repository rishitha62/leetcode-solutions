public class SplitAStringInBalancedStrings {

    public int balancedStringSplit(String s) {
        int balance = 0;
        int ans = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'L')
                balance++;
            else balance--;

            if(balance == 0)
                ans++;
        }
        return ans;
    }
}
