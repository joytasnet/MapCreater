import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){

		System.out.print("幅を入力>>");
		int wide = new Scanner(System.in).nextInt();
		System.out.print("高さを入力>>");
		int high = new Scanner(System.in).nextInt();

		String[][] map = new String [high][wide];
		String[] item = {"岩","森","水","草"};

		for(int i=0 ; i<map.length ; i++){
			for(int j=0 ; j<map[i].length ;j++){
				int rnd = new Random().nextInt(item.length);
				map[i][j] = item[rnd];
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}
