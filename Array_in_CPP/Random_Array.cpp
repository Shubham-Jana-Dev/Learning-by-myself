//
//  Random_Array.cpp
//  
//
//  Created by Shubham Jana on 26/06/26.
//
// clear && g++ -std=c++17 Random_Array.cpp -o Random_Array.exe && ./Random_Array.exe

#include <iostream>
#include <random>
#include <vector>

void random_array(){
    std::random_device rd;
    std::mt19937 mt(rd());
    std::uniform_real_distribution<double> distrib(0.0, 1.0);
    
    std::vector<double> r_array = { };
    int size = 0;
    std::cout << "Please Enter the size of the array you want to generate: ";
    std::cin >> size;
    for (int i = 0; i < size; i++){
        r_array.push_back(distrib(mt));
    }
    for (auto j : r_array){
        std::cout<< j << " ";
    }
    std::cout<<std::endl;
//    std::cout << "Random value : " << mt() << std::endl;
}

int main(){
    random_array();
    return 0;
}
