import java.util.*;
public class NaganoMain{
	public static void main(String[] args){
		System.out.print("幅>");
		int w = new Scanner(System.in).nextInt();
		System.out.print("高さ>");
		int h = new Scanner(System.in).nextInt();
		char[][] maps = new char[h][w];
		char[] maps2 ={'森','草','岩','水'};
		for(int i = 0;i<maps.length;i++){
			for(int j =0;j<maps[i].length;j++){
				int r =new Random().nextInt(maps2.length);
				maps[i][j]=maps2[r];
				System.out.print(maps[i][j]);
			}
			System.out.println();
		}
	}
}
