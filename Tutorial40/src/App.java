
class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
	}
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Temp temp = new Temp()){
			
		} catch (Exception e) {
			System.out.println("Hello");
		}
		
		
	}

}
