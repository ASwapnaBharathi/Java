import java.io.*;
import java.util.Scanner;
public class Eof{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        for(int i=1;scan.hasNext()== true;i++){
            System.out.println(i + " " +scan.nextLine());
        }
    }
}
