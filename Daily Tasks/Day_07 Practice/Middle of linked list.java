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
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++) {
            int var=sc.nextInt();
            Node node=new Node(var);
            if(head==null) {
                head=tail=node;
            } else {
                tail.next=node; 
                tail=node;
            }
        }
        Node a=head,b=head;
        while(b!=null&&b.next!=null) {
            a=a.next;
            b=b.next.next;
        }
        System.out.print(a.data);
    }
}