package OgrenciNotSistemi;

public class Student {

    String name;
    String stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;

    //Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()


    public Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(double excamNote1,double verbalNote1 ,double excamNote2,double verbalNote2,double excamNote3,double verbalNote3) {
        if (excamNote1 >=0 && excamNote1 <= 100) {
            this.course1.examNote = excamNote1;
        }
        if (verbalNote1 >=0 && verbalNote1 <= 100) {
            this.course1.verbalNote = verbalNote1;
        }
        if (excamNote2 >=0 && excamNote2 <= 100) {
            this.course2.examNote = excamNote2;
        }
        if (verbalNote2 >=0 && verbalNote2 <= 100) {
            this.course2.verbalNote = verbalNote2;
        }
        if (excamNote3 >=0 && excamNote3 <= 100) {
            this.course3.examNote = excamNote3;
        }
        if (verbalNote3 >=0 && verbalNote3 <= 100) {
            this.course3.verbalNote = verbalNote3;
        }
        isPass();
    }

    void calcAvarage() {
        double course1 = (this.course1.verbalNote*this.course1.verbalNoteEffect) + (1-this.course1.verbalNoteEffect)*(this.course1.examNote);
        double course2 = (this.course2.verbalNote*this.course2.verbalNoteEffect) + (1-this.course2.verbalNoteEffect)*(this.course2.examNote);
        double course3 = (this.course3.verbalNote*this.course3.verbalNoteEffect) + (1-this.course3.verbalNoteEffect)*(this.course3.examNote);

        this.avarage = (course1 +course2 + course3) / 3;
    }

    void isPass() {
        calcAvarage();
       this.isPass = this.avarage >=55;

    }

    void printNote() {
        System.out.println("*".repeat(40));
        System.out.println(this.name +" isimli ögrencimizin ");
        System.out.println(this.course1.name + " dersinin sınav notu : " + this.course1.examNote + " //  Sözlü notu : "+ this.course1.verbalNote);
        System.out.println(this.course2.name + " dersinin sınav notu : " + this.course2.examNote + " //  Sözlü notu : "+ this.course2.verbalNote);
        System.out.println(this.course3.name + " dersinin sınav notu : " + this.course3.examNote + " //  Sözlü notu : "+ this.course3.verbalNote);
        System.out.println("Ortalamanız : " + this.avarage);
        System.out.println("Basarı durumunuz : " + ((this.isPass) ? ("Başarılı") : ("Başarısız")));
        System.out.println("*".repeat(40));
    }

}
