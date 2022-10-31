public class SemaforoPrincipal {
	
	public static void main(String[] args) {
		
		Semaforo semaforo_main = new Semaforo();
		
		for (int i=0; i<20; i++) {
			System.out.println(semaforo_main.getCor());
			semaforo_main.mudou();
		}
		
	}
	
}