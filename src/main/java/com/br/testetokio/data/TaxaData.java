package com.br.testetokio.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.br.testetokio.entity.TaxaEntity;

public class TaxaData {
	
	/**
	 * Popula a tabela de taxas
	 */
	public static List<TaxaEntity> mockTaxas() {
		
		List<TaxaEntity> taxas = new ArrayList<>();
		
		TaxaEntity t1 = new TaxaEntity();
		t1.setInicio(0);
		t1.setFim(0);
		t1.setPorcentagem(BigDecimal.valueOf(2.5));
		taxas.add(t1);
		
		TaxaEntity t2 = new TaxaEntity();
		t2.setInicio(1);
		t2.setFim(10);
		t2.setPorcentagem(BigDecimal.valueOf(0));
		taxas.add(t2);
		
		TaxaEntity t3 = new TaxaEntity();
		t3.setInicio(11);
		t3.setFim(20);
		t3.setPorcentagem(BigDecimal.valueOf(8.2));
		taxas.add(t3);
		
		TaxaEntity t4 = new TaxaEntity();
		t4.setInicio(21);
		t4.setFim(30);
		t4.setPorcentagem(BigDecimal.valueOf(6.9));
		taxas.add(t4);
		
		TaxaEntity t5 = new TaxaEntity();
		t5.setInicio(31);
		t5.setFim(40);
		t5.setPorcentagem(BigDecimal.valueOf(4.7));
		taxas.add(t5);
		
		TaxaEntity t6 = new TaxaEntity();
		t6.setInicio(41);
		t6.setFim(50);
		t6.setPorcentagem(BigDecimal.valueOf(1.7));
		taxas.add(t6);
		
		return taxas;
		
	}
	
}