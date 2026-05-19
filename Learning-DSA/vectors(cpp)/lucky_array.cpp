#include <iostream>
#include <vector>

bool isLuckyArray(const std::vector<int>& arr) {
    // Your low-effort, elegant logic goes here!
    return false;
}

int main() {
    std::vector<int> test1 = {2, 4, 2};
    std::vector<int> test2 = {1, 2, 3};
    
    std::cout << std::boolalpha;
    std::cout << "Test 1 (Expected: true): " << isLuckyArray(test1) << "\n";
    std::cout << "Test 2 (Expected: false): " << isLuckyArray(test2) << "\n";
    
    return 0;
}