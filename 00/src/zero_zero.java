import java.util.Locale;
import java.util.Scanner;

public class zero_zero {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double plano=50;
		double minutos; 
		double taxa;
		
		System.out.println("quantos minutos foram consumidos? ");
		minutos=sc.nextDouble();
		if(minutos>100) {
			taxa=(minutos-100)*2+plano;
			System.out.printf("valor a ser pago com exedentes R$ %.2f",taxa);
		}else {
			System.out.printf("valor a ser pago R$ %.2f",plano);
			
		}
		
		sc.close();
	}

}
