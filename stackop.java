import java.io.*;

class stack{
    private int[] arr;
    private int size;
    private int top;
    
    public stack(int size){
        arr = new int[size];
        this.size=size;
        top=-1;
    }
    public boolean isFull(){
        if(top==size-1){
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }
    public void push(int data){
        if(isFull()){
            return;
        }
        top++;
        arr[top]=data;
    }
    public void pop(){
        if(isEmpty()){
            return;
        }
        int data=arr[top];
        top--;
        System.out.println("popped element = "+data+"");
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public int peek(){
        isEmpty();
        return arr[top];
    }
}
public class stackop{
public static void main(String args[]){
    try{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
            int choice;
            int n=7;
            stack s1=new stack(n);
            while(true){
            System.out.println("Choices");
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.PEEK");
            System.out.println("4.ISFULL()");
            System.out.println("5.ISEMPTY()");
            System.out.println("6.DISPLAY ELEMENTS");
            System.out.println("7.EXIT");
            System.out.println("Enter Your Choice");
            choice=Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    s1.push(Integer.parseInt(br.readLine()));
                    break;
                case 2:
                    s1.pop();
                    break;
                case 3:
                    s1.peek();
                    break;
                case 4:
                    s1.isFull();
                    break;
                case 5:
                    s1.isEmpty();
                    break;
                case 6:
                    s1.display();
                    break;
                case 7:
                    System.out.println("Exiting.............");
                    return;
            }
        }
        }catch(IOException e){
        System.out.println("Invalid input");
        }catch(NumberFormatException e){
        System.out.println("Invalid input 2");
    }
}
}