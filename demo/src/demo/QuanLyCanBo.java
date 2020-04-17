package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo extends ArrayList<CanBo> {
	public static final String NHAN_VIEN = "NHAN_VIEN_HANH_CHINH";
	public static final String GIANG_VIEN = "GIANG_VIEN";
	private static final long serialVersionUID = 1L;

	public void themCanBo(Scanner sc) {
		boolean loop = true;
		do {
			System.out.println("Chon can bo can them: \n1.Nhan vien\n2.Giang vien");
			CanBo canBo = null;
			String maSo;
			String ten;
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				System.out.print("Nhap ma so: ");
				maSo = sc.nextLine();
				System.out.print("Nhap ten: ");
				ten = sc.nextLine();
				System.out.print("Nhap phong ban: ");
				String phongBan = sc.nextLine();
				System.out.print("Nhap so ngay cong: ");
				int soNgayCong = Integer.parseInt(sc.nextLine());
				System.out.print("Nhap chuc vu: ");
				String chucVu = sc.nextLine();
				canBo = new NhanVienHanhChinh(maSo, ten, phongBan, soNgayCong, chucVu);
				break;
			case 2:
				System.out.print("Nhap ma so: ");
				maSo = sc.nextLine();
				System.out.print("Nhap ten: ");
				ten = sc.nextLine();
				System.out.print("Nhap khoa: ");
				String khoa = sc.nextLine();
				System.out.print("Nhap trinh do: ");
				String trinhDo = sc.nextLine();
				System.out.print("Nhap so gio giang day: ");
				int gioGiangDay = Integer.parseInt(sc.nextLine());
				canBo = new GiangVien(maSo, ten, khoa, trinhDo, gioGiangDay);
				break;

			default:
				break;
			}
			System.out.println("Them can bo khac? (y/n)");
			if (sc.nextLine().equalsIgnoreCase("n")) {
				loop = false;
			}
			this.add(canBo);
		} while (loop);
	}

	public CanBo timCanBoTheoTen(Scanner sc) {
		System.out.println("Nhap ten can bo can tim: ");
		String ten = sc.nextLine();
		CanBo canBo = null;
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i).getTen().equals(ten)) {
				canBo = this.get(i);
			}
		}
		return canBo;
	}

	public double mucLuongThapNhatTheoLoai(String type) {
		double luongThapNhat = 0;
		for (CanBo canBo : this) {
			if (checkInstanceOf(canBo, type) && (canBo.tinhLuong() < luongThapNhat || luongThapNhat == 0)) {
				luongThapNhat = canBo.tinhLuong();
			}
		}
		return luongThapNhat;
	}

	public double tinhTongLuongTheoLoai(String type) {
		double tongLuong = 0;
		for (CanBo canBo : this) {
			if (checkInstanceOf(canBo, type)) {
				tongLuong += canBo.tinhLuong();
			}
		}
		return tongLuong;
	}

	public void sapXepCanBoGiamTheoLuong() {

	}

	@Override
	public String toString() {
		return super.toString();
	}

	private boolean checkInstanceOf(CanBo canBo, String type) {
		switch (type) {
		case QuanLyCanBo.NHAN_VIEN:
			return canBo instanceof NhanVienHanhChinh;
		case QuanLyCanBo.GIANG_VIEN:
			return canBo instanceof GiangVien;
		default:
			break;
		}
		return false;
	}
}
