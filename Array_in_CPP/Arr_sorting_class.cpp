//
//  Arr_sorting_class.cpp
//  
//
//  Created by Shubham Jana on 28/06/26.
//
// g++ -std=c++17 Arr_sorting_class.cpp -o Arr_sorting_class.exe && ./Arr_sorting_class.exe
#include <iostream>
#include <vector>
class The_array {
protected:
    std::vector<int> MyArray = { };
    int ArraySize = 0;
public:
    std::vector<int> ArrayCreation(){
        std::cout << "Enter the size of the array: ";
        std::cin>> ArraySize;
        for (int i = 0; i< ArraySize; i++){
            int element = 0;
            std::cout << "Enter the element: ";
            std::cin >> element;
            MyArray.push_back(element);
        }
        return MyArray;
    }
};
class Display : public The_array{
//    ArrayCreation();
public:
    void DisplayArray () {
        if(MyArray.empty()){
            std::cout<< "[]" << std::endl;
            return;
        }
        bool first = true;
        std::cout << "[";
        for (int j : MyArray){
            if(first != true){
                std::cout<<", ";
            }
            std::cout << j;
            first = false;
        }
        std::cout << "]";
    }
};

class Sorting : public The_array{
public:
    void Sorted_array(){
        int temp = 0;
        for (int i = 0; i<ArraySize; i++){
            for (int j = i + 1; j < ArraySize; j++){
                if(MyArray[i] > MyArray[j]){
                    temp = MyArray[i];
                    MyArray[i] = MyArray[j];
                    MyArray[j] = temp;
                }
            }
        }
        bool first = true;
        std::cout << "[";
        for (int g : MyArray){
            if (first != true){
                std::cout << ", ";
            }
            std::cout << g;
            first = false;
        }
        std::cout << "]"<< std::endl;
        return;
    }
};
int main (){
//    Display Dis1;
//    Dis1.ArrayCreation();
//    Dis1.DisplayArray();
    Sorting s1;
    s1.ArrayCreation();
    s1.Sorted_array();
  
    //s1.DisplayArray();
//    Dis1.DisplayArray();
    return 0;
}
