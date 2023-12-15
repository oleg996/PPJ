public class zad4 {
    public static void main(String[] args) {
        int[] tab = {0,1,2,3,4,5,6,7};
        System.out.println(binserch(tab,4,1));

    }
    public  static int binserch(int arr [] , int pos ,int a){
        if (arr[pos] == a) return a;
        if (arr[pos] > a) {
            return  binserch(arr,pos/2,a);
        }else {
            return  binserch(arr,pos + pos/2,a);
        }


    }
}
