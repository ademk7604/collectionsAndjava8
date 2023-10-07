package d04_LinkedHashSet;

public class Car {

	private String marka;
	private String model;
	private String plaka;

	public Car() {
	}

	public Car(String marka, String model, String plaka) {
		this.marka = marka;
		this.model = model;
		this.plaka = plaka;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	@Override
	public String toString() {
		return "Marka : " + marka + ", Model : " + model + ", Plaka : " + plaka;
	}
	@Override
	public int hashCode() {
		return this.plaka.hashCode();
		// bu sekilde once hashCode larini aliyor sonra equals ile palakalari karsilastiriyoruz
	}

	@Override
	public boolean equals(Object other) {
		Car otherCar = (Car) other;
		return otherCar.plaka.equals(this.plaka);
		//hashCode methodu overrid etmedigimiz zaman karsilastirmiyor
	}

}
