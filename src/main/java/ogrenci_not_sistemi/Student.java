package ogrenci_not_sistemi;

class Student {
    // Öğrenci bilgilerini tutan sınıf
    String name; // Öğrencinin adı
    String stuNo; // Öğrencinin numarası
    Course course1; // Birinci ders
    Course course2; // İkinci ders
    Course course3; // Üçüncü ders
    double average; // Öğrencinin genel not ortalaması
    boolean isPass; // Öğrencinin sınıfı geçip geçmediği

    // Constructor: Öğrencinin özelliklerini başlatır
    Student(String name, String stuNo, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0; // Başlangıç ortalaması
        this.isPass = false; // Başlangıçta sınıf geçme durumu
    }

    // Derslere ait notları toplu olarak ekler
    void addBulkExamNote(int examNote1, int verbalNote1, int examNote2, int verbalNote2, int examNote3, int verbalNote3) {
        if (examNote1 >= 0 && examNote1 <= 100) {
            this.course1.examNote = examNote1; // Birinci ders sınav notu atanır
        }
        if (verbalNote1 >= 0 && verbalNote1 <= 100) {
            this.course1.verbalNote = verbalNote1; // Birinci ders sözlü notu atanır
        }
        if (examNote2 >= 0 && examNote2 <= 100) {
            this.course2.examNote = examNote2; // İkinci ders sınav notu atanır
        }
        if (verbalNote2 >= 0 && verbalNote2 <= 100) {
            this.course2.verbalNote = verbalNote2; // İkinci ders sözlü notu atanır
        }
        if (examNote3 >= 0 && examNote3 <= 100) {
            this.course3.examNote = examNote3; // Üçüncü ders sınav notu atanır
        }
        if (verbalNote3 >= 0 && verbalNote3 <= 100) {
            this.course3.verbalNote = verbalNote3; // Üçüncü ders sözlü notu atanır
        }
    }

    // Öğrencinin derslerden aldığı notlara göre ortalamasını hesaplar
    void calcAverage() {
        double course1Average = (this.course1.verbalNote * this.course1.verbalEffect) +
                (this.course1.examNote * (1 - this.course1.verbalEffect)); // Birinci ders ortalaması
        double course2Average = (this.course2.verbalNote * this.course2.verbalEffect) +
                (this.course2.examNote * (1 - this.course2.verbalEffect)); // İkinci ders ortalaması
        double course3Average = (this.course3.verbalNote * this.course3.verbalEffect) +
                (this.course3.examNote * (1 - this.course3.verbalEffect)); // Üçüncü ders ortalaması

        this.average = (course1Average + course2Average + course3Average) / 3.0; // Genel ortalama
    }

    // Öğrencinin sınıf geçip geçmediğini belirler
    void isPass() {
        calcAverage(); // Önce ortalama hesaplanır
        this.isPass = this.average >= 55; // Ortalama 55 ve üzeriyse geçti kabul edilir
    }

    // Öğrencinin notlarını ve geçip geçmediğini yazdırır
    void printNote() {
        System.out.println("=========================");
        System.out.println(this.course1.name + " Notu: ");
        System.out.println("Sınav: " + this.course1.examNote + ", Sözlü: " + this.course1.verbalNote);
        System.out.println(this.course2.name + " Notu: ");
        System.out.println("Sınav: " + this.course2.examNote + ", Sözlü: " + this.course2.verbalNote);
        System.out.println(this.course3.name + " Notu: ");
        System.out.println("Sınav: " + this.course3.examNote + ", Sözlü: " + this.course3.verbalNote);
        System.out.println("Ortalama: " + this.average); // Genel ortalama yazdırılır
        System.out.println(this.isPass ? "Sınıfı Geçti" : "Sınıfta Kaldı"); // Geçme durumu yazdırılır
    }
}