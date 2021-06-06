public class QueueUC1 {
		static Node rear = null;
		static Node front =null;
		class Node {
			int data;
			Node next;
			
			public Node(int data) {
				this.data = data;
				this.next = null;
			}
		}
		
		public void insert(int data) {
			Node temp  = new Node (data);
			Node rear = null;
			Node front =null;

			System.out.print( " " + data);
		        if (rear == null)
		        {
		            front = temp;
		            rear = temp;
		        } else {
		            rear.next = temp;
		            rear = temp;
		        }
		    }
		
		public static void main(String[] args){
			QueueUC1 queue = new QueueUC1();
		       
			queue.insert(56);
			queue.insert(30);
			queue.insert(70);
		}
}
