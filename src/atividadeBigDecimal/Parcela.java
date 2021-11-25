package atividadeBigDecimal;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Parcela {
	private BigDecimal valorParcela;
	private LocalDate dataVencimento;
	
	public Parcela(BigDecimal valorParcela, LocalDate dataVencimento) {
		this.valorParcela = valorParcela;
		this.dataVencimento = dataVencimento;
	}
	
	public BigDecimal getValorParcela() {
		return valorParcela;
	}
	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	@Override
	public String toString() {
		return "Parcela R$ " + valorParcela + ", Data Vencimento = " + dataVencimento + "\n";
	}
	
}
