
public class RunnableMain implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("thread 2: "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("thread 2 foi finalizada :) ");
	}


}
