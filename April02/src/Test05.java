
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] aa = new int [3][3];
		aa[1][2] = 100;
		//二维数组
		for(int i = 0 ; i < aa.length ; i ++) {
			for(int j = 0 ; j <aa[i].length; j ++ ) {
				aa[i][j] = (int)Math.floor(Math.random() * 100) ;
			}
		}
		for(int i = 0 ; i < aa.length; i ++) {
			for(int j = 0 ; j < aa[i].length; j ++) {
				System.out.print(aa[i][j] + " ");
			}
			System.out.println();
		}
		
		//三维数组
		int[][][] aaa = new int [3][3][3];
		for(int i = 0 ; i < aaa.length ; i ++) {
			for(int j = 0 ; j <aaa[i].length; j ++ ) {
				for(int k = 0 ; k < aaa[i][j].length; k++) {
					aaa[i][j][k] = (int)Math.floor(Math.random() * (999-100+1)) +100 ;
				}	
			}
		}
		for(int i = 0 ; i < aaa.length; i ++) {
			for(int j = 0 ; j < aaa[i].length; j ++) {
				for(int k = 0 ; k < aaa[i][j].length; k++) {
					System.out.print(aaa[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
