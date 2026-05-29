#include <iostream>
#include <vector>

int main(){
    
    float price = 100.25f;
    float *ptr = &price;
    std::cout<<"the value of price = "<<price<<std::endl;
    std::cout<<"the address of the price is "<< ptr<<std::endl;
    std::cout<< "*ptr = "<< *ptr <<std::endl;
    return 0;

}