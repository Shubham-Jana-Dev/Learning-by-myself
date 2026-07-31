class Solution {
    public String[] findWords(String[] words) {
        String first_row = "QWERTYUIOP";
        String second_row = "ASDFGHJKL";
        String third_row = "ZXCVBNM";
        List<String> resultList = new ArrayList<>();
        int flag = 0;
        for (String k : words){
            flag = 0;
            for (char j : k.toCharArray()){
                if(first_row.contains(String.valueOf(Character.toUpperCase(j))) && (flag == 1 || flag == 0)){
                    flag = 1;
                }else if(second_row.contains(String.valueOf(Character.toUpperCase(j))) && (flag == 2 || flag == 0)){
                    flag = 2;
                }else if(third_row.contains(String.valueOf(Character.toUpperCase(j))) && (flag == 3 || flag == 0)){
                    flag = 3;
                }else{
                    flag = -1;
                    break;
                }
            }if (flag != -1){
                resultList.add(k);
            }
        }
        return resultList.toArray(new String[0]);
    }
}