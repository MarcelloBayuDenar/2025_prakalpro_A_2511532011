package Pekan7_2511532011;

public class Akun { 
	private String username, password, email;
	private int pin;
	
	public void setName (String username) {
		this.username = username;
	}
	
	public void setPw (String password) {
		this.password = password;
	}
	
	public void setEmail (String email) {
		this.email = email ;
	}
	
	public void setPin (int pin ) {
		this.pin = pin;
	}
	
	public String getName() {
		return username;
	}
	
	public String getPw() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getPin() {
		return pin;
	}
	
	public boolean isEmailValid(String email) {
		return email != null
				&& !email.trim().isEmpty()
				&& email.contains("@")
	            && email.contains(".");
		
	}
	
	public boolean isPasswordValid(String password) {
		return password != null
				&& !password.trim().isEmpty()
				&& password.length() >= 8;
	}
	
	public void cetakBerhasil() {
		System.out.println("");
		System.out.println("--- REGISTRASI BERHASIL ---");
		System.out.println("Akun untuk \"" +  this.getEmail() + "\" telah berhasil dibuat.");
		System.out.println("");
		System.out.println("--- DETAIL AKUN ---");
		System.out.println("Username    (Lowercase): " + this.getName().toLowerCase());
		System.out.println("Email       (Uppercase): " + this.getEmail().toUpperCase());
		System.out.println("ID PENGGUNA (Gabungan) : " + this.getName() + this.getPin());
		System.out.println("");
		System.out.println("---" + " UJI TIPE DATA (PIN ANDA: " + this.getPin() +")" + "---");
		System.out.println("PIN (int) + 10 = " + (this.getPin() + 10  ));
		System.out.println("PIN (String) + \"" + 10 + "\" = " + this.getPin() + "10");
	}
	
	public void cetak1() {
		System.out.println("Email Anda \"" + this.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
		System.out.println("silahkan coba lagi");
	}
	
	public void cetak2() {
		System.out.println("Password Anda \"" + this.getPw() + "\" tidak valid (harus terdiri dari 8 angka atau lebih).");
		System.out.println("silahkan coba lagi");
	}
	
	public void cetak3() {
		System.out.println("Email dan Password tidak valid");
		System.out.println("silahkan coba lagi");
		
	}
}
