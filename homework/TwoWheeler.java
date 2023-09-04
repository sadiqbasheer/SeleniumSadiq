package homework;

public class TwoWheeler {
	
	int noOfTwoWheels = 2;
	short noOfMirrors = 2;
	long cassiNumber =	121212363l;
	boolean isPunctured = false;
	String bikeName = "Yamaha";
	double runningKM = 10000d;
	
	public void displayTwoWheeler() {
		// TODO Auto-generated method stub
			System.out.println("am in twowheeler");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler tw = new TwoWheeler();
		System.out.println(tw.noOfTwoWheels);
		System.out.println(tw.noOfMirrors);
		System.out.println(tw.cassiNumber);
		System.out.println(tw.isPunctured);
		System.out.println(tw.bikeName);
		System.out.println(tw.runningKM);
	}

}
