package demo;

public class NhanVienHanhChinh extends CanBo {
	private static final String TRUONG_PHONG = "truong phong";
	private static final String PHO_PHONG = "pho phong";
	private static final String NHAN_VIEN = "nhan vien";

	private String phongBan;
	private int soNgayCong;
	private String chucVu;

	/**
	 * @param maSo
	 * @param ten
	 * @param phuCap
	 * @param heSoLuong
	 * @param phongBan
	 * @param soNgayCong
	 * @param chucVu
	 */
	public NhanVienHanhChinh(String maSo, String ten, String phongBan, int soNgayCong, String chucVu) {
		super(maSo, ten);
		phuCap = tinhPhuCapTheoChucVu(chucVu);
		heSoLuong = 0.7;
		this.phongBan = phongBan;
		this.soNgayCong = soNgayCong;
		this.chucVu = chucVu;
	}

	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public int getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	private double tinhPhuCapTheoChucVu(String chucVu) {
		double phuCap = 0;
		switch (chucVu) {
		case NhanVienHanhChinh.TRUONG_PHONG:
			phuCap = 1000000.0;
			break;
		case NhanVienHanhChinh.PHO_PHONG:
			phuCap = 700000.0;
			break;
		case NhanVienHanhChinh.NHAN_VIEN:
			phuCap = 400000.0;
			break;

		default:
			break;
		}
		return phuCap;
	}

	@Override
	public double tinhLuong() {
		return heSoLuong * 750000 + phuCap + soNgayCong * 200000;
	}

	@Override
	public String toString() {
		return "NhanVienHanhChinh [phongBan=" + phongBan + ", soNgayCong=" + soNgayCong + ", chucVu=" + chucVu
				+ ", maSo=" + maSo + ", ten=" + ten + ", phuCap=" + phuCap + ", heSoLuong=" + heSoLuong + "]";
	}
}
