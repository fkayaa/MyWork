package ogrenci_not_sistemi;


class Course {
    // Ders bilgilerini tutan sınıf
    String name; // Ders adı
    String code; // Ders kodu
    String prefix; // Dersin alanı/bölümü
    int examNote; // Sınav notu
    int verbalNote; // Sözlü notu
    double verbalEffect; // Sözlü notunun derse etkisi
    Teacher teacher; // Dersi veren öğretmen

    // Constructor: Dersin özelliklerini başlatır
    Course(String name, String code, String prefix, double verbalEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbalEffect = verbalEffect;
        this.examNote = 0; // Başlangıç sınav notu
        this.verbalNote = 0; // Başlangıç sözlü notu
    }

    // Ders için öğretmen atama metodu
    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher; // Öğretmen atanır
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }
    }

    // Dersin öğretmenini yazdıran metot
    void printTeacher() {
        if (teacher != null) {
            System.out.println("Dersin Öğretmeni: " + teacher.name);
        } else {
            System.out.println("Bu derse henüz bir öğretmen atanmadı.");
        }
    }
}
