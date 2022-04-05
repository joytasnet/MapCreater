import java.util.*;
public class MatsuokaMain{
	public static void main(String[] argd){
		int high,width;
		System.out.print("幅>>");
		width=new Scanner(System.in).nextInt();
		System.out.print("高さ>>");
		high=new Scanner(System.in).nextInt();
		char mapname[]={'森','草','岩','水'};
		for(int i=0;i<high;i++){
			for(int j=0;j<width;j++){
				int randommap=new Random().nextInt(3);
				System.out.printf("%s",mapname[randommap]);
			}
			System.out.println();
		}
	}
}
