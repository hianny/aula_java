public class Main {
	//static Thread thread1;
	//static Thread thread2;
	
    public static void main(String[] args) throws InterruptedException {
    	ThreadMain thread1 = new ThreadMain();
    	
    	RunnableMain runnable1 = new RunnableMain();
    	Thread thread2 = new Thread(runnable1); 
    	
    	thread1.start();
    	thread1.join(3000);
    	thread2.start();
    	
    } 
}

/*  Runnable lambda =() -> {
	System.out.println("hello");
};

Runnable lambda2 =() -> {
	System.out.println("hello1");
};

// Criação de uma instância de Runnable usando uma classe anônima tradicional
 Runnable traditional = new Runnable() {
    @Override
    public void run() {
        System.out.print("hello");
    }
};

// Executando o Runnable em uma nova thread
thread2 = new Thread(lambda2);
thread1 = new Thread(lambda);

thread1.start();
thread2.start();*/