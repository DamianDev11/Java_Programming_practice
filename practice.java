public class practice {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("Damian");
        Student s3=new Student(1111);
        Student s4=new Student("Damm");
        System.out.print(s3.roll);
    }
    
}


class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Constructor is called");
    }

    Student(String name){
        this.name=name;
    }

    Student(int roll){
        this.roll=roll;
    }

}