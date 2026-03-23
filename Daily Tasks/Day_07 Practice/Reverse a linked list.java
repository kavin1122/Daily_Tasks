import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data=d;
        next=null;
    }
}
public class Main {
    static Node rev(Node head) {
        Node prev=null;
        Node curr=head;
        while(curr!=null) {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++) {
            int a=sc.nextInt();
            Node node=new Node(a);
            if(head==null) {
                head=tail=node;
            } else { 
                tail.next=node;
                tail=node;
            }
        }
        head=rev(head);
        while(head!=null) {
            System.out.print(head.data+" -> ");
            head=head.next;
        }
        System.out.print("Null");
    }
}