import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		System.out.print("幅>>");
		int width = new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		int height = new Scanner(System.in).nextInt();
		//幅と高さを入力してもらう

		char [][]natures = {
			{'森'},
			{'草'},
			{'岩'},
			{'水'}
		};
		for(int i = 0; i<height; i++ ){
			for(int j = 0; j<width; j++){
				int r = new Random().nextInt(4);
				System.out.printf("%s",natures[r][0]);
			}
			System.out.println();
		}



	}
}
