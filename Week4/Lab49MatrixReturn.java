import java.util.Scanner;
public class Lab49MatrixReturn {
    static Scanner scan = new Scanner(System.in);
    public static int[][] readMatrix(int rows, int cols){
        int[][] matrix = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++ ){
            for(int j = 0 ; j < cols ; j++ ){
                System.out.printf("Enter element[%d,%d]: ",i+1,j+1);
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }
    public static void showMatrix (int[][] A,int rows,int numCols){
        for(int i = 0 ; i< rows;i++){
            for(int j = 0; j< numCols;j++){
                System.out.printf("%5d",A[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int numRows, numCols;
        int[][] A;
        System.out.print("How many rows : ");
        numRows = scan.nextInt();
        System.out.print("How many columns : ");
        numCols = scan.nextInt();
        A = readMatrix(numRows,numCols);
        System.out.println("Matrix A is");
        showMatrix(A,numRows,numCols);
    }
}
