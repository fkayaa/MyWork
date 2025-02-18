package ogrenci_not_sistemi;

public class OgrenciNotSistemiApp {

    public static void main(String[] args) {
// Öğretmen nesneleri oluşturulur

        Teacher t1 = new Teacher("Ali Hoca", "MAT");
        Teacher t2 = new Teacher("Ayşe Hoca", "FZK");
        Teacher t3 = new Teacher("Fatma Hoca", "KMY");

        // Ders nesneleri oluşturulur

        Course math = new Course("Matematik", "101", "MAT", 0.2); // Matematik dersi (%20 sözlü etkisi)
        Course physics = new Course("Fizik", "102", "FZK", 0.3); // Fizik dersi (%30 sözlü etkisi)
        Course chemistry = new Course("Kimya", "103", "KMY", 0.4); // Kimya dersi (%40 sözlü etkisi)

        // Derslere öğretmen atanır


        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        // Öğrenci oluşturulur ve derslere kaydedilir

        Student s1 = new Student("Ahmet", "123", math, physics, chemistry);

        // Öğrencinin notları eklenir
        s1.addBulkExamNote(80, 90, 70, 85, 60, 75);

        // Öğrencinin ortalaması hesaplanır ve geçme durumu belirlenir
        s1.isPass();

        // Öğrencinin tüm notları ve durumu yazdırılır
        s1.printNote();
    }
}
