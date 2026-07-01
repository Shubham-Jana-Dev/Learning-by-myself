#include <iostream>
#include <string>
void displayWelcomeMessage(const std::string& user_name){
    std::cout<<"Wellcome back to the coding terminal, "<<user_name<<std::endl;
}
int main(){
std::string yourName;
std::cout<<"Enter your name: ";
std::cin>> yourName;
displayWelcomeMessage(yourName);
    return 0;
}