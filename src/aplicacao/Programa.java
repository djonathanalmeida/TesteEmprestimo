package aplicacao;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcela;
import servicos.ContratoServico;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		Integer numeroContrato = sc.nextInt();
		System.out.println("Data (dd/MM/yyyy): ");
		LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double valorContrato = sc.nextDouble();

		Contrato obj = new Contrato(numeroContrato, dataContrato, valorContrato);

		System.out.print("Entre com o número de parcelas: ");
		Integer numeroParcelas = sc.nextInt();
		
		ContratoServico contratoServico = new ContratoServico(null);
		
		contratoServico.processarContrato(obj, numeroParcelas);
		
		System.out.println("Parcelas: ");
		for(Parcela parcela : obj.getParcelas()) {
			System.out.println(parcela);
		}

		sc.close();

	}

}
