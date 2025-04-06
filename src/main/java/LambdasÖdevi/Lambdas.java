package LambdasÖdevi;

import java.util.Arrays;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {

        //Arrays ve List sınıflarını import ediyoruz.
        //
        //Arrays.asList(...) sayesinde hızlıca bir liste oluşturacağız.
        //
        //List<Integer> Java'da bir tamsayı listesi tanımlar.
        List<Integer> mutableNumbers = Arrays.asList(1, 2, 3, 4, 5);

        // Bir tamsayı listesi oluşturuyoruz: [1, 2, 3, 4, 5]
        //
        //Arrays.asList(...) ile bu sayıları kolayca listeye ekliyoruz.
        //
        //Bu liste, başlangıçta sabit uzunluktadır ama öğeleri değiştirilebilir.

        // Liste değiştirilemediği için aşağıdaki gibi yeni liste oluşturmadan:
        // mutableNumbers.replaceAll(n -> n * 2); // Bu lambda'dır

        // Alternatif olarak:
        mutableNumbers = mutableNumbers.stream()
                .map(n -> n * 2)
                .toList(); // Java 16+ için .toList()
        //Lambda ifadesiyle listedeki her elemanı 2 ile çarpıyoruz.
        //
        //n -> n * 2 bir lambda ifadesidir.
        //
        //n: listedeki her bir eleman.
        //
        //n * 2: her eleman 2 ile çarpılır ve sonuç onun yerine yazılır.
        //
        //Sonuç: liste artık [2, 4, 6, 8, 10] olur.

        // Sonuçları yazdır
        // Listeyi ekrana yazdırıyoruz.
        //
        //forEach(...): listedeki her eleman için verilen işlemi uygular.
        //
        //n -> System.out.println(n) lambda ifadesiyle her eleman yazdırılır.
        //
        //System.out.println(n): her elemanı alt alta yazdırır.
        mutableNumbers.forEach(n -> System.out.println(n));
    }
}