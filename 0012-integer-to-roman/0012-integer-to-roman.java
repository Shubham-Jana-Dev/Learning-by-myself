class Solution {
    public String intToRoman(int num) {
        String result = "";
        int temp = num;
        int rev = 0;
        int tenCount = 0;
        while(temp!=0){
            rev = rev*10 + temp%10;
            temp = temp/10;
            tenCount++;
        }
        
        while(rev!=0){
            System.out.println((int) (Math.pow(10,tenCount) * (rev%10))/10);
            int bitNum = (int) (Math.pow(10,tenCount) * (rev%10))/10;
            while(bitNum>0){
                if(bitNum == 4){
                    result = result + "IV";
                    break;
                } else if (bitNum == 9) {
                    result = result + "IX";
                    break;
                }else if (bitNum == 40) {
                    result = result + "XL";
                    break;
                }else if (bitNum == 90) {
                    result = result + "XC";
                    break;
                }else if (bitNum == 400) {
                    result = result + "CD";
                    break;
                }else if (bitNum == 900) {
                    result = result + "CM";
                    break;
                }else if(bitNum >= 1000){
                    bitNum = bitNum - 1000;
                    result = result + 'M';
                }else if (bitNum >= 500){
                    bitNum = bitNum - 500;
                    result = result + 'D';
                }else if (bitNum >= 100){
                    bitNum = bitNum - 100;
                    result = result + 'C';
                }else if (bitNum >= 50){
                    bitNum = bitNum - 50;
                    result = result + 'L';
                }else if (bitNum >= 10){
                    bitNum = bitNum - 10;
                    result = result + 'X';
                }else if (bitNum >= 5){
                    bitNum = bitNum - 5;
                    result = result + 'V';
                }else if (bitNum >= 1){
                    bitNum = bitNum - 1;
                    result = result + 'I';
                }
            }
            tenCount--;
            rev = rev/10;
        }
        return result;
    }
}