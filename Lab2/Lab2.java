
public class Lab2 {
	public static void main(String[] args) {
	    short a = 2;
	    int S = 0;
		short [][] B = {{1,2,3,4},
	             {5,6,7,8},
	             {9,10,11,12}};
	    int k = B.length;
	    int q = B[0].length;
	    short [][] C = new short[k][q];
	    System.out.println("C:");
	     for (int i = 0; i < k; i++) {
	          for (int j = 0; j < q; j++) {
	              C[i][j]=(short) (B[i][j]*a);
	              System.out.print(C[i][j]+" ");
	              S = S+C[i][j];
	          }
	          System.out.println();
	     }
	    System.out.println();
	    System.out.println("Середнє значення елементів у C: "+(float)S/(k*q));
	}
}
