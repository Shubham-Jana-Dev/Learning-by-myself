//
// g++ -std=c++17  MedianOfTwoSortedArray.cpp -o MedianOfTwoSortedArray.exe && ./MedianOfTwoSortedArray.exe
//
//
//  Created by Shubham Jana on 14/07/26.
//
#include <iostream>
#incldue <vector>
using namspace std;
class MedianOfTwoSortedArray {
public:
    vector<int> findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        bool flag = false;
        double median = 0.00;
        if(nums1.size() > nums2.size()){
            flag = true;
        }
        if(flag){
            int start = 0;
            int j = 0;
            
            int end = nums1.size() - 1;
            while(start<end){
                int end = nums1.size() - 1;
                if(nums2[j] >= nums1[start] && nums2[j] < nums1[end]){
                    nums1.insert(nums1.begin() + start+1,nums2[j]);
                }else if(nums2[j] < nums1[start]){
                    nums1.insert(nums1.begin() - start,nums2[j]);
                }else{
                        nums1.push_back(nums2[j]);
                    }
                    start++;
            }
            if(nums1.size()%2 != 0){
                median = nums1[nums1.size()/2];
            }else{
                median = ((nums1[(nums1.size()-1)/2])+((nums1[(nums1.size()-1)/2])+1))/2.0;
            }
        }else{
            int start = 0;
            int j = 0;
            
            int end = nums2.size() - 1;
            while(start<end){
                int end = nums2.size() - 1;
                if(nums1[j] >= nums2[start] && nums1[j] < nums2[end]){
                    nums2.insert(nums2.begin() + start+1,nums1[j]);
                }else if(nums1[j] < nums2[start]){
                    nums2.insert(nums2.begin() - start,nums1[j]);
                }else{
                        nums2.push_back(nums1[j]);
                    }
                    start++;
            }
            if(nums2.size()%2 != 0){
                median = nums2[nums2.size()/2];
            }else{
                median = ((nums2[(nums2.size()-1)/2])+((nums2[(nums2.size()-1)/2])+1))/2.0;
            }
        }
        return nums1;
    }
};
int main(){
    vector<int> a = {1,2};
    vector<int> b = {3,4};
MedianOfTwoSortedArray s1;
vector<int> result = s1.findMedianSortedArrays(a,b);
for(int j : result){
cout<<j << " ";
}
return 0;
}
