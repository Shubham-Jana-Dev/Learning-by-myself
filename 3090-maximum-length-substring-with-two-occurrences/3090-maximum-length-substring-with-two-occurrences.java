import java.util.Hashtable;
class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int right = 0;
        int max_length = 0;
        int current_len = 0;
        Hashtable<Character, Integer> myMap = new Hashtable<>();

        for(int i = 0; i < s.length(); i++){
            myMap.put(s.charAt(right),myMap.getOrDefault(s.charAt(right),0)+1);
            //current_len++;
            // if(myMap.containsKey(s.charAt(right))){
            //     left++;
            //     //current_len--;
            // }
            while(myMap.getOrDefault(s.charAt(right),0)>2){
                //myMap.clear();
                myMap.put(s.charAt(left),myMap.get(s.charAt(left))-1);
                if(myMap.get(s.charAt(left))==0){
                    myMap.remove(s.charAt(left));
                }
                // current_len--;
                left++;
            }
           current_len = right-left+1;
            if(current_len>max_length){
                max_length = current_len;
            }
           right++;
        }
        return max_length;
    }
}