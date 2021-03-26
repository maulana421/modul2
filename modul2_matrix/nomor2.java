package modul2_matrix;
public class nomor2 {
    public static void main(String[] args) {
        int[][] X = {
        {1,2},
        {3,4},
        {5,6}
    };
    int[][] Y = {
        {11,12},
        {13,14},
        {15,16}
    };
    int baris_x = X.length;
    int kolom_x = X[0].length;
    int[][] Hasil = new int [baris_x][kolom_x];
    
    for(int i=0; i<baris_x; i++){
       for(int j=0; j<kolom_x; j++) {
           Hasil [i][j] = Y[i][j] - X[i][j];
           System.out.print(Hasil[i][j]+" ");
       }
        System.out.println();
         
        }
    
}}
//MAULANA_IBNU_FAJAR_20090092_2A
