import java.util.*;
public class NagatsuMain{
	public static void main(String[] args){
		System.out.print("幅>>");
		int w = new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		int h = new Scanner(System.in).nextInt();
		int[][] maps = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				maps[i][j]=new Random().nextInt(4);
				switch(maps[i][j]){
					case 0:
						System.out.print("森");
						break;
					case 1:
						System.out.print("草");
						break;
					case 2:
						System.out.print("岩");
						break;
					case 3:
						System.out.print("水");
						break;
				}
			}
			System.out.println();
		}
	}
}
