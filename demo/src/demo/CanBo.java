package demo;

public abstract class CanBo {
	protected String maSo;
	protected String ten;
	protected double phuCap;
	protected double heSoLuong;

	/**
	 * @param maSo
	 * @param ten
	 * @param phuCap
	 * @param heSoLuong
	 */
	public CanBo(String maSo, String ten) {
		super();
		this.maSo = maSo;
		this.ten = ten;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}

	public abstract double tinhLuong();
}
