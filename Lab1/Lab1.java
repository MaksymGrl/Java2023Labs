
public class Lab1 {
	public static void main(String[] args) {
		int n=4, m=4, a=3,b=2;
	    final int c=0;
		double S=0;
		
		for (int  i = a; i <= n; i++) { 
			for (int j = b; j <= m; j++) { 
					if(i - c == 0){
					    System.out.println("Знаменник не може дорівнювати нулю");
					    return;
					}
			        else{
					    S += (double) (i * j) / (i - c); 
			        }
				}
			}

		
		System.out.println("S= " + S);
	}
}
