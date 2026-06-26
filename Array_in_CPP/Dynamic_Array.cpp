//
//  Dynamic_Array.cpp
//  
//
//  Created by Shubham Jana on 26/06/26.
// clear && g++ -std=c++17 Dynamic_Array.cpp -o Dynamic_Array.exe && ./Dynamic_Array.exe

#include <iostream>
#include <vector>

void Dynamic_array_creation(){
    std::vector<int> The_array = { };
    The_array.push_back(56);
    std::cout<<The_array[0]<<std::endl;
}
int main(){
    Dynamic_array_creation();
    return 0;
}
