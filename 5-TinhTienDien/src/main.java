import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		float soDienCu,soDienMoi;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap so dien cu: ");
		soDienCu=sc.nextFloat();
		System.out.println("nhap so dien moi: ");
		soDienMoi=sc.nextFloat();
		System.out.println("tien dien la: "+((soDienMoi-soDienCu)*3000));
	}

}
