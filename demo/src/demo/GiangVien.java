package demo;

public class GiangVien extends CanBo {
	private static final String CU_NHAN = "cu nhan";
	private static final String THAC_SI = "thac si";
	private static final String TIEN_SI = "tien si";
	private String khoa;
	private String trinhDo;
	private int gioGiangDay;

	/**
	 * @param maSo
	 * @param ten
	 * @param phuCap
	 * @param heSoLuong
	 * @param khoa
	 * @param trinhDo
	 * @param gioGiangDay
	 */
	public GiangVien(String maSo, String ten, String khoa, String trinhDo, int gioGiangDay) {
		super(maSo, ten);
		phuCap = tinhPhuCapTheoTrinhDo(trinhDo);
		heSoLuong = 0.5;
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.gioGiangDay = gioGiangDay;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public int getGioGiangDay() {
		return gioGiangDay;
	}

	public void setGioGiangDay(int gioGiangDay) {
		this.gioGiangDay = gioGiangDay;
	}

	private double tinhPhuCapTheoTrinhDo(String trinhDo) {
		double phuCap = 0;
		switch (trinhDo) {
		case GiangVien.CU_NHAN:
			phuCap = 500000.0;
			break;
		case GiangVien.THAC_SI:
			phuCap = 1000000.0;
			break;
		case GiangVien.TIEN_SI:
			phuCap = 1500000.0;
			break;

		default:
			break;
		}
		return phuCap;
	}

	@Override
	public double tinhLuong() {
		return heSoLuong * 750000 + phuCap + gioGiangDay * 100;
	}

	@Override
	public String toString() {
		return "GiangVien [khoa=" + khoa + ", trinhDo=" + trinhDo + ", gioGiangDay=" + gioGiangDay + ", maSo=" + maSo
				+ ", ten=" + ten + ", phuCap=" + phuCap + ", heSoLuong=" + heSoLuong + "]";
	}
}
