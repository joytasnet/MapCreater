import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		System.out.print("幅>>");
		int width = new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		int height = new Scanner(System.in).nextInt();
		//幅と高さを入力してもらう

		int [][] map = new int [height][width];
		char [][] natures = {
			{'森'},
			{'草'},
			{'岩'},
			{'水'}
		};
		for(int i = 0; i<height; i++ ){
			for(int j = 0; j<width; j++){
				map[i][j] = new Random().nextInt(4);
				System.out.printf("%s",natures[map[i][j]][0]);
			}
			System.out.println();
		}



	}
}
