package cn.com.java.experiment;

public class Employee {
	String number;//����
	String name;//����
	String dept;//����
	float salary;//нˮ
	
	/*getter��setter����*/
	public String getnumber() {
		return number;
	}
	public String getname() {
		return name;
	}
	public String getdept() {
		return dept;
	}
	public float getsalary() {
		return salary;
	}
	
	public void setnumber(String number) {
		this.number=number;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setdept(String dept) {
		this.dept=dept;
	}
	public void setsalary(float salary) {
		this.salary=salary;
	}
	
	public Employee(String number,String name,String dept,float salary) {
        this.number = number;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
	/*equals�������жϹ��ŵ��ظ���*/
    public boolean equals(Employee e) {
        if(!e.getnumber().equals(this.getnumber())) 
        	return false;
        else 
        	return true;
    }
    /*toString���������Ա������*/
    public String toString() {
    	StringBuffer buffer = new StringBuffer("����:");
        buffer.append(number);
        buffer.append(",����:");
        buffer.append(name);
        buffer.append(",����:");
        buffer.append(dept);
        buffer.append(",нˮ:");
        buffer.append(salary);
        return buffer.toString();
    }
}
