//
//  Max_element_in_Array.cpp
//  
//
//  Created by Shubham Jana on 26/06/26.
//
// g++ -std=c++17 Max_element_in_Array.cpp -o Max_element_in_Array && ./Max_element_in_Array
#include <iostream>
#include <vector>
void max_element(){
    std::vector<int> The_array = { };
    int A_size = 0;
    double sum = 0;
    double avarage = 0;
    int max = 0;
    std::cout<<"Enter the size of the array: ";
    std::cin >> A_size;
    for (int i = 0; i < A_size; i++){
        int element = 0;
        std::cout<<"Enter the element: ";
        std::cin >> element;
        sum = sum + element;
        if (max<element){
            max = element;
        }
        The_array.push_back(element);
    }
    avarage = sum/A_size;
    std::cout << "The maximum element in this array = "<< max <<std::endl;
    std::cout << "The avarage of this array = "<< avarage<<std::endl;
}
int main(){
    max_element();
    return 0;
}
