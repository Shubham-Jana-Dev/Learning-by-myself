#include <iostream>
int main(){
// Dynamic memory => Memory that is allocated after the program is already compiled & running.
// Use the 'now' opperator to allocate memory in the heap rather than the stack.

// Useful when we do not know how much memory we will need. Makes our prgram more flexible.
// especially when accepting user input.
int *MyNum = NULL;
MyNum = new int;
*MyNum = 19;

std::cout << "addreass: " << MyNum <<std::endl;
std:: cout << "value: "<< *MyNum <<std::endl;
    delete MyNum;
char *My_greed = NULL;
int size;
std::cout<<"Enter the size of the array: ";
std::cin>>size;
std::cout<<std::endl;
My_greed = new char[size];
for (int i = 0; i<size;i++){
    std::cout<<"enter the charecter at the "<<i<<"th position: ";
    std::cin>>My_greed[i];

}
std::cout<< "greeds are: "<<My_greed<<std::endl;
delete[] My_greed;
    return 0;
}