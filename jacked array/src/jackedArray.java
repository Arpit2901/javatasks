import java.util.Scanner;

public class jackedArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [][] Arr= new int[2][3];
		int ar[]=new int[3];
		int br[]=new int[3];
		int j;
		System.out.print("enter");
		for(j=0;j<ar.length;j++) {
			ar[j]=sc.nextInt();
		}
//		System.out.print(ar[j]);
		for( j=0;j<ar.length;j++) {
			br[j]=sc.nextInt();
		}
		
		for(int i=0;i<Arr.length;i++) {
			for( j=0;j<ar.length;j++) {
				if(i==0)
				Arr[i][j]=ar[j];
				else
					Arr[i][j]=br[j];
			}
		}
		for(int i=0;i<Arr.length;i++) {
			for( j=0;j<ar.length;j++) {
		System.out.print(Arr[i][j]);
			
			}
			System.out.println();
		}

	}

}
