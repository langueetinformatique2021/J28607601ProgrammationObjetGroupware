package atelier2;

public class TestAB {
	
	public static void main(String[] args) {
		int i = 1;
		int m = 60;
		
		int j;
		for (j=0; j < m; j++ ){
			System.out.println(j + "" + i);
			i = B.divise(i);
		}
	}
}
