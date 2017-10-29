

public class SortedLinkedList extends LinkedList<Employee> {
	protected LLnode<Employee> next;
	public void add(Employee target) {
		if(head==null) {
			super.add(target);
		}
		else {
			location=head;
			if(target.compareTo(head.getInfo())<0) {
				super.add(target);
				return;
			}
			if(target.compareTo(tail.getInfo())>0) {
				LLnode<Employee> newnode= new LLnode<Employee>(target);
				tail.setLink(newnode);
				tail=newnode;
				num_elements++;
				return;
			}
			if(target.compareTo(head.getInfo())>0) {
				while(location!=null) {
					previous=location;
					location=location.getLink();
					next=location.getLink();
					if(target.compareTo(location.getInfo())>0 && target.compareTo(next.getInfo())<0) {
						LLnode<Employee> newnode=new LLnode<Employee>(target);
						location.setLink(newnode);
						newnode.setLink(next);
						num_elements++;
						return;
					}
					else {
						if(target.compareTo(location.getInfo())<0){
							LLnode<Employee> newnode=new LLnode<Employee>(target);
							previous.setLink(newnode);
							newnode.setLink(location);
							num_elements++;
							return;
						}
					}		
				}
			}
		}
	}
}