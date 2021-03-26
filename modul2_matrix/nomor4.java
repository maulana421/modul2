package modul2_matrix;
public class nomor4 {
    public static void main(String[] args) {
        int [][] A = {
            {2,1,-5},
            {3,4,2}
        };
        int tranpose [][] = new int[3][2];
        for (int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                tranpose[j][i]= A[i][j];
            }
        }
        
        for (int i=0; i<A[0].length; i++){
            for (int j=0; j<A.length; j++){
                System.out.print(tranpose[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
//MAULANA_IBNU_FAJAR_20090092_2A
