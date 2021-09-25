package examen.finall.concesionario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainConcesionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoint = new Scanner(System.in);
		String opcion;
		List<AutoNacional> autoNacional = new ArrayList<AutoNacional>();
		List<AutoImportado> autoExportado = new ArrayList<AutoImportado>();
		AutoNacional autosNac = new AutoNacional();
		AutoImportado autosImp = new AutoImportado();
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
			switch(tipoauto) {
			case"a":
				System.out.println("Ingrese marca del auto:");
				String marca = teclado.nextLine();
				System.out.println("Ingrese modelo del auto:");
				String modelo = teclado.nextLine();
				System.out.println("Ingrese año de fabricacion del auto:");
				String anio = teclado.nextLine();
				System.out.println("Ingrese placa del auto:");
				String placa = teclado.nextLine();
				System.out.println("Ingrese kilometraje del auto:");
				int kilometraje = tecladoint.nextInt();
				autosNac.setMarcaNac(marca);
				autosNac.setModeloNac(modelo);
				autosNac.setAnioPublicNac(anio);
				autosNac.setPlacaNac(placa);
				autosNac.setKilometrajeNac(kilometraje);
				autoNacional.add(autosNac);
				System.out.println("ingrese Codigo Nacional: ");
				String codigo = teclado.nextLine();
				break;
			case "b":
				System.out.println("Ingrese marca del auto:");
				String marcaimp = teclado.nextLine();
				System.out.println("Ingrese modelo del auto:");
				String modeloimp = teclado.nextLine();
				System.out.println("Ingrese año de fabricacion del auto:");
				String anioimp = teclado.nextLine();
				System.out.println("Ingrese placa del auto:");
				String placaimp = teclado.nextLine();
				System.out.println("Ingrese kilometraje del auto:");
				int kilomimp = tecladoint.nextInt();
				autosImp.setMarcaExp(marcaimp);
				autosImp.setModeloExp(modeloimp);
				autosImp.setAnioPublicExp(anioimp);
				autosImp.setPlacaExp(placaimp);
				autosImp.setKilometrajeExp(kilomimp);
				autoExportado.add(autosImp);
				System.out.println("Ingrese Codigo de importacion");
				String codigoimp = teclado.nextLine();
				System.out.println("Ingrese Valor de importacion");
				int valor = tecladoint.nextInt();
				break;
				
			default:
				System.out.println("Ingrese una opcion valida");
			}
			break;
			
		case "2":
			System.out.println("Ingrese numero de la placa del auto");
			String placacomp = teclado.nextLine();
			boolean busqueda = placacomp.contains(autosNac.getPlacaNac());
			if (busqueda==true) {
				System.out.println(autosNac.toString());
			}
			else if(busqueda==false) {
				System.out.println("No se encuentra el auto");
			}
			break;
		case "3":
			System.out.println("Ingrese el numero de placa del auto: ");
			placacomp = teclado.nextLine();
			busqueda = placacomp.contains(autosNac.getPlacaNac());
			if (busqueda==true) {
				System.out.println("Ingrese el nuevo kilometraje: ");
				int kilometraje = tecladoint.nextInt();
				autosNac.setKilometrajeNac(kilometraje);
			}
			else if(busqueda==false) {
				System.out.println("No se encuentra el auto");
			}
			break;
		case "4":
			Arrays.sort(autosImp);
			System.out.println("Reporte de autos: ");
			System.out.println(Arrays.ToString(autosImp));

			break;
		default:
			System.out.println("Ingrese una opcion valida");
			break;
		}
		}while(!opcion.equals("5"));
	}

}
