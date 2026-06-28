//
//  Arr_in_class.cpp
//  
//
//  Created by Shubham Jana on 28/06/26.
//
// g++ -std=c++17 Arr_in_class.cpp -o Arr_in_class && ./Arr_in_class
#include <iostream>
#include <vector>
class Array {
public:
    std::vector<int> MyArray = { };
    int ArraySize = 0;
    std::vector<int> ArrayCreation(){
        std::cout << "Enter the size of the array: ";
        std::cin >> ArraySize;
        for (int i = 0; i < ArraySize; i++){
            int element = 0;
            std::cout << "Enter the element: ";
            std::cin >> element;
            MyArray.push_back(element);
        }
        return MyArray;
    }
    void DisplayArray() const {
        if (MyArray.empty()){
            std::cout << "[]" << std::endl;
            return;
        }
        int ArraySize = MyArray.size();
        std::cout << "[";
        bool first = true;
        for (int j : MyArray) {
                if (!first) {
                    std::cout << ", ";
                }
                std::cout << j;
                first = false;
            }
            std::cout << "]" << std::endl;
        }
};
int main(){
    Array A1;
    A1.DisplayArray(); // it would return '[]' sinse we did not create the array by calling the ArrayCreation() method.
    A1.ArrayCreation();
    A1.DisplayArray();
    return 0;
}
