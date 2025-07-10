class Student{
    int rollno;
    String name;
}
class Test{
    public static void main(String[] args) {
        Student ob1=new Student();
        ob1.rollno=155;
        ob1.name="soumya";
        Student ob2;
        ob2=ob1;
        System.out.println(ob1.rollno);
        System.out.println(ob1.name);
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println(ob2.rollno);
        System.out.println(ob2.name);
        
    }
}
