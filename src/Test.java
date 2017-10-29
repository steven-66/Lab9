import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\emp.txt"));
		String line = null;
		LinkedList<Employee> ll=new LinkedList<Employee>();
		SortedLinkedList sl=new SortedLinkedList();
		ArrayList<Employee> ar= new ArrayList<Employee>();
		CS401ArrayImpl<Employee> a=new CS401ArrayImpl<Employee>();
		while((line=br.readLine())!=null) {
			String[] s=line.split(" ");
			Employee em= new Employee(s[0],Integer.parseInt(s[1]));
			ar.add(em);
		}
		for(int i=0;i<ar.size();i++) {
			sl.add(ar.get(i));
			ll.add(ar.get(i));
		}
		for(int i=0;i<10;i++) {
		a.add(ar.get(i));
		}
		System.out.println(a.add(Where.MIDDLE, 3 , ar.get(10)));
		System.out.println(a.add(Where.FRONT,ar.get(11)));
		System.out.println(a.contains(ar.get(1)));
		sl.get_elements();

	}

}
