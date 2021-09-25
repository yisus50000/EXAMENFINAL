package examen.finall.concesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import proyecto.finall.programacion.Estudiante;
import proyecto.finall.programacion.Libro;

public class MainConcesionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoint = new Scanner(System.in);
		String opcion;
		List<AutoNacional> autoNacional = new ArrayList<AutoNacional>();
		List<AutoImportado> autoExportado = new ArrayList<AutoImportado>();
		do {
		System.out.println("#####################");
		System.out.println("CONCESIONARIO AMBACAR");
		System.out.println("Elija una opcion: ");
		System.out.println("1. Ingresar Auto");
		System.out.println("2. Consultar Auto");
		System.out.println("3. Actualizar Kilometraje");
		System.out.println("4. Imprimir Reporte");
		System.out.println("5. Salir");
		System.out.println("#####################");
		opcion = teclado.nextLine();
		switch(opcion){
		case "1":
			System.out.println("Selecciones el tipo de auto que desea ingresar: ");
			System.out.println("a) Auto Nacional");
			System.out.println("b) Auto importado");
			String tipoauto = teclado.nextLine();
			
			break;
		}
		}while(!opcion.equals("5"));
	}

}
