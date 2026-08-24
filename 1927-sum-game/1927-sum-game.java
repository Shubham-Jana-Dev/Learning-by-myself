class Solution {
    public boolean sumGame(String num) {
        int s1 = 0;
        int s2 = 0;
        int q1 = 0;
        int q2 = 0;
        for(int i = 0; i<(num.length()/2);i++){
            if(num.charAt(i) == '?'){
                q1++;
            }else{
                s1 = s1 + num.charAt(i) - '0';
            }
        }
        for(int j = num.length()/2; j<num.length();j++){
            if(num.charAt(j) == '?'){
                q2++;
            }else{
                s2 = s2 + num.charAt(j) - '0';
            }
        }
        return (2*(s1-s2) != 9*(q2-q1));
    }
}