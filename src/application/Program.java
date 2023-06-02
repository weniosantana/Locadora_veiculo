package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;

public class Program {

	public static void main(String[] args) {
		
		CarRental cr;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String vehicle = sc.next();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		cr = new CarRental(start, finish, new Vehicle(vehicle));
		
		/*System.out.print("Entre com o preço por hora: ");
		Double priceH = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		Double priceD = sc.nextDouble();
		System.out.println("FATURA: ");
		System.out.print("Pagamento basico: ");
		*/
		
		
	}

}
