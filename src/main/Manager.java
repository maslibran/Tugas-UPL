package src.main;

public class Manager {
	private String nama;
	private Departemen departemen = new Departemen();
	
	public Manager() {
		
	}
	
	public Manager(String nama) {
		this.nama = nama;
	}
	
	public Manager(String nama, Departemen departemen) {
		this.nama = nama;
		this.departemen = departemen;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public String detailManager() {
		return "Nama : " + this.nama + "\nDepartemen : " + this.departemen.getNama();
	}
	
	public void setDepartemen(Departemen departemen) {
		this.departemen = departemen;
	}
	
	public String getNamaDepartemen() {
		return departemen.getNama();
	}
}
