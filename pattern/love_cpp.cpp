#include <iostream>

int main() {
    // 6 rows (i), 7 columns (j)
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 7; j++) {
            
            // Row 0: The two top humps of the heart
            if (i == 0) {
                if (j == 1 || j == 2 || j == 4 || j == 5) std::cout << "* ";
                else std::cout << "  ";
            }
            // Row 1: The widest part of the heart
            else if (i == 1) {
                std::cout << "* "; // Completely filled row
            }
            // Row 2: Slanted sides starting to narrow down
            else if (i == 2) {
                if (j >= 0 && j <= 6) std::cout << "* ";
            }
            // Row 3: Getting narrower
            else if (i == 3) {
                if (j >= 1 && j <= 5) std::cout << "* ";
                else std::cout << "  ";
            }
            // Row 4: Narrower still
            else if (i == 4) {
                if (j >= 2 && j <= 4) std::cout << "* ";
                else std::cout << "  ";
            }
            // Row 5: The bottom center point
            else if (i == 5) {
                if (j == 3) std::cout << "* ";
                else std::cout << "  ";
            }
        }
        std::cout << std::endl; // Move to the next line
    }
    return 0;
}