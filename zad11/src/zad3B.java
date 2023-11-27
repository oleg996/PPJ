public class zad3B {
     public static void main(String[] args) {
         int[] A = {-6,-1,0,1};
         System.out.println('A');
         printar(A);

         int[] B = {15,6,3,-4,-5};

         System.out.println('B');
         printar(B);

         int C[] = new int[A.length + B.length];
         int indexa =0;
         int indexb = B.length-1;
         for (int i = 0; i < C.length;i++) {
             if (indexa != A.length && indexb != 0) {
                 if (A[indexa] < B[indexb]) {
                     C[i] = A[indexa];
                     indexa++;
                 } else {
                     C[i] = B[indexb];
                     indexb--;
                 }

             }

         }
         printar(C);
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
