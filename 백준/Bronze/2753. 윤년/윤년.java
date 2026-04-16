import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int year=in.nextInt();

		int yun;
		if (year%4==0) {
			if (year%100!=0) yun =1;
            else if (year%400==0) yun=1;
			else yun=0;
		}

		else yun=0;
		System.out.print(yun);
	}
}