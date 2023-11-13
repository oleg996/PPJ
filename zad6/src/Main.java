import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter year");
        int year = s.nextInt();
        if (year>0) {
        boolean isleap = year%4 == 0 &&  year %100 !=0 ;
        boolean isleap2 = year % 400 ==0;
         System.out.println("The "+year+"year is " + (isleap || isleap2? "leap" :"isnt leap "));
        }
        else {
            System.out.println("year is not positive");

        }
    }
}