
public class ThreadMain extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=10;i>0;i--) {
			System.out.println("thread 1: "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("thread 1 foi finalizada :) ");
	}

}
