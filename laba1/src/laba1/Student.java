package laba1;

class Student {
	
	private String Name;
	private double MathS, PhysicsS, ProgS;
	

	public Student(String name, int mathS, int physicsS, int progS) {
		super();
		Name = name;
		MathS = mathS;
		PhysicsS = physicsS;
		ProgS = progS;
	}
	
	
	public double Avg() {
		return (MathS+PhysicsS+ProgS)/3;
	}
	
	public Boolean Two() {
		
		return MathS==5 && PhysicsS ==5 && ProgS ==5;
		
	}

	@Override
	public String toString() {
		return "Student Name=" + Name + ", MathS=" + MathS + ", PhysicsS=" + PhysicsS + ", ProgS=" + ProgS + ", AVG =" + Avg() ;
	}
	
	
	
}
