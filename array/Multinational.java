package array;

public class Multinational {

	public static void main(String[] args) {
		int r[][]=new int[2][2];
		r[0][0]=1;// any no can be assign.
		r[0][1]=2;
		r[1][0]=3;
		r[1][1]=4;
			System.out.print(r[0][0]+" ");	
			System.out.println(r[0][1]);	
			System.out.print(r[1][0]+" ");	
			System.out.println(r[1][1]);	

			for(int c=0;c<=r.length-1;c++) {
				for(int d=0;d<=r.length-1;d++) {
					System.out.print(r[c][d]+" ");
				}
				System.out.println();
			}
	}

}
