package week3.homework;

public class Students {
	
	public void getStudentInfo() {
		// TODO Auto-generated method stub
		System.out.println("Student name sadiq basha");

	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student id is "+ id);
		System.out.println("Student name is "+ name);
	}
	
	public void getStudentInfo(String email, String phoneNumber)
	{
		System.out.println("student email is :"+ email);
		System.out.println("student Phone number is "+ phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std = new Students();
		std.getStudentInfo();
		std.getStudentInfo(15, "Aravind");
		std.getStudentInfo("sadiqbasheer@gmail.com", "98845949863");
	}

}

