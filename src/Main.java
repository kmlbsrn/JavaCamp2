
public class Main {

	public static void main(String[] args) {
		
		Student student = new  Student(1,"Kemal","Baþaran");
		student.Departmen="Mühendislik";
		student.schoolNumber="4143141";
		
		
		
		Instructor instructor = new Instructor(5, "Engin", "Demiroð");
		instructor.branch="Yazýlým,Kodlama";
		
		InstructorManager manager = new InstructorManager(); 
	
		manager.log(instructor);
         manager.addLesson();		

      StudentManager manager2 =  new StudentManager();
      manager2.log(student);
      manager2.joinLesson();
	
	}

}
