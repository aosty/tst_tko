package com.br.testetokio.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AgendamentoUtil {
	
	public static Integer calculaPeriodo(LocalDateTime data) {
		return Integer.valueOf(Math.toIntExact(ChronoUnit.DAYS.between(LocalDateTime.now(), data)));
	}
}
