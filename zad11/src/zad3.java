public class zad3 {
     public static void main(String[] args) {
         int[] A = new int[4];
         for (int i = 0; i < A.length;i++){
             A[i]=i-3;

         }
         System.out.println('A');
         printar(A);

         int[] B = new int[10];
         for (int i = B.length-1; i > 0;i--){
             B[i]=i+3;

         }
         System.out.println('B');
         printar(B);

         int C[] = new int[A.length + B.length];
         for (int i = 0; i < A.length;i++){
             C[i] = A[i];

         }
         for (int i = 0; i <B.length;i++){
             C[i+A.length] = B[i];

         }
         System.out.println('C');
         printar(C);
         System.out.println("Sorted C");
         printar(sort(C));
    }
    public static void printar(int[] ar){
        System.out.print("[ ");
        for (int i = 0;i< ar.length;i++){
            System.out.print(ar[i]+" ");

        }
        System.out.println("]");

    }
    public static int[] sort(int[]ar){
         boolean sorted =false;
        while (!sorted){
            sorted =false;
            for (int j = 0;j< ar.length-1;j++){
            if (ar[j]>ar[j+1]){
                int tmp = ar[j+1];
                ar[j+1] = ar[j];
                ar[j] =tmp;
                sorted =true;
            }

            }

        }
         return ar;
    }
}
