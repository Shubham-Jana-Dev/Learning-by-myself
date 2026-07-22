class Solution {
    public int[] plusOne(int[] digits) {
        String strNum = "";
        int lastElement = digits[digits.length-1];
        if(lastElement < 9){
            digits[digits.length-1] = digits[digits.length - 1] +1;
            return digits;
        }
        int count = 0;
        boolean flag = false;

        for(int j = 0; j < digits.length; j++){
            if(digits[j] == 9){
                flag = true;
                count++;
            }else{
                count = 0;
                flag = false;
            }
        }
        int[] resultArray = new int[digits.length];
        
        if(count == digits.length){
        int[] resultArray1 = new int[digits.length + 1];
        for(int i = 0; i<digits.length - count; i++){
            resultArray1[i] = digits[i];
        }
        for(int k = count; k < resultArray1.length-1; k++){
            resultArray1[k] = 2;
        }
        resultArray1[count] = 0;
        resultArray1[0] = 1;


        return resultArray1;
        }else if(count < digits.length ){
            for(int i = 0; i<digits.length - count; i++){
            resultArray[i] = digits[i];
        }
            resultArray[resultArray.length - count-1] = digits[digits.length - count-1] + 1;
            return resultArray;
        }
           
        
        // BigInteger number = 0;
        // for(int i = 0; i<digits.length; i++){
        //     number = number*10 + digits[i]; 
        // }
        // number = number+1;
        // strNum = strNum + number;
        // int[] resultarray = new int[strNum.length()];
        // for(int j = 0; j < strNum.length(); j++){
        //     resultarray[j] = strNum.charAt(j) - '0';
        // }
        return resultArray;
    }

}