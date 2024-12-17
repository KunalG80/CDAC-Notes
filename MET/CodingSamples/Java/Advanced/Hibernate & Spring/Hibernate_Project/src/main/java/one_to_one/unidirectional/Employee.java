package one_to_one.unidirectional;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_Master")
public class Employee {
	@Id
	@Column(name = "emp_no")
	private Integer empNo;
	@Column(name = "emp_name", length = 30)
	private String name;
	@Column(name = "emp_salary")
	private float salary;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passport_id")
	private Passport passport;//Holding a reference of type: Passport
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empNo, String name, float salary, Passport passport) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.passport = passport;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}

}
