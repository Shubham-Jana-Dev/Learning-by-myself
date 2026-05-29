#include <iostream>
#include <vector>

int main(){
    
    float price = 100.25f;
    float *ptr = &price;
    float** ptr2 = &ptr;
    std::cout<<"the value of price = "<<price<<std::endl;
    std::cout<<"the address of the price is "<< ptr<<std::endl;
    std::cout<< "*ptr = "<< *ptr <<std::endl;
    std::cout<<"--^v^----^v^----^v^--pointer of pointer--^v^----^v^----^v^--"<< std::endl;
    std::cout<<"the address of address is ptr2 = "<<ptr2<<std::endl;
    return 0;

}