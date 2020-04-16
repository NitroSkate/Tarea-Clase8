package com.uca.capas.tarea2.controller;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/datos")
	public @ResponseBody String datos() {
		String nombre = "Joshua";
		String apellido = "Sharp";
		String carnet = "00159817";
		String carrera = "Ing. Informatica";
		String anio = "Cuarto Año";
		String texto = "Nombre: " + nombre + " Apellido: " + apellido + " Carnet: " + carnet + " Carrera: "+ carrera + " Año: " + anio;
		return texto;
	}
	
	@RequestMapping("/fecha")
	public @ResponseBody String parametro(HttpServletRequest request) {
		String dia;
		Integer param1 = Integer.parseInt(request.getParameter("dia"));
		Integer param2 = Integer.parseInt(request.getParameter("mes"));
		Integer param3 = Integer.parseInt(request.getParameter("anio"));
		//return LocalDate.of(param3, param2, param1).getDayOfWeek().toString();
	
		
		switch( LocalDate.of(param3, param2, param1).getDayOfWeek().toString()) {
		case "MONDAY": dia = "Lunes";
		break;
		case "TUESDAY": dia = "Martes";
		break;
		case "WEDNESDAY": dia = "Miercoles";
		break;
		case "THURSDAY": dia = "Jueves";
		break;
		case "FRIDAY": dia = "Viernes";
		break;
		case "SATURDAY": dia = "Sabado";
		break;
		case "SUNDAY": dia = "Domingo";
		break;
		default: dia = "Ningun dia seleccionado";
		break;
		}
		return "Dia de la semana enviado: " + dia;
	}

}
