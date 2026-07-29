class Solution {
    public int countSegments(String s) {
        if(s.length() == 0){
            return 0;
        }
        int count = 0;
        List<String> myList = List.of(s.split(" "));
        for (String j : myList){
            if(j != ""){
                count++;
            }
        }
        return count;
    }
}