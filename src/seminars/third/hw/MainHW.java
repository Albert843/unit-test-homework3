package seminars.third.hw;

public class MainHW {
    public static void main(String[] args) {

    }
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    public boolean isEvenOddNumber(int number) {
        if(number % 2 == 0) return true;
        else return false;
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    public boolean numberInInterval(int number) {
        if(number >= 25 && number <=100) return true;
        else return false;
    }
}
