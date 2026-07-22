class Solution {
    public int[] plusOne(int[] digits) {
        
        int lastElement = digits[digits.length-1];
        if(lastElement < 9){
            digits[digits.length-1] = digits[digits.length - 1] +1;
            return digits;
        }
        int count = 0;
      

        for(int j = 0; j < digits.length; j++){
            if(digits[j] == 9){
               
                count++;
            }else{
                count = 0;
                
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
        return resultArray;
           
        
       
    }

}