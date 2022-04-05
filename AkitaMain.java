import java.util.*;
public class AkitaMain{
	public static void main(String[] args){
		char[] words = {'森','草','岩','水'};
		System.out.print("幅>>");
		int w = new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		int h = new Scanner(System.in).nextInt();
		char [][] maps=new char[h][w];
		for(int i =0;i<maps.length;i++){
			for(int j=0;j<maps[i].length;j++){
				maps[i][j] = words[new Random().nextInt(words.length)];
				System.out.print(maps[i][j]);
			}
			System.out.println();
		}
	}
}
