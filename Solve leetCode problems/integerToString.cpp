// Leet code problem number 8. Convert string to integer.(mid)
// g++ -std=c++17  integerToString.cpp -o integerToString.exe && ./integerToString.exe
//
//
//  Created by Shubham Jana on 15/07/26.
//
#include <iostream>
#include <string>
using namespace std;
class Solution {
public:
    int myAtoi(string s) {
        string nums = " -+0123456789";
        if (nums.find(s[0]) == string::npos) {
            return 0;
        }
        int theNum = 0;
        bool space = false;
        bool flag = true;
        bool elementSeen = false;
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == ' ' && elementSeen == true){
                break;
            }
            if (nums.find(s[i]) == string::npos) {
                break;
            }
            if (s[i] == '-') {
                if(elementSeen == true){
                    break;
                }
                elementSeen = true;
                flag = false;
            } else if(s[i] == '+'){
                if(elementSeen == true){
                    break;
                }
                elementSeen = true;
            }
            if (s[i] == ' '){
                space = true;
                continue;
            }
            if (s[i] == '0' && theNum == 0){
                elementSeen = true;
                continue;
            }else{
               
                if (theNum > INT_MAX / 10 || (theNum == INT_MAX / 10 && (s[i]-'0') > 7)) {
                    if (flag == false) {
                        return INT_MIN;
                    } else {
                        return INT_MAX;
                    }
                    elementSeen = true;
                }else if (s[i] != ' ' && s[i] != '+' && s[i] != '-' ) {
                    theNum = theNum * 10 + (s[i] - '0');
                } else if (i != 0 &&
                           ((s[i] == '+' || s[i] == '-') && space == false)) {
                    break;
                }
                elementSeen = true;
            }
        }
        if (flag == false) {
            theNum = theNum * (-1);
        }
        return theNum;
    }
};
int main(){
    string MyString = "   -0000003445rth56h8";
    Solution Ato1;
    int theInteger = Ato1.myAtoi(MyString);
    cout<<"The integer version of \"" << MyString << "\" is "<< theInteger << endl;
    return 0;
}
