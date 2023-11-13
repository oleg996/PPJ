import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name");
        String Name = input.nextLine();
        System.out.println("Enter age");
        int age = input.nextInt();
        System.out.println(age >= 18 ? "You are old" : "You are a child");
        String st = input.nextLine();
        System.out.println("Are you a man? Y/N");
        st = input.next();
        String sta = "";
        if (st.equals("Y")){
            sta = "man";
        }else if (st.equals("N")){
            sta = "Woman";
        }else {
            sta = "human"; 
        }
         System.out.println("You are "+Name+" a "+sta+" and a "+age+" years old");


    }
}
