import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите два числа: ");

        float a = scanner.nextFloat();

        float b = scanner.nextFloat();


// Сравнение чисел

        if(a>b){

            System.out.println("Первое число больше");

        }else if (b>a){

            System.out.println("Второе число больше");

        }else {

            System.out.println("Числа равны");

        }




// Сложение

        float sum = a+b;

        System.out.println("Сложение: " +sum);



// Вычитание

        float sub = a-b;

        System.out.println("Вычитание: " +sub);


// Деление

        float div = a/b;
        System.out.println("Деление: " +div);

// Умножение

        float mul =a*b;

        System.out.println("Умножение: " +mul);



    }
}