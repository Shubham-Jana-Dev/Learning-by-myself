//
//  array1.cpp
//  
//
//  Created by Shubham Jana on 25/06/26.
//   g++ -std=c++17 array1.cpp -o array1 && ./array1
#include <iostream>
#include <iterator>
#include <array>
void practice_My_array(const std::array<int, 6>& My_array){

    for(int i = 0; i<std::size(My_array); i++){
        
        if (i == 0){
            std::cout << "{";
        }
        else if(i == std::size(My_array)-1){
            std::cout << My_array[i] << "}" << std::endl;
            break;
        }
        std::cout << My_array[i] << ", ";
    }
}
int main(){
    std::array<int, 6> marks = {90,50,66,34,70,34};
    practice_My_array(marks);
    remove("array1");
    return 0;
}
