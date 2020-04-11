class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints;

	//TODO constructor

	public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}
	
	//TODO seters & getters

	public double getAverage() {
		//TODO
		double avg = 0;
		for(Integer poeni : labPoints){
			avg+= poeni;
		}
		return avg / labPoints.size();
	}

	public boolean hasSignature() {
		//TODO
		return labPoints.size() > 8;
	}
}

class Course{
	List<Student> students;

	public Course(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Integer numberOfSignatures(){
		int number = 0;
		for(Student student : students){
			if(student.hasSignature())
				++number;
		}
		return number;
	}
}
