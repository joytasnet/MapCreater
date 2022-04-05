import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		System.out.print("幅>>");
		int width = new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		int height = new Scanner(System.in).nextInt();
		String[][] maps = new String[height][width];

		String[] words = new String[]{"森","草","岩","水"};
		for(int i=0;i<maps.length;i++){
			for(int j=0;j<maps[i].length;j++){
				int num = new Random().nextInt(words.length);
				maps[i][j] = words[num];
				/*switch(num){
					case 1:
						maps[i][j] = "森";
						break;
					case 2:
						maps[i][j] = "草";
						break;
					case 3:
						maps[i][j] = "岩";
						break;
					default:
						maps[i][j] = "水";
						break;
				}*/
				System.out.print(maps[i][j]);
			}
			System.out.println("");
		}
	}
}
