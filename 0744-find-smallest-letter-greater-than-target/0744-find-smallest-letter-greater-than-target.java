class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid;
        char result = 'i';
        if(target >= letters[end] || target < letters[0]){
            return letters[0];
        }
        // else if(target == letters[0] && letters.length > 1){
        //     return letters[1];
        // }
        while(start <= end){
            mid = start + (end - start)/2;
            // if(letters[mid] == target){
            //     return letters[mid+1];
            //}
             if(letters[mid] < target){
                start = mid + 1;
                 result = letters[mid +1];
            }else if(letters[mid] == target){
                start = mid + 1;
                 result = letters[mid + 1];
            }
            else{
                end = mid - 1;
                result = letters[mid];
            }
        }
        
        return result;
    }
}