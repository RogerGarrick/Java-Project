use QLNV
go

create table NhanVien(
	maNV nvarchar(10) not null,
	tenNV nvarchar(50) not null,
	ngaySinh nvarchar(15) not null,
	gioiTinh nvarchar(5) not null,
	sdt nvarchar(11) not null,
	diaChi nvarchar(30) not null,
	taiKhoan nvarchar(15) not null,
	matKhau nvarchar(20) not null
)
go

create table BanHang(
	
	ban int not null,
	tenNuoc nvarchar(50) not null,
	soLuong int not null,
	thanhTien nvarchar(50) not null
)

go 

insert into NhanVien (maNV, tenNV, ngaySinh, gioiTinh, sdt, diaChi, taiKhoan, matKhau)
values 
('001', 'Quang', '06/06/1997', 'Nam', '0523108584', '212/1 Hung Thanh', 'Quang97', '123'),
('002', 'Quynh', '05/09/1996', 'Nu', '0123456789', 'Binh Phuoc', 'Quynh96', '1234')

go

insert into BanHang(ban, tenNuoc, soLuong, thanhTien)
values 
('001', 'Cà Phê', '2', '1000'),
('002', 'Cam', '3', '1500')



delete from NhanVien
where gioiTinh = 'Nam'

go

select *
from NhanVien;

select *
from BanHang;