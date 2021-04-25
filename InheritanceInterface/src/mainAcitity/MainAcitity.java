package mainAcitity;

public class MainAcitity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println("使用介面參數輸入");
		
		UseClass useClass = new UseClass();
		useClass.doRun(new Run() {
			
			@Override
			public boolean warmHands() {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public boolean WarmYourKnees() {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public int runDistance_km() {
				// TODO Auto-generated method stub
				return 10;
			}
		});
		
		
		useClass.doSwim(new Swim() {
			
			@Override
			public boolean warmHands() {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public boolean WarmYourKnees() {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public int swimDistance_km() {
				// TODO Auto-generated method stub
				return 20;
			}
		});
		
	}

}
