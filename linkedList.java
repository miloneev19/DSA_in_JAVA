
public class linkedList {
	private node head;
    private static class node {    //this class is acting like a struct(structure) in c++
    	private int data;
    	private node next;
    	
    	node(int data)
    	{
    		this.data=data;
    		this.next=null;
    	}
    }
    
    public void printLinkedList()
    {
    	node temp=head;
    	while(temp!=null)
    	{
    		System.out.print(temp.data + "-->");
    		temp=temp.next;
    	}
    	System.out.print("null");
    }
    
       
	public static void main(String[] args) {
         linkedList obj = new linkedList();
         obj.head = new node(10);
         node secondNode = new node(20);
         node thirdNode = new node(30);
         node fourthNode = new node(40);
         obj.head.next=secondNode;
         secondNode.next=thirdNode;
         thirdNode.next=fourthNode;
         
        obj.printLinkedList();

	}

}
