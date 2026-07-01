#include <iostream>
using namespace std;
int main(){
    // cout << "\a" << "\a" << flush;
    for (int i = 0; i<10;i++){
    system("osascript -e 'beep'");
    }
    return 0;
}