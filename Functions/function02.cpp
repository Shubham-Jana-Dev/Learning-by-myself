#include <iostream>
#include <string>
void helloUser(std::string name){
    std::cout<<"Hello "<< name <<" nice to meet you."<< std::endl;
}
int main(){
    std::string yourName;
    std::cout<< "Please enter your name here: ";
    std::cin>>yourName;
    std::cout<<std::endl;
    helloUser(yourName);

    return 0;
}