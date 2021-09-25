package examen.finall.concesionario;

public class AutoImportado implements Comparable<AutoImportado> {

	public String marcaExp;
	public String modeloExp;
	public String anioPublicExp;
	public String placaExp;
	public int kilometrajeExp;

	// Getters y Setters
	public String getMarcaExp() {
		return marcaExp;
	}

	public void setMarcaExp(String marcaExp) {
		this.marcaExp = marcaExp;
	}

	public String getModeloExp() {
		return modeloExp;
	}

	public void setModeloExp(String modeloExp) {
		this.modeloExp = modeloExp;
	}

	public String getAnioPublicExp() {
		return anioPublicExp;
	}

	public void setAnioPublicExp(String anioPublicExp) {
		this.anioPublicExp = anioPublicExp;
	}

	public String getPlacaExp() {
		return placaExp;
	}

	public void setPlacaExp(String placaExp) {
		this.placaExp = placaExp;
	}

	public int getKilometrajeExp() {
		return kilometrajeExp;
	}

	public void setKilometrajeExp(int kilometrajeExp) {
		this.kilometrajeExp = kilometrajeExp;
	}
	public int compareTo(AutoImportado o) {

		if (this.kilometrajeExp > o.getKilometrajeExp()) {
			return 1;
		} else if (this.kilometrajeExp == o.getKilometrajeExp()) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Marca: " + marcaExp + " - Modelo: " + modeloExp + " - Placa: " + placaExp + " - Kilometraje " + kilometrajeExp;
	}
	

}
