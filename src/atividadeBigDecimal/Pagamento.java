package atividadeBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Pagamento {
	private Double valorTotal;
	private Integer numParcelas;
	
	private List<Parcela> gerarParcela(Double valorTotal, Integer numParcela){
		List<Parcela> lista = new ArrayList<>();  
		BigDecimal valorTotalCompra = BigDecimal.valueOf(valorTotal);
		BigDecimal numeroParcelas = BigDecimal.valueOf(numParcela);
		BigDecimal valorParcela = valorTotalCompra.divide(numeroParcelas, RoundingMode.HALF_EVEN);
		LocalDate dataVencimento = LocalDate.of(2021, Month.NOVEMBER, 10);
		int j = 1;
		for (int i = 0; i < numParcela; i++) {
			lista.add(new Parcela(valorParcela, dataVencimento.plusMonths(j)));
			j++;
		}
		return lista;
	}
	
	public Pagamento(Double valorTotal, Integer numParcelas) {
		this.valorTotal = valorTotal;
		this.numParcelas = numParcelas;
	}

	public List<Parcela> getParcelas() {
		return gerarParcela(valorTotal, numParcelas);
	}

	@Override
	public String toString() {
		return " Valor Total = " + valorTotal + ", Número Parcelas="
				+ numParcelas + "\nLista Parcelas = " + getParcelas();
}
}
