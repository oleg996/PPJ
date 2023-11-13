
public class Main {
    public static void main(String[] args){
int wrt = -5;
boolean chyjestwA = (wrt >-15 && wrt <-10) ||(wrt >-5 && wrt < 0) || (wrt > 5 && wrt < 10)  ;
boolean chyjestwB =  wrt <-13 || wrt >-8 && wrt <= -3 ;
boolean chyjestwC =  wrt >= -4;
boolean jestwABC = chyjestwA && chyjestwB && chyjestwC;
System.out.println(jestwABC);

}



    

}

