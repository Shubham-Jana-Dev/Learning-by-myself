#include <iostream>
void sayhello(){
 std::cout<<"Hello Shubham"<<std::endl;
}
int main(){
sayhello();
std::cout<<"------Funtion inside a loop-----"<<std::endl;
for(int i = 0; i <= 10; i++){
    sayhello();
}
    return 0;
}