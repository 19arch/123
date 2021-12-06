package cn.com.java.experiment;

public class Employee {
	String number;//工号
	String name;//姓名
	String dept;//部门
	float salary;//薪水
	
	/*getter和setter方法*/
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
	/*equals方法，判断工号的重复性*/
    public boolean equals(Employee e) {
        if(!e.getnumber().equals(this.getnumber())) 
        	return false;
        else 
        	return true;
    }
    /*toString方法，输出员工数据*/
    public String toString() {
    	StringBuffer buffer = new StringBuffer("工号:");
        buffer.append(number);
        buffer.append(",姓名:");
        buffer.append(name);
        buffer.append(",部门:");
        buffer.append(dept);
        buffer.append(",薪水:");
        buffer.append(salary);
        return buffer.toString();
    }
}
