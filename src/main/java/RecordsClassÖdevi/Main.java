package RecordsClassÖdevi;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("melek" , "ceviz " , 67);
        Student student2 = new Student("fatma" , "ceviz " , 40);
        Student student3 = new Student("sude" , "ceviz " , 50);
        //Student sınıfını kullanarak birkaç öğrenci oluşturun ve öğrencilerin bilgilerini ekrana yazdırın.
        //
        //Student sınıfının hashCode ve equals metodlarının doğru şekilde çalıştığından emin olun.
        System.out.println(student.name() + " " + student.surname()+ student.number()+ " "+ "\n" + student2.name()+" "+ student2.surname() + " " + student2.number()+ " " + "\n" + student3.name()+" "+student3.surname()+" "+ student3.number()+"\n" );
        if(student.equals(student2)){
            System.out.println("içerikler eşit ");
        }
        else{
            System.out.println("içerikler eşit değil");
        }
        // equals ve hashCode kontrolleri
        System.out.println("\nstudent1 equals student3? " + student.equals(student3));
        System.out.println("student1 hashCode: " + student.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());
    }
}
