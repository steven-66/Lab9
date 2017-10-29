
public class LinkedList<T> {
	protected LLnode<T> previous;
	protected LLnode<T> location;
	protected LLnode<T> head;
	protected LLnode<T> tail;
	protected int num_elements;
	protected boolean found;
	protected int defsize=50;
	public void add(T element) {	
			LLnode<T> newnode=new LLnode<T>(element);
			if(head==null) {
				newnode.setLink(head);
				head=newnode;
				tail=newnode;
			}
			else{
				newnode.setLink(head);
				head=newnode;
			}
			num_elements++;
	
	}
	public void find(T target) {
		location=head;
		while(location!=null) {
			if(location.getInfo().equals(target)) {
				found=true;
				break;
			}
			else {
				previous=location;
				location=location.getLink();
			}
		}
	}
	public boolean remove(T target) {
		find(target);
		if(head==location) {
			head=head.getLink();
			num_elements--;
		}
		else {
			previous.setLink(location.getLink());
			num_elements--;
		}
		return found;
	}

	public boolean is_full() {
		return (num_elements==defsize);
	}
	public void get_elements() {
		LLnode<T> get = head;
		while(get!=null) {
			System.out.println(get.getInfo());
			get=get.getLink();
		}
	}
	

}
class LLnode<T>{
	private LLnode<T> link;
	private T info;
	public LLnode(T info) {
		link=null;
		this.info=info;
	}
	public LLnode<T> getLink() {
		return link;
	}
	public void setLink(LLnode<T> link) {
		this.link = link;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	
}