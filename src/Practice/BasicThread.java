package Practice;

/*class Task extends Thread {
    int num;
    public Task(int num){
        this.num = num;
    }
    public void run(){
       for(int i=0; i<5; i++){
           try{
               System.out.println("Thread "+num+":" +i);
               Thread.sleep(100);
           }
          catch (InterruptedException e){
               e.printStackTrace();
          }
       }
    }
}

public class BasicThread{
    public static void main(String[] args){
        Task t1 = new Task(1);
        Task t2 = new Task(2);

        t1.start();
        t2.start();
    }
}*/

/*class AnonymousClassThread{
    public static void main(String[] args){
        Runnable r = new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<3;i++){
                try{
                    System.out.println("Hello from anonymous thread");
                    Thread.sleep(1000);
                 }catch (InterruptedException e){
                    e.printStackTrace();
                }
                }
            }
        };

        Thread t = new Thread(r);
        t.start();
    }
}*/

/*class LambdaExpressionThread{
    public static void main(String[] args){
        Runnable r=()->{
            for(int i=0;i<5;i++){
                try {
                    System.out.println(i);
                    Thread.sleep(200);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}*/




