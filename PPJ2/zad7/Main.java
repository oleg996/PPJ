
public class Main {
    public static void main(String[] args){
 int W = 48;
 int X =14;
 int Y = 16;
 int Z = 4;
 int sum = W+X+Y+Z;
 int a3 = 0xA3;
 int a = 0xA;
 if (sum > a){
   sum = 0;
    if ((W & 0b10000) > 0){
     System.out.println(W);
    }
   if ((X & 0b10000) > 0){
         System.out.println(X);
    }
      if ((Y & 0b10000) > 0){
     System.out.println(Y);
    }
   if ((Z & 0b10000) > 0){
     System.out.println(Y);
    }
 }
 else{
if ((W ^ a3) < 5 ){
    System.out.println(W);
    }
if ((X ^ a3) < 5 ){
     System.out.println(X);
    }
if ((Y ^ a3) <5 ){
     System.out.println(Y);
    }
if ((Z ^ a3) <5 ){
     System.out.println(Z);
    }


 }

    

}
}
