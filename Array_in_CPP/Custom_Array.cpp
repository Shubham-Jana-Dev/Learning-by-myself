//
//  Custom_Array.cpp
//  
//
//  Created by Shubham Jana on 25/06/26.
// g++ -std=c++17 Custom_Array.cpp -o Custom_Array && ./Custom_Array
#include <iostream>
#include <iterator>
#include <vector>
int get_size(){
    int size = 0;
    std::cout<< "Enter the size of the array: ";
    std::cin>>size;
    return size;
}
void array_creation(int A_size){
    
    std::vector<int> My_array(A_size);
    int element = 0;
    for(int i = 0; i < A_size; i++){
        std::cout<<"Enter the element: ";
        std::cin>>element;
        My_array[i] = element;
//        element = 0;
    }
    std::cout<<"\n{";
    for(int j = 0; j < std::size(My_array); j++){
        if(j == My_array.size() -1){
            std::cout << My_array[j]<<"}"<<std::endl;
            break;
        }
        std::cout << My_array[j] << ", ";
    }
}
int main(){
    int size = get_size();
    array_creation(size);
    remove("Custom_Array");
    return 0;
}

