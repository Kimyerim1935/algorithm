import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int firstSec = in.nextInt();

		int SecondSec = in.nextInt();

		int ThirdSec = in.nextInt();

		int FourthSec = in.nextInt();

		int sum = (firstSec + SecondSec + ThirdSec + FourthSec);
		int resultMin = sum / 60;
		int resultSec = sum - (resultMin * 60);

		System.out.println(resultMin);
		System.out.println(resultSec);

	}
}