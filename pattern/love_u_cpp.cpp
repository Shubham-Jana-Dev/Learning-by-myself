#include <iostream>
int main(){
for (int i = 0;i<6;i++){
    for(int j = 0; j<7;j++){
        if((j==0 | j%3==0 && i==0)|
        (j!=0 && j%3!=0 && i == 1)|
        (j != 0 && j != 6 && (i == 2))|
        (j != 1 && j != 5 && i == 3)|
        (j != 2 && j != 4 && i == 4)|
        (j != 3 && i == 5)){
            std::cout<<"  ";
        }
        else{
        std::cout<<"* ";
        }
    }
    std::cout<<std::endl;
}
    return 0;
}