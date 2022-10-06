package collection;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[]args) {
		Student s1=new Student("Nagaraj", 14, 423, 'a', true);
		/*s1.setName("Nagaraj");
		s1.setAge(25);
		s1.setId(432);
		s1.setSection('b');*/
		
		Student s2=new Student("Sugu",12,324,'a', false);
		/*s2.setName("Sugug");
		s2.setAge(25);
		s2.setId(234);
		s2.setSection('b');*/
		
		Student s3=new Student("Revanth",15,342,'b', true);
		/*s3.setName("Reva");
		s3.setAge(24);
		s3.setId(342);
		s3.setSection('b');*/
		
		Student s4=new Student("Dinesh",24,727,'c', true);
		/*s4.setName("Sundar");
		s3.setAge(21);
		s3.setId(322);
		s3.setSection('b');*/
		
		ArrayList<Student>sd=new ArrayList<>();
		
		sd.add(s1);
		sd.add(s2);
		sd.add(s3);
		sd.add(s4);
		
		/*for(int i=0;i<sd.size();i++) {
			System.out.println(sd.get(i));
		}*/
		
		/*for(Student s:sd) {
			System.out.println(s);
		}*/
		
		/*sd.forEach(x->System.out.println(x));*/
		
		/*for(int i=sd.size()-1;i>=0;i--) {
			System.out.println(sd.get(i));
		}*/
		
		/*for(int i=0;i<sd.size();i++) {
			if(sd.get(i).getName().contains("a")||sd.get(i).getName().contains("e")||sd.get(i).getName().contains("i")||sd.get(i).getName().contains("o")||sd.get(i).getName().contains("u")) {
				System.out.println(sd.get(i).getName()+" Is Contains Vowels");
				
			}
			else {
				System.out.println(sd.get(i).getName()+" Is not contains Vowels");
			}
		}*/
		
		/*int min=s1.getAge();
		String index="";
		for(Student s:sd) {
			if(s.getAge()<min) {
				index=s.getName();
			}
		}
		System.out.println(index);*/
		
		/*sd.forEach(x->{if(x.getAge()>=18) {System.out.println(x.getName());}});*/
		
		/*sd.forEach(x->{
			if(x.getAge()>=18) {
				System.out.println(x.getName());
			}
			else {
				System.out.println("Invalid");
			}
		});*/
		
		/*sd.forEach(x->{
			if(x.getSection()=='a') {
				System.out.println(x);
			}
			else {
				System.out.println("Invalid");
			}
		});*/
		
		/*ArrayList<Student>female=new ArrayList<>();
		for(Student f:sd) {
			if(f.isMale()!=true) {
				female.add(f);
			}
		}
		female.forEach(x->System.out.println(x));*/
		
		/*ArrayList<Student>name=new ArrayList<>();
		for(Student n:sd) {
			if(n.getName().length()>4) {
				name.add(n);
			}
		}
		name.forEach(y->System.out.println(y));*/
	}

}
