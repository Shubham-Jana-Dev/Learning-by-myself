class Solution {
    public String removeStars(String s) {
      String result = "";
      ArrayList<String> myArray = new ArrayList<>();
      for(int i = 0; i<s.length(); i++){
        if(s.charAt(i) != '*'){
            myArray.add(String.valueOf(s.charAt(i)));
        }else{
                myArray.remove(myArray.size()-1);
        }
      }
        for(String j : myArray){
            result += j;
        }
        return result;
    }
}