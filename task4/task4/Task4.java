package task4;//Разработайте программу, которая выбросит Exception,
//        когда пользователь вводит пустую строку. Пользователю должно показаться сообщение,
//        что пустые строки вводить нельзя.
import java.util.*;



public class Task4 {

    public class InputUserNum {

        public static float inputFloat() throws Exception {

            Scanner scanner = new Scanner(System.in);
            float floatnum =  0.0f;
            boolean validInput= false;

            while (!validInput){
                System.out.println("Введите дробное число:  -->>");
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя.");
                }
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
}
