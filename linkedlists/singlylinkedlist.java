//package linkedlists;
//import java.util.*;

class LL{
    private Node head;
    private Node tail;
    private int size;

public LL(){
    this.size=0;
}

public void insert(int value,int index){
    if(index==0){
        insertFirst(value);
        return;
    }
    if(index==size){
        insertLast(value);
        return;
    }
    Node temp=head;
    for(int i=0;i<index;i++){
        temp=temp.next;

    }
    Node node =new Node(value,temp.next);
    temp.next=node;
    size++;

}


public void insertLast(int value){
    if(tail==null){
        insertFirst(value);
        return;
    }
    Node node=new Node(value);
    tail.next=node;
    tail=node;
    size++;
}


public void insertFirst(int value){
    Node node=new Node(value);
    node.next=head;
    head=node;

    if(tail==null){
        tail=head;
    }
    size+=1;
}




public int deletefirst(){
    int val=head.value;
    head=head.next;
    if(head==null){
        tail=null;
    }
    size--;
    return val;
}

public int deletelast(){
    Node secondlast=get(size-2);
    int val=tail.value;
   tail=secondlast;
  tail.next=null;
   return val;


}


public int delete(int index){
     if(index==0){
        return deletefirst();
     }
     if(index==size-1){
        return deletelast();
     }
   Node prev=get(index-1);
   int val=prev.next.value;
   prev.next=prev.next.next;
   return val;
}


public Node get(int index){
    Node node =head;
    for(int i=0;i<index;i++){
        node=node.next;

    }
    return node;
}

public void reversedisplay(){
    Node temp=head;
    if(temp==null){
        return;
    }
    head=head.next;
    reversedisplay();
    System.out.print(temp.value+"->");
    // while(temp!=null){
    //     System.out.print(temp.value+"->");
    //     temp=temp.next;
    // }
   // System.out.println("END");
}

public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.value+"->");
        temp=temp.next;
    }
    System.out.println("END");
}
     
    private class Node{
        private int value;
        private Node next;
    
    public Node(int value){
        this.value=value;
       
    }

    public Node(int value,Node next){
        this.value=value;
        this.next=next;
    }
    }

}









public class singlylinkedlist {
    public static void main(String[] args) {
          LL list=new LL();
        //   list.insertFirst(3);
        //   list.insertFirst(2);
        //   list.insertFirst(8);
        //   list.insertFirst(17);
        //   list.display();

        // list.insertLast(3);
        //   list.insertLast(2);
        //   list.insertLast(8);
        //   list.insertLast(17);
        //   list.insert(77,3);
        //   list.display();
        //   list.deletefirst();
        //   list.display();
        //   int p=list.deletelast();
        //   System.out.println(p);
        //   list.display();



          list.insertLast(3);
          list.insertLast(2);
          list.insertLast(8);
          list.insertLast(17);
          list.display();
         list.reversedisplay();

    }
}