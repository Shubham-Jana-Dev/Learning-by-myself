//
// g++  pointer_arithmetic.cpp -o pointer_arithmetic && ./pointer_arithmetic
//
//
//  Created by Shubham Jana on 24/06/26.
//
#include <iostream>
#include <cmath>
void pointer_arithmetic(int num1, int num2){
    auto pointer_addition =[&num1,&num2](){
        int* ptr1 = &num1;
        int* ptr2 = &num2;
        return *ptr1 + *ptr2;
    };
    auto addition = pointer_addition();
    std::cout << num1 <<" + "<< num2 <<" = "<< addition << std::endl;
    auto pointer_subtraction =[&num1,&num2](){
        int* ptr1 = &num1;
        int* ptr2 = &num2;
        return *ptr1 - *ptr2;
    };
    auto subtraction = pointer_subtraction();
    std::cout << num1 << " - " << num2 << " = " << subtraction << std::endl;

    auto pointer_divition = [&num1, &num2](){
        int* ptr1 = &num1;
        int* ptr2 = &num2;
        if(*ptr1 != 0){
            return *ptr2 / *ptr1;
        }
        else{
            return -1;
        }
    };
    std::cout << num2 << " / " << num1 << " = " << pointer_divition() << std::endl;
    
    auto pointer_multiplication = [&num1, &num2](){
        int* p = &num1;
        int* b = &num2;
        return *p * *b;
    };
    std::cout << num1 << " x " << num2 << " = " << pointer_multiplication() << std::endl;
    
    auto pointer_power = [&num1 , &num2](){
        int num3;
        int* a = &num1;
        // int* b = &num2;
        std::cout << "Enter a number that would be power: ";
        std::cin >> num3;
        return pow(*a,num3); //,pow(*b,num3);
    };
    std::cout<<pointer_power()<<std::endl;
    
}
int main(){
    int a = 230;
    int b = 400;
    pointer_arithmetic(a, b);
    return 0;
}
