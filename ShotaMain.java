import java.util.*;
public class ShotaMain{
	public static void main(String[] args){
		char[] words={'森','草','岩','水'};
		System.out.print("幅>>");
		int with=new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		int higth=new Scanner(System.in).nextInt();

		char[][] grounds=new char[higth][with];
		for(int i=0; i<grounds.length;i++){
			for(int j=0; j<grounds[i].length;j++){
				grounds[i][j]=words[new Random().nextInt(words.length)];
				System.out.print(grounds[i][j]);
			}
			System.out.println();
		}
	}
}

