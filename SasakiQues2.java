import java.util.*;
public class SasakiQues2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//空き盤面用意
		String[][] game = new String[3][3];
		for(int i=0;i<game.length;i++){
			for(int j=0;j<game[i].length;j++){
				game[i][j] = "□";
				System.out.print(game[i][j]);
			}
			System.out.println();
		}
		int turnCount = 1;
		System.out.println("空いてる箇所(□)に先行は〇,後攻は×を入れて盤面を全部埋めてください");
		System.out.println();
		//ゲーム？開始
		while(true){
			//終了判定
			if(turnCount > 9){
				System.out.println("全部埋まりました！");
				break;
			}
			//先行後攻表示
			if(turnCount % 2 == 0){
				System.out.print("後攻の人、");
			}else{
				System.out.print("先行の人、");
			}
			//埋める場所指定
			System.out.println("入れる場所を選んでください");
			System.out.print("上から何番目か>>");
			int u = scan.nextInt()-1;
			System.out.print("左から何番目か>>");
			int y = scan.nextInt()-1;
			if(game[u][y] == "□"){
				if(turnCount % 2 ==0){
					game[u][y] = "×";
					turnCount++;
				}else{
					game[u][y] = "○";
					turnCount++;
				}
			}else{
				System.out.println("そこは既に埋まっています");
				System.out.println("埋める場所を選びなおしてください");
			}
			//現在の盤面表示
			for(int i=0;i<game.length;i++){
				for(int j=0;j<game[i].length;j++){
					System.out.print(game[i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
