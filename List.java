import java.util.Arrays;
import java.util.Scanner;
class List{
    public static void main(String[] args)
{
        int[] d = {25, 26, 27, 28, 29, 30};
        System.out.println("Before the List change ");
        for (int i= 0; i< d.length; i++){
            System.out.print(d[i] +" ");
        }
        System.out.println("\nEnter the index to change");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println("Enetr the  value");
        int val = sc.nextInt();
        d[index]= val;

        System.out.println("Array value after change");
        for (int i = 0; i<d.length; i++)
        {
            System.out.print(d[i]+" ");
        }
        
    }
}