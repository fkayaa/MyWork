package OgrenciNotSistemi;

public class Main {


    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ümit","Computer");
        Teacher t2 = new Teacher("Banu" ,"Math");
        Teacher t3 = new Teacher("Fatma" , "Science");

        Course c1 = new Course("Computer","001","Computer",0.2);
        Course c2 = new Course("Math","002","Math",0.3);
        Course c3 = new Course("Science","003","Science",0.4);


        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);

        Student s1 = new Student("Ali" ,"888" ,"8",c1,c2,c3);
        s1.addBulkExamNote(90,100,85,100,97,100);



        s1.printNote();




    }


}
