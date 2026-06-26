//
//  Arr_push_back.cpp
//  
//
//  Created by Shubham Jana on 26/06/26.

// clear && g++ -std=c++17 Arr_push_back.cpp -o Arr_push_back.exe && ./Arr_push_back.exe

#include <iostream>
#include <vector>
void push_back(){
    std::vector<int> v = {2,3,4};
    v.push_back(9);
    for (int i:v){
        std::cout<< i << " ";
    }
}
void push_back_in_empty_array(){
    std::vector<int> My_array = {};
    My_array.push_back(10);
    My_array.push_back(14);
    My_array.push_back(90);
    My_array.push_back(34);
    for (int i : My_array0.){
        std::cout << i << " ";
    }
    std::cout<<std::endl;
}
int main(){
    push_back();
    return 0;
}
