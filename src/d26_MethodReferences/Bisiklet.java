package d26_MethodReferences;

import java.io.Serializable;

public class Bisiklet implements Serializable {

	private String marka;
	private int vitesSayisi;

	public Bisiklet() {

	}

	public Bisiklet(String marka, int vitesSayisi) {
		this.marka = marka;
		this.vitesSayisi = vitesSayisi;
	}

	// yapici method
	public Bisiklet(String marka) {
		this.marka = marka;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getVitesSayisi() {
		return vitesSayisi;
	}

	public void setVitesSayisi(int vitesSayisi) {
		this.vitesSayisi = vitesSayisi;
	}

	@Override
	public boolean equals(Object obj) {
		Bisiklet bisiklet = (Bisiklet) obj;
		return bisiklet.marka.equals(this.marka) && bisiklet.vitesSayisi == this.vitesSayisi;
	}

	@Override
	public int hashCode() {
		return marka.hashCode() + vitesSayisi;
	}

	@Override
	public String toString() {
		return "Marka: " + marka + ", VitesSayisi: " + vitesSayisi;
	}

}
