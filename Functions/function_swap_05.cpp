#include <iostream>
void swapValue(int& num1, int& num2){
int temp = num1;
num1 = num2;
num2 = temp;
}
int main(){
    int A;
    int B;
std::cout<<"Please enter the value of A = ";
std::cin>>A;
std::cout<<"\nPlease enter the value of B = ";
std::cin>>B;
swapValue(A,B);
std::cout<< "\nA = "<<A<<"\nB = "<<B<<std::endl;
    return 0;
}