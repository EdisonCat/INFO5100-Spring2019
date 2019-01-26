public class Course {
    private String name="Java";
    private Student students []=new Student[10];
    int numberOfStudent=0;
    void getStudents(){
        if(numberOfStudent>0) {
            for (int i = 0; i < numberOfStudent; i++) {
                System.out.println("Student Name: " + students[i].name);
                System.out.println("Student ID: " + students[i].id);
            }
        }
        else{
            throw new RuntimeException("No student");
        }
    }
    boolean ifFull(){
        if(numberOfStudent<10){
            return false;
        }
        return true;
    }
    void registerStudent(Student student) {
        if (numberOfStudent < 10) {
            for (int i = 0; i < numberOfStudent; i++) {
                if (this.students[i].id == student.id) {
                    throw new RuntimeException("Student id "+student.id+ " has been registered in this course.");
                }
            }
            this.students[numberOfStudent]=student;
            this.numberOfStudent++;
        }
        else{
            throw new RuntimeException("This course is full.");
        }
    }

    public static void main(String args[]){
        /*
        Repeat registration situation

        Student student=new Student("Edison","1");
        Student student1=new Student("Edison","2");
        Student student2=new Student("Edison","3");
        Student student3=new Student("Edison","4");
        Student student4=new Student("Edison","5");
        Student student5=new Student("Edison","6");
        Student student6=new Student("Edison","7");
        Student student7=new Student("Edison","8");
        Student student8=new Student("Edison","9");
        Student student9=new Student("Edison","9");
        Course course=new Course();
        course.registerStudent(student);
        course.registerStudent(student1);
        course.registerStudent(student2);
        course.registerStudent(student3);
        course.registerStudent(student4);
        course.registerStudent(student5);
        course.registerStudent(student6);
        course.registerStudent(student7);
        course.registerStudent(student8);
        course.registerStudent(student9);
        course.getStudents();
        System.out.println("number of students: "+course.numberOfStudent);
        System.out.println("course if full: "+course.ifFull());
        */

        /*
        Full course situation

        Student student=new Student("Edison","1");
        Student student1=new Student("Edison","2");
        Student student2=new Student("Edison","3");
        Student student3=new Student("Edison","4");
        Student student4=new Student("Edison","5");
        Student student5=new Student("Edison","6");
        Student student6=new Student("Edison","7");
        Student student7=new Student("Edison","8");
        Student student8=new Student("Edison","9");
        Student student9=new Student("Edison","10");
        Student student10=new Student("Edison","11");
        Course course=new Course();
        course.registerStudent(student);
        course.registerStudent(student1);
        course.registerStudent(student2);
        course.registerStudent(student3);
        course.registerStudent(student4);
        course.registerStudent(student5);
        course.registerStudent(student6);
        course.registerStudent(student7);
        course.registerStudent(student8);
        course.registerStudent(student9);
        course.registerStudent(student10);
        course.getStudents();
        System.out.println("number of students: "+course.numberOfStudent);
        System.out.println("course if full: "+course.ifFull());
        */

        /*
        normal situation
         */
        Student student=new Student("Edison","11");
        Course course=new Course();
        course.registerStudent(student);
        course.getStudents();
        System.out.println("number of students: "+course.numberOfStudent);
        System.out.println("course if full: "+course.ifFull());
        String str[]=new String[3];
    }
}
