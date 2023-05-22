package in.ineuorn.ai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApi {

	public static void main(String[] args) {
	
		//with using list.of,it is immutable in nature .we cannot add the lists .
List<Integer> list1=List.of(4,56,75,156,865);
System.out.println(list1);

//2nd method of list making 
List<Integer> list2=new ArrayList();
list2.add(50);
list2.add(30);
list2.add(20);
list2.add(10);
list2.add(0);
System.out.println(list2);


//3rd method of list making 

List<Integer> list3=Arrays.asList(50,34,234,24,24);
System.out.println(list3);
	}

}
