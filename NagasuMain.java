import java.util.*;
public class NagasuMain{
	public static void main(String[] args){
		String[] items = new String[]{"森","草","岩","水"};
		System.out.print("幅>>");
		int width = new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		int heigth= new Scanner(System.in).nextInt();

		String[][] map = new String[heigth][width];

		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				int itemno = new Random().nextInt(4);
				map[i][j] = items[itemno];
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}
