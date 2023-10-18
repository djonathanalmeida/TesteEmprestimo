package servicos;

import java.time.LocalDate;

import entidades.Contrato;
import entidades.Parcela;

public class ContratoServico {

	private PagamentoOnlineServico pagamentoOnlineServico;

	public ContratoServico(PagamentoOnlineServico pagamentoOnlineServico) {
		this.pagamentoOnlineServico = pagamentoOnlineServico;
	}

	public void processarContrato(Contrato contrato, Integer meses) {
		
		contrato.getParcelas().add(new Parcela(LocalDate.of(2018, 7, 25), 206.04));
		contrato.getParcelas().add(new Parcela(LocalDate.of(2018, 8, 25), 208.08));

	}

}
