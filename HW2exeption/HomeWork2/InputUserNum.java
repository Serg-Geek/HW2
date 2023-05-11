package HomeWork2;
import java.util.*;
public class InputUserNum {

    public static float inputFloat(){

        Scanner scanner = new Scanner(System.in);
        float floatnum =  0.0f;
        boolean validInput= false;

        while (!validInput){
            System.out.println("Введите дробное число:  -->>");
            String input = scanner.nextLine();
            try{
                floatnum = Float.parseFloat(input);
                validInput = true;

            }catch (NumberFormatException e){
                System.out.println("Вы ввели не дробное число.");

            }

        }
        return floatnum;
    }

}
