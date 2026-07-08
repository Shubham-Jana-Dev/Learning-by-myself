//
// g++ -std=c++17 mode.cpp -o mode.exe && ./mode.exe
//
//
//  Created by Shubham Jana on 06/07/26.
//

#include <iostream>
#include <vector>
class mode_calculation{
public:
    int findMode(const std::vector <int>& theArray){
        int maxCount = 0;
        int modeValue = 0;
        for (int i : theArray){
            int currentCount = 0;
            for(int j : theArray){
                if(i == j){
                    currentCount++;
                }
            }
            if(currentCount > maxCount){
                maxCount = currentCount;
                modeValue = i;
            }
        }
        return modeValue;
    }
};
int main(){
    std::vector<int> MyArray = {23,334,56,76,87,76,22,76,44,87,76,33,44,33,44,33,76,33,90,33,78,33,70,12};
    mode_calculation mm;
    int mod = mm.findMode(MyArray);
    std::cout << "The mode of the Array is " << mod << std::endl;
    return 0;
}
