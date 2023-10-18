package servicos;

public interface PagamentoOnlineServico {
	
	double taxaPagamento(double quantia);
	double juros(double quantia, int meses);

}
