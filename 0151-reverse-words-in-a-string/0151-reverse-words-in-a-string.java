class Solution {
    public String reverseWords(String s) {
        String lastWord = "";
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                lastWord = lastWord + s.charAt(i);
            }else{
                if(!lastWord.isEmpty()){
                result.add(lastWord);
                }
                lastWord = "";
            }
        }
        if(!lastWord.isEmpty()){
                result.add(lastWord);
                }
        String newResult = "";
        for(int j = result.size() - 1; j >= 0; j--){
            if(!result.get(j).equals(" ")){
            newResult = newResult + " " + result.get(j);
            }
        }
        return newResult.isEmpty() ? "" : newResult.substring(1);
    }
}