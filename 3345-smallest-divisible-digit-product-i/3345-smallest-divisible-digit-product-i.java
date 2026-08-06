class Solution {
    public int smallestNumber(int n, int t) {
        int temp = n;

        for (int i = 0; i <= 100; i++) {
            if (temp >= 10) {
                int firstDigit = temp / 10;
                int lastDigit = temp % 10;
                if ((firstDigit * lastDigit) % t == 0) {
                    return temp;
                }
            } else {
                if (temp % t == 0) {
                    return temp;
                }
            }
            temp++;
        }
        return temp;
    }
}