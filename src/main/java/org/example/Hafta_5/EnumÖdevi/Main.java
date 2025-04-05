package org.example.Hafta_5.EnumÖdevi;

import java.util.Scanner;

import static org.example.Hafta_5.EnumÖdevi.Days.showWorkingHours;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir gün girin (örneğin: Monday): ");
        String input = scanner.nextLine();
        showWorkingHours(input);
        scanner.close();

    }

}
