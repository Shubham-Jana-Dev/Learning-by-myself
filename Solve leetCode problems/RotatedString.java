//
// java RotatedString.java
//
//
//  Created by Shubham Jana on 19/07/26.
//

public class RotatedString{
    private String name;
    RotatedString(){
        this.name = name;
    }
    public boolean StringRotated(String MyString, String goal){
        for(int i = 0; i< MyString.length(); i++){
            MyString = MyString.substring(1) + MyString.charAt(0);
            System.out.println(MyString);
            if(MyString.equal(goal)){
                return true;
                
            }
        }
        return false;
    }
    public static void main(String[] args){
        RotatedString theString = new RotatedString();
        String thegoal = "hdawhw";
        String Myname = "dawhwh";
        boolean ee = theString.StringRotated(Myname, thegoal);
        System.out.println(ee);
    }
}
