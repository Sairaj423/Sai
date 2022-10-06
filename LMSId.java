package collection;

import java.util.ArrayList;

public class LMSId {
	public static void main(String[]args) {
		ArrayList<Integer>lms=new ArrayList<>();
		lms.add(423);
		lms.add(727);
		lms.add(873);
		lms.add(777);
		lms.add(874);
		lms.set(2, 100);
		lms.remove(0);
		
		for(int i=0;i<lms.size();i++) {
			System.out.println(lms.get(i));
		}
		
		/*for(Integer id:lms) {
			System.out.println(id);
		}*/
		
//		lms.forEach(x->System.out.println(x));
		
		/*for(int i=0;i<lms.size();i++) {
			if(lms.get(i)%2==0) {
				System.out.println(lms.get(i)+"is Even");
			}
			else {
				System.out.println(lms.get(i)+"is Odd");
			}
		}*/
		/*int max=0;
		for(Integer id:lms) {
			if(id>=max) {
				max=id;
				
			}
		}
		System.out.println(max);*/
		
		/*int min=lms.get(0);
		for(int i=0;i<lms.size();i++) {
			if(lms.get(i)<=min) {
				min=lms.get(i);
			}
		}
		System.out.println(min);
		}*/

		
	}
}


