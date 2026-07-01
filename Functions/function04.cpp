#include <iostream>
double calculateTicketPrice(int age){
    if (age < 12){
        return 5.50;
    }
    else if(age >= 65){
        return 7.00;
    }
    else{
        return 12.00;
    }
}
int main(){
int Age;
std::cout<<"Please Enter your age: ";
std::cin>>Age;
std::cout<<std::endl;
std::cout<<"The Price of ticket is $ "<<calculateTicketPrice(Age)<< " for you."<<std::endl;
    return 0;
}