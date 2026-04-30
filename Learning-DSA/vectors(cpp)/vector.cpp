// Inside a vector we can only stors gomoginius data elements.
// The length of the vector can be resize in the run time.
// We can say vector is a dynamic array. 
// Vectors can provide the bound checking. 
#include <iostream>
#include <vector>
int main(){
/*
    //Array portion:
    int a[4] = {1,2,3,4};
    std::cout<<a[3]<<std::endl;
*/
    //Vector potion:
    // std::vector<dataType> vector_Name(Vector_size);
    std::vector<int> My_vector; //we haven not give a size and we can do it and it's an empty vector.
    
    My_vector.push_back(34);
    My_vector.push_back(20); 
    My_vector.push_back(56);
    std::cout<<My_vector[1]<<std::endl;
    std::cout<<My_vector[2]<<std::endl;
    std::cout<<My_vector[0]<<std::endl;

    std::vector<std::string> My_snacks_those_I_have_lost_maybe_because_of_my_sister;
    My_snacks_those_I_have_lost_maybe_because_of_my_sister.push_back("Chocolates");
    std::cout<<"My "<< My_snacks_those_I_have_lost_maybe_because_of_my_sister[0]<<std::endl;


    std::vector<int> Numbers(5);
    Numbers[1] = 2;
    Numbers[0] = 334;
    Numbers[2] = 2957;
    Numbers[3] = 321;
    Numbers[4] = 88;
    for (int i = 0;i<5;i++){
        std::cout<< Numbers[i]<<std::endl;
    }
    std::cout<<Numbers[1]<<std::endl;
    std::vector<char> Names(3);
    std::vector<double> marks(2); 
    
    return 0;
}