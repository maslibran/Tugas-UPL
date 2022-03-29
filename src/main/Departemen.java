package src.main;


public class Departemen {
	private String nama;
	private Manager manager;
	
	public Departemen() {
		
	}
	
	public Departemen(String nama, Manager manager) {
		this.nama = nama;
		this.manager = manager;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	public String getDetailManager() {
		return manager.detailManager();
	}
}
