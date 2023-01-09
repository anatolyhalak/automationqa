package JavaBasic.src.main.java.class_and_methods;

public class task_6 {
    public static void main(String[] args) {

        System.out.println(isUpperCase('b'));
    }

    public static boolean isUpperCase(char x) {

        return x >= 'A' && x <= 'Z';

    }
}

/*
Классы и методы #6
Большая буква. Дана следующая сигнатура метода:
public static boolean isUpperCase(char x);
Необходимо реализовать метод таким образом, чтобы он принимал символ x и возвращал true если это большая буква в диапазоне от ‘A’ до ‘Z’.
Пример 1:
x=’D’
результат: true
Пример 2:
x=’q’
результат: false
 */