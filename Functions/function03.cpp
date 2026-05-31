#include <iostream>
double convertToCelsius(double fahrenheit){
double Celsius = (fahrenheit - 32) * (0.5555556); 
return Celsius;
}

int main(){
double temp;
std::cout << "Please enter the tempture in fahrenheit (°F) here: ";
std::cin >> temp;
double c = convertToCelsius(temp);
std::cout<<"\n"<< temp <<" °F = " << c << " °C"<<std::endl;
    return 0;
}