
public class Main {
        public static void main(String[] args) {
            int ar[] = {153,333,370,515,407,80,150};
            for (int i = 0;i<ar.length;i++) {
                System.out.print("the "+ar[i]+" ");
                System.out.println((CheckifArmstrong(ar[i])?"is":"isnt")+" Armstrong number");
            }
    }
public static boolean CheckifArmstrong(int inum){
            int temp = inum;
            int lenght = 0;
            while (temp!= 0){
                temp /=10;
                lenght++;

            }
            int num = inum;
           int arm = 0;
    while (num!= 0){

        arm += Math.pow(num%10,lenght);
        num /=10;
    }


   return(arm == inum);


}
}