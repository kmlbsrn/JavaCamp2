
public class Main {

	public static void main(String[] args) {
		
		Student student = new  Student(1,"Kemal","Ba�aran");
		student.Departmen="M�hendislik";
		student.schoolNumber="4143141";
		
		
		
		Instructor instructor = new Instructor(5, "Engin", "Demiro�");
		instructor.branch="Yaz�l�m,Kodlama";
		
		InstructorManager manager = new InstructorManager(); 
	
		manager.log(instructor);
         manager.addLesson();		

      StudentManager manager2 =  new StudentManager();
      manager2.log(student);
      manager2.joinLesson();
	
	}

}
