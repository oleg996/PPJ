public class test { public static void main(String[] args) {
    int[] a= {1,2,3,4,5};
    int buf = a[0];
    for (int i =0 ;i<4;i++){
        a[i] = a[i+1];

    }
    a[4]=buf;
    for (int i =0 ;i<=4;i++) {
        System.out.println(a[i]);
    }
}
}
