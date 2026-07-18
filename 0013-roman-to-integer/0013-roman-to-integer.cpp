class Solution {
public:
    int romanToInt(string s) {
      unordered_map<char, int> values = {
        {'I',1},
        {'V',5},
        {'X',10},
        {'L',50},
        {'C',100},
        {'D',500},
        {'M',1000}
      }; 
      int result = values[s[0]];
      int current = 1;
      int start = 0;
      if(s.size() == 1){
        return values[s[0]];
      }
      while(current <= s.size()){
            if(s[start] == 'I' && (s[current] == 'V' || s[current] == 'X')){
            result = result - values[s[start]];
            result = result + (values[s[current]] - values[s[start]]);
           }
           else if(s[start] == 'X' && (s[current] == 'L' || s[current] == 'C')){
            result = result - values[s[start]];
            result =result + (values[s[current]] - values[s[start]]);
           } 
           else if(s[start] == 'C' && (s[current] == 'D' || s[current] == 'M')){
            result = result - values[s[start]];
            result = result + (values[s[current]] - values[s[start]]);
           }
           else{
            result = result + values[s[current]];
        }
        start++;
        current++;
      }
      return result;
    }
};