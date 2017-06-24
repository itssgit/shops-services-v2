package com.itss.shops.entity;
// Generated Jun 14, 2017 9:21:02 AM by Hibernate Tools 5.2.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.itss.shops.common.entity.BaseEntity;
/**
 * SanPham generated by hbm2java
 */
@Entity
@Table(name = "sanpham")
public class SanPham extends BaseEntity {

	private Integer sanPhamId;
	private Integer nhomSanPhamId;
	private float donGia;
	private String tenSanPham;
	private String moTa;
	private String hinhAnh;
	private boolean hienThi;
	private Integer trangThaiXoa;
	private Date thoiGianXoa;

	public SanPham() {
	}

	public SanPham(float donGia, String tenSanPham, boolean hienThi) {
		this.donGia = donGia;
		this.tenSanPham = tenSanPham;
		this.hienThi = hienThi;
	}

	public SanPham(Integer nhomSanPhamId, float donGia, String tenSanPham, String moTa, String hinhAnh, boolean hienThi, 
			Integer trangThaiXoa, Date thoiGianXoa) {
		this.nhomSanPhamId = nhomSanPhamId;
		this.donGia = donGia;
		this.tenSanPham = tenSanPham;
		this.moTa = moTa;
		this.hinhAnh = hinhAnh;
		this.hienThi = hienThi;		
		this.trangThaiXoa = trangThaiXoa;
		this.thoiGianXoa = thoiGianXoa;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "sanpham_id", unique = true, nullable = false)
	public Integer getSanPhamId() {
		return this.sanPhamId;
	}

	public void setSanPhamId(Integer sanPhamId) {
		this.sanPhamId = sanPhamId;
	}

	@Column(name = "nhom_sanpham_id")
	public Integer getNhomSanPhamId() {
		return this.nhomSanPhamId;
	}

	public void setNhomSanPhamId(Integer nhomSanPhamId) {
		this.nhomSanPhamId = nhomSanPhamId;
	}

	@Column(name = "dongia", nullable = false, precision = 12, scale = 0)
	public float getDonGia() {
		return this.donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	
	@Column(name = "ten_sanpham")
	public String getTenSanPham() {
		return this.tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	@Column(name = "mota")
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Column(name = "hinhanh")
	public String getHinhAnh() {
		return this.hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	@Column(name = "hienthi", nullable = false)
	public boolean isHienThi() {
		return this.hienThi;
	}

	public void setHienThi(boolean hienThi) {
		this.hienThi = hienThi;
	}

	@Column(name = "trangthai_xoa")
	public Integer getTrangThaiXoa() {
		return this.trangThaiXoa;
	}

	public void setTrangThaiXoa(Integer trangThaiXoa) {
		this.trangThaiXoa = trangThaiXoa;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "thoigian_xoa", length = 19)
	public Date getThoiGianXoa() {
		return this.thoiGianXoa;
	}

	public void setThoiGianXoa(Date thoiGianXoa) {
		this.thoiGianXoa = thoiGianXoa;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7886060395269347557L;
}
