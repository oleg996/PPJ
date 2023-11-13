import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
int wrt = input.nextInt();
boolean chyjestwA = wrt>=0;
boolean chyjestwB =  wrt <=1;
boolean chyjestwC =  wrt>=0 && wrt <=1;
System.out.println("The number "+wrt + (chyjestwA ? " is":" isnt")+" in A");
System.out.println("The number "+wrt + (chyjestwB ? " is":" isnt")+" in B");
System.out.println("The number "+wrt + (chyjestwC ? " is":" isnt")+" in C");
}


    

}

