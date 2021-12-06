package cn.com.java.experiment;

public class MainClass {
	/*isRepeat方法，判断第n个员工和其他员工之间工号是否一致*/
	public static boolean isRepeat(int n,Employee[] employees) {
		Employee e = employees[n];
		for (int i=0;i<employees.length;i++) {
			if(e != employees[i] && e.equals(employees[i])==true) {
				return false;
		    }
		}
		return true;
	}
	
	/*将工号不重复的员工数据输出到控制台*/
	public static void main(String argv[]) {
		Employee[] employees = new Employee[3];
        employees[0] = new Employee("10001","小王","销售部",5000.0f);
        employees[1] = new Employee("10002","小赵","销售部",6500.0f);
        employees[2] = new Employee("10001","Alan","研发部",15000.0f);
        
        for(int i=0;i<employees.length;i++) {
        	if(isRepeat(i,employees)==true){
        		System.out.println(employees[i].toString());
        	}
        }
	}

}
