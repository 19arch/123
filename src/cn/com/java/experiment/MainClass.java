package cn.com.java.experiment;

public class MainClass {
	/*isRepeat�������жϵ�n��Ա��������Ա��֮�乤���Ƿ�һ��*/
	public static boolean isRepeat(int n,Employee[] employees) {
		Employee e = employees[n];
		for (int i=0;i<employees.length;i++) {
			if(e != employees[i] && e.equals(employees[i])==true) {
				return false;
		    }
		}
		return true;
	}
	
	/*�����Ų��ظ���Ա���������������̨*/
	public static void main(String argv[]) {
		Employee[] employees = new Employee[3];
        employees[0] = new Employee("10001","С��","���۲�",5000.0f);
        employees[1] = new Employee("10002","С��","���۲�",6500.0f);
        employees[2] = new Employee("10001","Alan","�з���",15000.0f);
        
        for(int i=0;i<employees.length;i++) {
        	if(isRepeat(i,employees)==true){
        		System.out.println(employees[i].toString());
        	}
        }
	}

}
