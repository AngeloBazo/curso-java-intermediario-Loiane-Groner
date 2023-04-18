package com.loiane.cursojava.aula85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Aula93DatasJava8 {

	public static void main(String[] args) {

		// data

		LocalDate agora = LocalDate.now();

		System.out.println(agora);
		System.out.println(LocalDate.of(2019, 5, 30));
		System.out.println(LocalDate.parse("2019-02-01"));

		System.out.println(agora.plusDays(3));
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));

		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfYear());
		System.out.println(agora.isLeapYear());

		// horário

		LocalTime hAgora = LocalTime.now();
		System.out.println(hAgora);
		System.out.println(LocalTime.of(20, 18));

		System.out.println(hAgora.plusHours(5));

		System.out.println(hAgora.getHour());

		// data completa

		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto);

		System.out.println(agoraCompleto.getNano());
		System.out.println(agoraCompleto.getChronology());

		// zone

		

	}

}
