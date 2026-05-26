#include <iostream>
int main(){
int range;
std::cout<<"enter the range of the square.";
std::cin>>range;
for (int i = 0; i<=range;i++){
    for(int j = 0; j <= range; j++){
        std::cout<<"* ";
    }
    std::cout<<std::endl;
}
    return 0;
}