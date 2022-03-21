package Home.work.EmployeeManagementSystem;

public class Student {
	private int roll;
	private String branch;
	private String name;
	private double per;
	private String doj; 
	
	Student(){
		
	}
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return roll;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public String getBranch() {
		return branch;
	}
	public void setPer(double per) {
		this.per=per;
	}
	public double getPer() {
		return per;
	}
	public void setDoj(String doj) {
		this.doj=doj;
	}
	public String getDoj() {
		return doj;
	}
	Student(int roll,String branch,String name,double per,String doj){
		super();
		this.roll=roll;
		this.branch=branch;
		this.name=name;
		this.per=per;
		this.doj=doj;
	}
	public String toString() {
		return "Student [ Name: "+name+" Roll Number: "+roll+" Branch: "+branch+" Percentage :"+per+ " Date of Joining :"+doj+"]";
	}
	

}
