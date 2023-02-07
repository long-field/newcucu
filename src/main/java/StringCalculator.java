import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    public static void main(String[] args) {

        String str ="";
      /*  if(str.contains("-")){
            throw new IllegalArgumentException("No negativenumbersallowed");
        }*/

        int result=0;
        String tempNumber = "";
      /*  Boolean previousNoDigit = false;*/
        for (int i=0; i<str.length(); i++) {
            String a = String.valueOf(str.charAt(i));
            if (previousNoDigit==false){

                if (Character.isDigit(str.charAt(i))){
                tempNumber = tempNumber + a;
                    previousNoDigit=false;
                }
                else{
                    previousNoDigit=true;
                    int entry= Integer.parseInt(tempNumber);
                    result+=entry;
                    tempNumber="";
                }
            }
            else{
                if (Character.isDigit(str.charAt(i))){
                    tempNumber = tempNumber + a;
                    previousNoDigit=false;
                }
                else{
                    previousNoDigit=true;
                }
            }

        }
        System.out.print(result);
    }

}

