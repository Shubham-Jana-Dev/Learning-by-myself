//
// g++ -std=c++20 Douplicat_find.cpp -o Douplicat_find.exe && ./Douplicat_find.exe
//
//
//  Created by Shubham Jana on 07/07/26.
//

#include <iostream>
#include <vector>
#include <unordered_set>
class find_duplicate{
public:
    bool find_dup(const std::vector<int>& theArray){
        std::unordered_set<int> hashSet = { };
        bool duplicate = false;
        for(int i : theArray){
            if(hashSet.contains(i)){
                duplicate = true;
                break;
            }else{
                hashSet.insert(i);
            }
        }
        return duplicate;
    }
};
int main(){
    std::vector<int> MyArray = {12,33,44,127,35,86};
    find_duplicate d1;
    bool tt = d1.find_dup(MyArray);
    if(tt){
        std::cout << "Duplicate is present in the Array." << std::endl;
    }
    else{
        std::cout << "Duplicate is not present in the Array.";
    }
    return 0;
}
