package fecha;

import java.util.*;
import java.text.*;
public class NumeroDias{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println(
		"�Cuantos d�as tardar�s en terminar la revisi�n?");
		long nDias=Long.parseLong(sc.nextLine());
		long nMSegundos=nDias*24*60*60*1000;
		Date dia= new Date(System.currentTimeMillis()+nMSegundos);
		DateFormat formateadorFecha = DateFormat.getDateInstance();
		System.out.println("La revisi�n se entregar� el d�a: ");
		System.out.println(formateadorFecha.format(dia));
	}
}
