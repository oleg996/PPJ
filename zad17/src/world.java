public class world{
    private char[] leters = new char[100];
    private int alocated = 0;
     boolean addChar(char a){
        if (alocated <=100){
            leters[alocated] = a;
            alocated++;
            return true;}
        else return false;
    }
      int lenght() {return alocated;}

     void show(){
        for (int i = 0; i < alocated; i++) {
            System.out.println(leters[i]+"");
        }

    }


}