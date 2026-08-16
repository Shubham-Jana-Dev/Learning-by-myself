class Solution {
    public int maxFreqSum(String s) {
        int maxC = 0;
        int maxV = 0;
        int result = 0;

        HashMap<Character, Integer> v = new HashMap<>();
        HashMap<Character, Integer> c = new HashMap<>();

        Set<Character> vowelSet = Set.of('a','i','o','u','e');

        for(int j = 0; j<s.length(); j++){
            char ch = s.charAt(j);
            if(vowelSet.contains(ch)){
                if(v.containsKey(ch)){
                    v.put(ch,v.get(ch)+1);
                }else{
                    v.put(ch,1);
                }
            }else{
                if(c.containsKey(ch)){
                    c.put(ch,c.get(ch)+1);
                }else{
                    c.put(ch,1);
                }
            }
        }
        int count = 0;
        for(Character c1 : v.keySet()){
            count = v.get(c1);
            if(maxV<count){
                maxV = count;
            }
        }
        for(Character c2 : c.keySet()){
            count = c.get(c2);
            if(maxC < count){
                maxC = count;
            }
        }
        return maxC + maxV;
    }
}