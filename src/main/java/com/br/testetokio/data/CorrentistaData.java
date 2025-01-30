package com.br.testetokio.data;

import com.br.testetokio.entity.CorrentistaEntity;

public class CorrentistaData {
	
	/**
	 * cria um correntista "mockado"
	 */
	public static CorrentistaEntity mockCorrentista() {
		CorrentistaEntity correntista = new CorrentistaEntity();
		correntista.setConta("03030-30");
		correntista.setNome("joaozinho trinta");
		return correntista;
	}
	

}
