package uttam;

public class tictactoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ttt = new int[3][3];
		int counter = 0;
		for (int i = 0; i<ttt.length;i++){
			for (int j = 0; j<ttt[i].length;j++){
				if (counter == 4){
					ttt[i][j]=0;
					counter++;
					continue;
				}
				ttt[i][j]=counter++;
				
				//ttt[i][j]=(int)(Math.random()*2);
			}
		}
		System.out.println("ORIGINAL TIC TAC TOE\n");
		for (int i = 0; i<ttt.length;i++){
			for (int j = 0; j<ttt[i].length;j++){

				System.out.print(ttt[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("\nUpdated TIC TAC TOE\n");
		int[][] tttNew = updateTTT(ttt);
		for (int i = 0; i<ttt.length;i++){
			for (int j = 0; j<ttt[i].length;j++){

				System.out.print(tttNew[i][j]+"\t");
			}
			System.out.println();
		}
	}

	private static int[][] updateTTT(int[][] ttt) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i<ttt.length;i++){
			for (int j = 0; j<ttt[i].length;j++){
				if (ttt[i][j]==0){
					
					changeValuesTTT(ttt, i, j);
					
				}

			}
		}
		
		for (int i = 0; i<ttt.length;i++){
			for (int j = 0; j<ttt[i].length;j++){
				if (ttt[i][j]==-1){
					
					ttt[i][j]=0;
				}

			}
		}

		return ttt;
	}

	private static void changeValuesTTT(int[][] ttt, int i, int j) {
		// TODO Auto-generated method stub
		for (int k = 0; k<ttt[i].length;k++){
			ttt[i][k]=ttt[i][k]==0?0:-1;
			
			}
		

		for (int l = 0; l<ttt.length;l++){
			ttt[l][j]=ttt[l][j]==0?0:-1;
			
		}
	}
}

