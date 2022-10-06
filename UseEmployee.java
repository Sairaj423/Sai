package collection;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[]args) {
		Employee e1=new Employee("Nagaraj", 25, 423, 25000, true, "AE");
		Employee e2=new Employee("Revanth", 24, 324, 46000, true, "Manager");
		Employee e3=new Employee("Sugu", 22, 243, 20000, false, "Trainee");
		Employee e4=new Employee("Raj", 20, 357, 20000, true, "Trainee");
		Employee e5=new Employee("Sumi", 24, 727, 26000, false, "QE");
		
		ArrayList<Employee>e=new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		
		/*for(int i=0;i<e.size();i++) {
			System.out.println(e.get(i).getEmpName().charAt(e.get(i).getEmpName().length()-1));
		}*/
		
		/*ArrayList<Employee>g=new ArrayList<>();
		for(Employee g1:e) {
			if(g1.getEmpSalary()>=30000) {
				g.add(g1);
			}
		}
		g.forEach(x->System.out.println(x));
			}*/
		
		
		/*ArrayList<Employee>m=new ArrayList<>();
		for(Employee m1:e) {
			if(m1.getEmpRole().equalsIgnoreCase("ManaGer")) {
				m.add(m1);
			}
			
			}
		m.forEach(y->System.out.println(y));
		}*/
		
		/*e.forEach(y-> {if(y.getEmpName().startsWith("N")) {System.out.println(y);}});*/
		
			
		/*for(int i=0;i<e.size();i++) {
			if(e.get(i).isEmpIsMale()!=true) {
				System.out.println(e.get(i));
			}
				
			}*/
		
	/*int max=0;
	String index="";
	for(Employee em:e) {
		if(em.getEmpSalary()>max) {
			max=em.getEmpSalary();
			index=em.getEmpName();
		}
	}
	System.out.println(index);
}*/
		
	/*ArrayList<Employee>d=new ArrayList<>();
	
	for(int i=0;i<e.size();i++) {
		if(e.get(i).getEmpId()>=300&& e.get(i).getEmpId()<=400) {
			d.add(e.get(i));
		}
	}
	d.forEach(x->System.out.println(x));*/
		
		/*e.forEach(x->{if(x.getEmpId()>=300&&x.getEmpId()<=400) {System.out.println(x);}});;*/
	}

}
			

	

	


