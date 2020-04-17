package demo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		
		QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
		quanLyCanBo.themCanBo(sc);
		System.out.println(quanLyCanBo);
		System.out.println();
		System.out.println(quanLyCanBo.mucLuongThapNhatTheoLoai(QuanLyCanBo.NHAN_VIEN));
		System.out.println("Tong Luong: " + quanLyCanBo.tinhTongLuongTheoLoai(QuanLyCanBo.NHAN_VIEN));

		// Cau a: Nhap can bo vao danh sach
		quanLyCanBo.themCanBo(sc);

		// Cau b: tim can bo theo ten
		System.out.println(quanLyCanBo.timCanBoTheoTen(sc));

		// Cau c: Cho biet muc luong thap nhat cua tung loai can bo
		double luongThapNhatGiangVien = quanLyCanBo.mucLuongThapNhatTheoLoai(QuanLyCanBo.GIANG_VIEN);
		System.out.println("Luong thap nhat cua giang vien: " + luongThapNhatGiangVien);
		double luongThapNhatNhanVien = quanLyCanBo.mucLuongThapNhatTheoLoai(QuanLyCanBo.NHAN_VIEN);
		System.out.println("Luong thap nhat cua nhan vien hanh chinh: " + luongThapNhatNhanVien);

		// Cau d: Cho biet tong luong cua tung loai canbo
		double tongLuongGiangVien = quanLyCanBo.tinhTongLuongTheoLoai(QuanLyCanBo.GIANG_VIEN);
		System.out.println("Tong luong giang vien: " + tongLuongGiangVien);
		double tongLuongNhanVien = quanLyCanBo.tinhTongLuongTheoLoai(QuanLyCanBo.NHAN_VIEN);
		System.out.println("Tong luong nhan vien hanh chinh: " + tongLuongNhanVien);

		// Cau e: Sap xep danh sach can bo giam theo luong
		quanLyCanBo.sapXepCanBoGiamTheoLuong();
		System.out.println(quanLyCanBo);
	}
}
