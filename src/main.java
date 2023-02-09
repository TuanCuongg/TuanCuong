	import java.util.Scanner;
public class main {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			boolean flag = true;
			int a,b,c,n;
			do {
				Menu();
				System.out.print("Nhap lua chon: ");
				int luachon = input.nextInt();
				switch(luachon) {
				case 1:
					System.out.print("Nhap a: ");
					a = input.nextInt();
					System.out.print("Nhap b: ");
					b = input.nextInt();
					System.out.print("Nhap c: ");
					c = input.nextInt();
					bài1.ptBacHai(a, b, c);
					break;
				case 2: 
					System.out.print("Nhap n: ");
					int gt = input.nextInt();
					System.out.printf("Giai thua cua %d: %d\n", gt, bài2.giaiThua(gt));
					break;
				case 3:
					System.out.print("Nhap n: ");
					n = input.nextInt();
					System.out.printf("So Fibonacci thu %d: %d\n",n,bài3.Fibonacci(n));
					break;
				case 4:
					System.out.print("Nhap a: ");
					a = input.nextInt();
					System.out.print("Nhap b: ");
					b = input.nextInt();
					System.out.printf("Uoc chung lon nhat cua %d va %d: %d",a,b,bài4.UCLN(a, b));
					System.out.printf("\nBoi chung nho nhat cua %d va %d: %d\n",a,b,bài4.BCNN(a, b));
					break;
				case 5:
					System.out.print("Nhap n: ");
					n = input.nextInt();
					System.out.printf("Cac so nguyen to nho hon %d: ",n);
					bài5.lietkeSNT(n);
					break;
				case 6:
					System.out.print("Nhap n: ");
					n = input.nextInt();
					System.out.printf("\n%d so nguyen to dau tien: ", n);
					bài6.SNT2(n);
					break;
				case 7:
					System.out.print("Cac so nguyen to co 5 chu so: ");
					bài7.SNT3();
					break;
				case 8:
					System.out.println("Nhap n: ");
					n = input.nextInt();
					System.out.printf("Tong cac chu so cua %d: %d\n",n, bài8.tongChuSo(n));
					break;
				case 9:
					bài9.thuannghich();
					break;
				case 10:
					System.out.print("Nhap n: ");
					n = input.nextInt();
					bài10.lietKe(n);
					break;
				default:
					flag = false;
					break;
				}
				
			}while(flag);
		}
		static void Menu () {
			System.out.printf("%-6s%s\n", "[1]", "Phuong trinh bac hai");
			System.out.printf("%-6s%s\n", "[2]", "Giai thua");
			System.out.printf("%-6s%s\n", "[3]", "So Fibonacci");
			System.out.printf("%-6s%s\n", "[4]", "UCLN & BCNN");
			System.out.printf("%-6s%s\n", "[5]", "Liet ke cac so nguyen to nho hon n");
			System.out.printf("%-6s%s\n", "[6]", "Liet ke n so nguyen to dau tien");
			System.out.printf("%-6s%s\n", "[7]", "Liet ke cac so nguyen to co 5 chu so");
			System.out.printf("%-6s%s\n", "[8]", "Tong cac chu so cua mot so nguyen");
			System.out.printf("%-6s%s\n", "[9]", "So thuan nghich co 6 chu so");
			System.out.printf("%-6s%s\n", "[10]", "Liet ke cac so Fibonacci nho hon n la so nguyen to");
			
		}
		boolean LaChan(int n) {
			if (n % 2 == 0) {
				return true;
			}
			return false;
		}
}
