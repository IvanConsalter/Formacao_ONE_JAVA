
public class TestaIR {

	public static void main(String[] args) {
		
		
		double salario = 3300.0;
		double ir = 0;
		
		if (salario < 1900) {

			System.out.println("Isento");

		} else if (salario >= 1900 && salario <= 2800) {

			ir = (salario / 100) * 7.5;

		} else if (salario > 2800 && salario <= 3751) {

			ir = (salario / 100) * 15;

		} else {

			ir = (salario / 100) * 22.5;
		}

		System.out.println(ir);
	}
}
