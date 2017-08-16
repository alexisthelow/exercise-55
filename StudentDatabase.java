class Student {
	String name;
	int credits;
	double gpa;
}

public class StudentDatabase {
	public static void main(String[] args) {
		Student[] db;
		db = new Student[4];
		
		db[0] = new Student();
		db[0].name = "Esteban";
		db[0].credits = 493;
		db[0].gpa = 12.9;
		
		db[1] = new Student();
		db[1].name = "Dave";
		db[1].credits = 2;
		db[1].gpa = 0.4;
		
		db[2] = new Student();
		db[2].name = "Michelle";
		db[2].credits = 132;
		db[2].gpa = 3.72;
		
		db[3] = new Student();
		db[3].name = "Alexis 'Power Attack' Low";
		db[3].credits = 80085;
		db[3].gpa = 99.98;
		
		for (int i = 0; i < db.length; i++) {
			System.out.println("Name: " + db[i].name);
			System.out.println("\tCredit hours: " + db[i].credits);
			System.out.println("\tGPA: " + db[i].gpa + "\n");
		}
		
		int maxLoc = 0;
		int minLoc = 0;
		
		for (int i = 1; i < db.length; i++) {
			if (db[i].gpa > db[maxLoc].gpa)
				maxLoc = i;
		}
		
		for (int i = 1; i < db.length; i++) {
			if (db[i].gpa < db[minLoc].gpa)
				minLoc = i;
		}
		
		System.out.println(db[maxLoc].name + " has the highest GPA.");
		System.out.println(db[minLoc].name + " has the lowest GPA, and needs to go to clown school.");
	}
}