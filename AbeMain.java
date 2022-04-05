import java.util.*;
public class AbeMain{
	public static void main(String[] args){
		char[] words = {'森','草','岩','水'};
		System.out.print("幅>>");
		int width = new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		int height = new Scanner(System.in).nextInt();
		char[][] maps = new char[height][width];
		for(int i = 0; i < maps.length; i++){
			for(int j = 0; j < maps[i].length; j++){
				int rnd = new Random().nextInt(words.length);
				maps[i][j] = words[rnd];
				System.out.print(maps[i][j]);
			}
			System.out.println();
		}
	}
}
