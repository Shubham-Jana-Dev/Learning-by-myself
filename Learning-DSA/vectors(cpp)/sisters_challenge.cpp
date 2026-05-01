/*
​"How about this? Since we're stuck here watching the rain, let’s do a Weighted Average Grade Calculator.
​Imagine you have two vectors:
​One for your Assignment Scores (out of 100).
​One for the Weightage of each assignment (like 0.2 for 20%, 0.3 for 30%, etc.).
​The Challenge:
​Write a program that takes these two vectors, multiplies the score by its weight, and calculates your final 'Cumulative Grade.'
​Bonus Points: If the final grade is below 80, the program should print: 'System Error: Needs more chocolate for brain power.'
​If it's above 90, it prints: 'Princess Approved: Commander is a genius.'"
*/
#include <iostream>
#include <vector>
int main(){
std::vector<float> Assignment_scores;
std::vector<float> Assignment_Weightage;
std::vector<std::string> Assignment_sub;
Assignment_sub.push_back("Mathematics");
Assignment_scores.push_back(80);
Assignment_Weightage.push_back(0.4);
Assignment_sub.push_back("AI & ML");
Assignment_scores.push_back(70);
Assignment_Weightage.push_back(0.6);
Assignment_sub.push_back("COA");
Assignment_scores.push_back(89);
Assignment_Weightage.push_back(0.3);
Assignment_sub.push_back("DSA");
Assignment_scores.push_back(80);
Assignment_Weightage.push_back(0.9);
int num = Assignment_scores.size();
float cc = 0;
float t_cc = 0;
for (int i = 0; i<num; i++){
    cc = (Assignment_scores[i] * Assignment_Weightage[i]);
    t_cc += cc; 
    std::cout<<"Final score of: " << Assignment_sub[i] << ", is "<< cc << std::endl;
}
std::cout<<"The total score of all subjects is "<<t_cc<<std::endl;
if(t_cc>90){
    std::cout<<"Princess Approved: Commander is a genius."<<std::endl;
}
else if(t_cc>80){
    std::cout<<"Good"<<std::endl;
}
else{
    std::cout<<"System Error: Needs more chocolate for brain power."<<std::endl;
}


    return 0;
}