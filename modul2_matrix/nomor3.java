package modul2_matrix;
public class nomor3 {
     public static void main(String[] args) {
        int [][] A = {
            {11,12},
            {13,14}
           
        };
        int [][] B = {
            {15,16},
            {17,18}
            
        };
        int baris_a = A.length;
        int kolom_a = A[0].length;
        int baris_b = B.length;
        int kolom_b = B[0].length;
        int Hasil [][] = new int [baris_a][kolom_b];
        
        for(int i=0; i<A.length; i++){
           for(int j=0; j<kolom_b; j++){
               for(int k=0; k<kolom_a; k++){
                   Hasil [i][j] = Hasil[i][j] + (A[i][k] * B[k][j]) ;
                   
               }
           }
            
        }
        for(int[] x : Hasil){
            for(int X : x){
                System.out.print(X+" ");
            }
            System.out.println();
        }
    }
    
}
//MAULANA_IBNU_FAJAR_20090092_2A
