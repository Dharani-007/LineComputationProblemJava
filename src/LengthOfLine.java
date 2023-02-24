import java.util.Scanner;
import java.lang.Math;


public class LengthOfLine {
    public static void length() {
        System.out.println("Enter the x1 co-ordinate");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.println(x1);
        System.out.println("Enter the x2 co-ordinate");
        Scanner sc1 = new Scanner(System.in);
        int x2 = sc1.nextInt();
        System.out.println(x2);
        System.out.println("Enter the y1 co-ordinate");
        Scanner sc2 = new Scanner(System.in);
        int y1 = sc2.nextInt();
        System.out.println(y1);
        System.out.println("Enter the y2 co-ordinate");
        Scanner sc3 = new Scanner(System.in);
        int y2 = sc3.nextInt();
        System.out.println(y2);
        double LengthOfLine = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(LengthOfLine);
        if(x1==x2 && y1==y2){
            System.out.println("Length of two line are same");

        }

    }

    public static void main(String[] args) {

        length();
    }
}