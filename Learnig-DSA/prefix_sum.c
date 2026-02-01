#include<stdio.h>
void calculateSqure (int number){
    int squre = number*number;
    printf("\nthe squre of %d is %d\n",number,squre);
}
int main(){
int arr[] = {1,2,3,4,5};
int n = sizeof(arr)/sizeof(arr[0]);
int count = 0;
int i = 0 ;
int arr1[n];
while (i < n)
{
    count += arr[i];
    printf("\n%d",count);
    arr1[i] = count;
    i++;
}
printf("\nlength: %d\n",n);
printf("[");
for(int j=0; j<n;j++){
    if(j<n-1){
        printf(" %d,",arr1[j]);
    }
    else{
        printf(" %d",arr1[j]);
    }
}
printf("]");
calculateSqure(6);
    return 0;
}