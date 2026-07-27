class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> myList = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            if(i%5 == 0 && i%3 == 0){
                myList.add(i-1,"FizzBuzz");
            }else if(i%5==0){
                myList.add(i-1,"Buzz");
            }else if(i%3 == 0){
                myList.add(i-1,"Fizz");
            }else{
                myList.add(i-1,String.valueOf(i));
            }
        }
        return myList;
    }
}