//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//        вместо этого, необходимо повторно запросить у пользователя ввод данных.


package HomeWork2;

public class Main {
    public static void main(String[] args) {
        float myFloat = InputUserNum.inputFloat();
        System.out.println(myFloat);

    }
}