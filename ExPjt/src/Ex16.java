
public class Ex16 {
	public static void main(String[] args) {
		int x[][] = { { 3,2,3 } , { 5,9,8 } };
		int y[][] = { { 4, 7 }, { 9, 3 }, { 8, 1 } };
		int z[][] = Matrix.multiply(x, y);
		Matrix.print(z);
	}
}
class Matrix {
	public static int[][] multiply(int[][] m1, int[][] m2) {
		int m1Rows = m1.length;
		int m1Cols = m1[0].length;
		int m2Rows = m2.length;
		int m2Cols = m2[0].length;
		
		if(m1Cols != m2Rows) {
			throw new IllegalArgumentException();
		}
		
		int[][] result = new int[m1Rows][m2Cols];
		
		for(int i=0;i<m1Rows;i++) {
			for(int j=0;j<m2Cols;j++) {
				for(int k=0;k<m1Cols;k++) {
					result[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		return result;
	}
	
	public static void print(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;
		for (int i=0;i<rows;i++) {
			System.out.print("{");
			for (int j=0;j<cols;j++) {
				System.out.print(a[i][j] + ",");
			}
			System.out.println("}");
		}
	}
}