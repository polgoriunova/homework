public class Main {

    public static void main(String[] args) {



        Integer a [] = {9,4,7,2,6,11,80,43,27,9};
        Integer b [] = {45,38,22,23,24,5};

        System.out.println("Initial arrays:");
        printArray(a);
        printArray(b);
        

        Integer[] pari = createPari(a, b);
        System.out.println("Unsorted array pari:");
        printArray(pari);

        Integer[] dispari = createDispari(a,b);
        System.out.println("Unsorted array dispari:");
        printArray(dispari);

        System.out.println("Sorted array pari:");
        bubbleSort(pari);
        printArray(pari);

        System.out.println("Sorted array dispari:");
        bubbleSort(dispari);
        printArray(dispari);



    }

    public static int countPari(Integer[] arr){
        int p = 0;
        for(int i=0; i<arr.length;i++) {
            if(arr[i]%2==0) {
                p++;
            }
        }
        return p;

    }
    public static int countDispari(Integer[] arr){
        int d = 0;
        for(int i=0; i<arr.length;i++) {
            if(arr[i]%2!=0) {
                d++;
            }
        }
        return d;
    }
    public static Integer[] createPari(Integer[] x, Integer[] y){
        int n=0;

        Integer[] pari = new Integer[countPari(x)+countPari(y)];

        for(int i = 0; i<x.length;i++) {
            if(x[i]%2==0) {
                pari[n] = x[i];
                n++;
            }
        }

        for(int i = 0; i<y.length;i++) {
            if(y[i]%2==0) {
                pari[n] = y[i];
                n++;
            }
        }
        return pari;
    }
    public static Integer[] createDispari(Integer[] x, Integer[] y){
        int n=0;

        Integer[] dispari = new Integer[countDispari(x)+countDispari(y)];

        for(int i = 0; i<x.length;i++) {
            if(x[i]%2!=0) {
                dispari[n] = x[i];
                n++;
            }
        }

        for(int i = 0; i<y.length;i++) {
            if(y[i]%2!=0) {
                dispari[n] = y[i];
                n++;
            }
        }
        return dispari;
    }
    public static void printArray(Integer [] arr){
        for(int i=0; i<arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(Integer [] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1]=temp;
                }
            }
        }

    }
}
