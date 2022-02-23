package tania;
import java.util.Scanner;
public class Degrees {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ℃:");
            double name = scanner.nextDouble();

            System.out.println(name + "℃ = " + (name *9/5+32) + "℉");

        }
    }
