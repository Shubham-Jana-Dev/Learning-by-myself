#include<iostream>
using namespace std;
int FactorialCalculation(int num){
    if (num == 0 or num == 1){
        return 1;
    }
    else{
        return num*FactorialCalculation(num-1);
    }
}
int SumasionCalculation(int num){
    if(num<=0){
        return 0;
    }
    else{
        return num+SumasionCalculation(num - 1);
    }
}
int main(){
    int num;
    cout<<"Enter the number here : ";
    cin >> num;
    cout <<"\n";
    int t = FactorialCalculation(num);
    //cout <<"The factorial of "<<num<<" is "<<t<<"."<< endl;
    int sum = SumasionCalculation(num);
    cout << "The Sumation of "<<num<<" is "<<sum<<"."<<endl;
    
    return 0;
}