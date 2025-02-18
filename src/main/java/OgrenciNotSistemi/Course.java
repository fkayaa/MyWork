package OgrenciNotSistemi;

public class Course {

    String name;
    String code;
    String prefix;
    double examNote;
    double verbalNote;
    double verbalNoteEffect;
    Teacher teacher;

    public Course(String name, String code, String prefix, double verbalNoteEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.verbalNote = 0;
        this.verbalNoteEffect = verbalNoteEffect;

    }

    public Course() {
    }

    public void addTeacher(Teacher teacher) {
        this.teacher =teacher;
    }
    void printTeacher() {
        System.out.println(teacher.name);
    }





}
