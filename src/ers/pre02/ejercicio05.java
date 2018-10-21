package ers.pre02;
import java.util.Scanner;

public class ejercicio05
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);  
        int contador = 1;
        int[] array;
        array = new int[5];
        while(contador <= 5)
        {
        System.out.println("Introduzca el "+contador+"º numero");
        int[] array = keyboard.nextIn(5);
        contador ++;
        }
        System.out.println(array);
        double media = numero1/5;
        System.out.println(media);
    }
}