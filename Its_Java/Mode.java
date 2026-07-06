// javac Mode.java && java Mode.java

public class Mode{
    public static int mode(int[] MyArray){
        int maxCount = 0;
        int modeValue = 0;
        for(int i : MyArray){
            int currentCount = 0;
            for(int j : MyArray){
                if(j == i){
                    currentCount++;
                    }
                }
            if(currentCount > maxCount){
                maxCount = currentCount;
                modeValue = i;
            }
        }
        return modeValue;
    }
    public static void main(String[] args){
        int[] TheArray = {12,22,34,22,45,66,55,76,66,35,22,56};
        int mo = mode(TheArray);
    System.out.println("The mode of the Array is: " + mo);
    }
}
