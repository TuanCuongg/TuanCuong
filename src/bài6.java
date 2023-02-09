
public class bài6 {
	static void SNT2 (int n) {
		int tmp = 0;
		int count = 0;
		while(count < n) {
			if (bài5.ktSNT(tmp)) {
				System.out.print(tmp + " ");
				count += 1;
			}
			tmp += 1;
		}
	}
}
