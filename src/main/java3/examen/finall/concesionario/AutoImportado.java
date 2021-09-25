package examen.finall.concesionario;

public class AutoImportado {

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

	@Override
	public String toString() {
		return "Marca: " + marcaExp + " - Modelo: " + modeloExp + ", anioPublicExp=" + anioPublicExp
				+ ", placaExp=" + placaExp + ", kilometrajeExp=" + kilometrajeExp + "]";
	}
	

}
