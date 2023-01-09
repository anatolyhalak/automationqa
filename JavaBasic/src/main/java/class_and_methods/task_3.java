package JavaBasic.src.main.java.class_and_methods;

public class task_3 {
    public static void main(String[] args) {

        System.out.println(charToNum('3'));
    }

    public static int charToNum(char c) {

        return c - '0';

    }
}

/*
Классы и методы #3
Букву в число. Дана следующая сигнатура метода:
public static int charToNum(char x);
Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 8 9”.
Необходимо реализовать метод таким образом, чтобы он преобразовывал символ в соответствующее число.
Подсказка: код символа ‘0’ — это число 48.
Пример:
x=’3’
результат: 3
 */