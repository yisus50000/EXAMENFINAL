package examen.finall.concesionario;


public class AutoNacional implements Comparable<AutoNacional> {

	public String marcaNac;
	public String modeloNac;
	public String anioPublicNac;
	public String placaNac;
	public int kilometrajeNac;

	// Getters y Setters

	public String getMarcaNac() {
		return marcaNac;
	}

	public void setMarcaNac(String marcaNac) {
		this.marcaNac = marcaNac;
	}

	public String getModeloNac() {
		return modeloNac;
	}

	public void setModeloNac(String modeloNac) {
		this.modeloNac = modeloNac;
	}

	public String getAnioPublicNac() {
		return anioPublicNac;
	}

	public void setAnioPublicNac(String anioPublicNac) {
		this.anioPublicNac = anioPublicNac;
	}

	public String getPlacaNac() {
		return placaNac;
	}

	public void setPlacaNac(String placaNac) {
		this.placaNac = placaNac;
	}

	public int getKilometrajeNac() {
		return kilometrajeNac;
	}

	public void setKilometrajeNac(int kilometrajeNac) {
		this.kilometrajeNac = kilometrajeNac;
	}
	public int compareTo(AutoNacional o) {

		if (this.kilometrajeNac > o.getKilometrajeNac()) {
			return 1;
		} else if (this.kilometrajeNac == o.getKilometrajeNac()) {
			return 0;
		} else {
			return -1;
		}
	}
	@Override
	public String toString() {
		return "Marca: " + marcaNac + " - Modelo: " + modeloNac + " - Placa: " + placaNac + " - Kilometraje: " + kilometrajeNac;
	}
	
}
