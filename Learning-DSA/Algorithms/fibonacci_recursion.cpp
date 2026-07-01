//
// g++ -std=c++17 fibonacci_recursion.cpp -o fibonacci_recursion && ./fibonacci_recursion
//
//
//  Created by Shubham Jana on 01/07/26.
//
#include <iostream>
class Fibonacci{
public:
    int get_num(){
        int number = 0;
        std::cout << "Enter the nth number to findout the nth fibonacci number: ";
        std::cin >> number;
        return number;
    }
    int fibo(int num){
        if (num == 0 || num == 1){
            return num;
        }
    return fibo(num-1) + fibo(num-2);
    }
};
int main(){
    Fibonacci F1;
    int nth_fibocci = F1.fibo(F1.get_num());
    std::cout << nth_fibocci << std::endl;
    return 0;
}
