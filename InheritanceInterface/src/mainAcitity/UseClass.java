package mainAcitity;

public class UseClass {
	
	public void doSwim(Swim swim) {
		
		if(swim.WarmYourKnees()&&swim.warmHands()) {
			System.out.println("swim " + swim.swimDistance_km() + " Km");
		}
		
		
	}
	
	public void doRun(Run run) {
		if(run.WarmYourKnees() && run.warmHands()) {
			System.out.println("run " + run.runDistance_km() + " Km");
		}
	}
	
	

}
