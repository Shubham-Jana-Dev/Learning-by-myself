#include <iostream>
int main(){
// Dynamic memory => Memory that is allocated after the program is already compiled & running.
// Use the 'now' opperator to allocate memory in the heap rather than the stack.

// Useful when we do not know how much memory we will need. Makes our prgram more flexible.
// especially when accepting user input.

char *My_gred = NULL;
int size;
std::cout<<"Enter the size of the array: ";
std::cin>>size;
std::cout<<std::endl;
My_gred = new char[size];
for (int i = 0; i<size;i++){
    std::cout<<"enter the charecter at the "<<i<<"th position: ";
    std::cin>>My_gred[i];

}
std::cout<< "greds are: "<<My_gred<<std::endl;
delete[] My_gred;
    return 0;
}