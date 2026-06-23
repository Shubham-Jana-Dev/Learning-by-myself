//
//  Pointer.cpp
//  
//
//  Created by Shubham Jana on 23/06/26.
// g++ Pointer.cpp -o Pointer && ./Pointer

#include <iostream>
void pointer_practice(){
    int num1 = 200;
    std::cout << "The address of num1 (variable) = " << &num1 << std::endl;
    
    std::cout << "Now we shall store the value of the address of the num1 pointer inside a variable." << std::endl;
    /* This code would not run
    int v = &num1; // would return error.
    Now we can see we can not store the value of an address of an variable insde another variable.
    Now that's why we use pointers which can store the address of a vatiable and we can also access the value of that variable.
     */
    int* ptr = &num1;
    std::cout << "ptr = "<< ptr <<"\n(Dereferance) *ptr = " << *ptr <<std::endl;
    std::cout << "We do *ptr (dereferancing) to get back the value of the varialbe." << std::endl;
}
int main(){
    pointer_practice();
    remove("Pointer");
    return 0;
}
