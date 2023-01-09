package JavaBasic.src.main.java.class_and_methods;

public class task_5 {
    public static void main(String[] args) {
        System.out.println(is2Digits(-32));
        System.out.println(is2Digits(516));
    }

    public static boolean is2Digits(int x) {

        return x >= 10 && x <= 99 || x <= -10 && x >= -99;

    }
}

/*
Классы и методы #5
Двузначное. Дана следующая сигнатура метода:
public static boolean is2Digits(int x);
Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно двузначное.
Пример 1:
x=32
результат: true
Пример 2:
x=516
результат: false
 */