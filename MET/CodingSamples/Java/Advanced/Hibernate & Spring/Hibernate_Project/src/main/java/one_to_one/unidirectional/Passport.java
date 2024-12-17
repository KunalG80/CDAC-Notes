package one_to_one.unidirectional;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Passport_Master")
public class Passport {
	@Id
	@Column(name = "passport_no", length = 15)
	private String passportNo;
	@Column(name = "passport_name", length = 25)
	private String holderName;
	@Column(name = "passport_exp_date")
	private LocalDate expiryDate;
	public Passport() {
		// TODO Auto-generated constructor stub
	}
	public Passport(String passportNo, String holderName, LocalDate expiryDate) {
		super();
		this.passportNo = passportNo;
		this.holderName = holderName;
		this.expiryDate = expiryDate;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", holderName=" + holderName + ", expiryDate=" + expiryDate + "]";
	}

}
