public class ArrayPariDispari {

    public static void main(String[] args) {



        Integer a [] = {9,4,7,2,6,11};     //4, 2, 6, 38, 22, 24
        Integer b [] = {45,38,22,23,24,5}; // 9, 7,11, 45, 23, 5

        //count pari dispari a
        int p = 0;
        int d = 0;
        for(int i=0; i<a.length;i++) {
            if(a[i]%2==0) {
                p++;
            } else {
                d++;
            }
        }
        //count pari dispari b
        for(int i=0; i<b.length;i++) {
            if(b[i]%2==0) {
                p++;
            } else {
                d++;
            }
        }
        //System.out.println(p + " " + d);

        //create pari[], dispari[]

        int [] pari = new int[p];
        int [] dispari = new int[d];
        int n=0;
        int f=0;
        //put pari, dispari from a[] and b[] to pari[] and dispari[]

        for(int i = 0; i<a.length;i++) {
            if(a[i]%2==0) {          // 4%2 ==0
                pari[n] = a[i];      // pari[6] = 4
                n++;
            } else {
                dispari[f] = a[i];  // dispari[6] = 9, 7
                f++;
            }
        }

        for(int i = 0; i<b.length;i++) {
            if(b[i]%2==0) {
                pari[n] = b[i];
                n++;
            } else {
                dispari[f] = b[i];
                f++;
            }
        }
//        for(int i=0; i<p; i++) {
//            System.out.println(pari[i]);
//        }
//        for(int i=0; i<d; i++) {
//            System.out.println(dispari[i]);
//        }

        // sort pari[p] and dispari[d]


        for(int i=0; i<pari.length-1; i++){
            for(int j=0; j<pari.length-i-1; j++){
               if(pari[j]>pari[j+1]) {
                   int temp = pari[j];
                   pari[j] = pari[j + 1];
                   pari[j+1]=temp;
               }
            }
        }
        for(int i=0; i<pari.length; i++){
            System.out.print(pari[i] + " ");
        }
        System.out.println();
        
        for(int i=0; i<dispari.length-1; i++){
            for(int j=0; j<dispari.length-i-1; j++){
                if(dispari[j]>dispari[j+1]) {
                    int temp = dispari[j];
                    dispari[j] = dispari[j + 1];
                    dispari[j+1]=temp;
                }
            }
        }
        for(int i=0; i<dispari.length; i++){
            System.out.print(dispari[i] + " ");
        }


    }
}
