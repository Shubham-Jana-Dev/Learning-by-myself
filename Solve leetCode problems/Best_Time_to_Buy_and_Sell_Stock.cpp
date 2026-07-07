//
// g++ -std=c++17 Best_Time_to_Buy_and_Sell_Stock.cpp -o Best_Time_to_Buy_and_Sell_Stock.exe && ./Best_Time_to_Buy_and_Sell_Stock
//
//
//  Created by Shubham Jana on 07/07/26.
//

#include <iostream>
#include <vector>

class Maximum_profit{
public:
    int maxP(const std::vector<int>& prices){
        int min_price = INT_MAX;
        int max_profit = 0;
            for(int i : prices){
            if(i<min_price){
                min_price = i;
            }
            int currentprofit = i - min_price;
            if(currentprofit > max_profit){
                max_profit = currentprofit;
            }
        }
        return max_profit;
    }
};
int main(){
    std::vector <int> MyArray = {7,1,5,3,6,4};
Maximum_profit mp1;
  int  My_profit = mp1.maxP(MyArray);
    std::cout << "The total profit of the data set is: " << My_profit << std::endl;
    return 0;
}

