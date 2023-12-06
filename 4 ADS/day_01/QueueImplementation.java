package day_01;
public class QueueImplementation {
    final int SIZE=3;
    int arr[]=new int[SIZE];
    int front=0;
    int rear=0;
    
    public void push(int value){
        if(rear==SIZE){
            System.out.println("Queue is full..");
            return;
        }
        else{
        arr[rear]=value;
        rear++;
        }
        return;
    }
    
    public void pop(){
        if(front==rear){
            System.out.println("Queue is emptty");
             return;
        }else{
            System.out.println("Popped element is "+arr[front]);
            for(int i=0;i<rear-1;i++){
                arr[i]=arr[i+1];
            }
            if(rear<SIZE){
                arr[rear]=0;
            }
            rear--;//decrement rear
        }
    }
    public static void main(String[] args) {
        QueueImplementation qi=new QueueImplementation();
        qi.push(10);System.out.println("pushed 10");
        qi.push(20);System.out.println("pushed 20");
        qi.push(30);System.out.println("pushed 30");
        qi.push(40);
        
        qi.pop();
        qi.pop();
        
        
        qi.push(50);System.out.println("pushed 50");
        qi.push(60);System.out.println("pushed 60");
//        qi.push(10);
        
        qi.pop();
        qi.pop();
        
        
    }
}
