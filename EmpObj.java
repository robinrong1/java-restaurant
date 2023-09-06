import java.util.ArrayList;

public class EmpObj{

	protected String empID;
	protected String SINumber;
	protected String firstName;
	protected String surname;
	protected String gender;
	protected String DOB;
	protected String age;
	protected String salary;
	protected String position;
	protected ArrayList<EmpObj> emps = new ArrayList<EmpObj>();
	private String positions[]={"Waiter","Chef","Cashier", "Stocker"};
	public String[] getPositions() {
		return positions;
	}


	public void setPositions(String[] positions) {
		this.positions = positions;
	}


	public void setSINumber(String sINumber) {
		SINumber = sINumber;
	}


	public String getempID() {
		return empID;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public ArrayList<EmpObj> getEmps() {
		return emps;
	}


	public void setEmps(ArrayList<EmpObj> emps) {
		this.emps = emps;
	}


	public String getEmpID() {
		return empID;
	}


	public void setEmpID(String empid) {
		empID = empid;
	}

	public String getSINumber() {
		return SINumber;
	}


	public void setNINumber(String sinumber) {
		SINumber = sinumber;
	}
	public String getFirstname() {
		return firstName;
	}


	public void setFirstname(String firstname) {
		firstName = firstname;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}


	public void setGender(String Gender) {
		gender = Gender;
	}
	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public EmpObj(String empID,String SINumber, String firstName, String surname, String gender, String DOB, String age, String salary, String position) {
		this.empID = empID;
		this.SINumber = SINumber;
		this.firstName = firstName;
		this.surname = surname;
		this.gender = gender;
		this.DOB = DOB;
		this.age = age;
		this.salary = salary;
		this.position = position;
	}
	public EmpObj() {
		
	}


}