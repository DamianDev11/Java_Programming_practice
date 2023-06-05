public class constructor {
    public static void main(String args[]){
    Student s1=new Student();
    Student s2=new Student("Damian");
    Student s3=new Student(123); 
    Student s4=new Student("Dam");
    System.out.print(s2.name);
    }
}


class Student{
    String name;
    int roll;
    Student(){
        System.out.print("Constructor is called");
    }

    Student(String name){
        this.name=name;
    }
    
    Student(int roll){
        this.roll=roll;
    }
}

