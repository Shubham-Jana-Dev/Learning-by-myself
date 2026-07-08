//
// g++ -std=c++20  Reverse_string344.cpp -o Reverse_string344.exe && Reverse_string344.exe
//
//
//  Created by Shubham Jana on 08/07/26.
//
#include <iostream>
#include <string>
class reverse_string{
public:
    std::string reverseString(std::string &myString){
        int left = 0;
        char temp;
        int right = myString.size() - 1;
        while (left < right){
            temp = myString[left];
            myString[left] = myString[right];
            myString[right] = temp;
            right--;
            left++;
        }
        return myString;
    }
};
int main(){
    std::string name = "SHUBHAM";
    reverse_string s1;
    std::string rname = s1.reverseString(name);
    std::cout << "The reverse of the " << name << " is " << rname <<std::endl;
    return 0;
}
