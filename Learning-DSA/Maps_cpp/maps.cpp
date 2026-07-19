//
// g++ -std=c++17  maps.cpp -o maps.exe && ./maps.exe
//
//
//  Created by Shubham Jana on 18/07/26.
//

#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;

int main(){
    string four = "XIIIV";
    string six = "VI";
    unordered_map<char, int> myMap = {
        {'I' , 1},
        {'V' , 5},
        {'X' , 10}
    };
    int start = 0;
    int result = 0;
    for(int current = 1;current < four.size();current++){
        if(myMap[four[current]] >= myMap[four[start]]){
            result = myMap[four[current]] - myMap[four[start]];
        }else{
            result = myMap[four[start]] - myMap[four[current]];
        }
        start++;
//        current++;
    }
    cout<<result<<endl;
    return 0;
}
