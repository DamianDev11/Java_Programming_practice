public class statickeyword {
    public static void main(String args[]){
        Student s1=new Student();
        s1.schoolName="damn";
        Student s2=new Student();
        //s2.schoolName="sjs";
        System.out.println(s1.schoolName);
        System.out.print(s2.schoolName);
    }
    
}

class Student{
    static int returnprecentage(int maths,int phy,int chem){
        return (maths+phy+chem)/3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}