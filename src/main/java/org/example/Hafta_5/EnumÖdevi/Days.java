package org.example.Hafta_5.EnumÖdevi;

public enum Days
{
    SUNDAY("Kapalı"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("10:00 - 14:00");

    private final String workingHours;

    Days(String workingHours) {
        this.workingHours = workingHours;
    } //constructor !!!

    public String getWorkingHours() {
        return workingHours;
    }

    // Kullanıcının girdiği güne göre çalışma saatini gösteren metot
    public static void showWorkingHours(String inputDay) {
        try {
            Days day = Days.valueOf(inputDay.toUpperCase());
            System.out.println(day.name() + " günü çalışma saatleri: " + day.getWorkingHours());
        } catch (IllegalArgumentException e) {
            System.out.println("Geçersiz gün girdiniz. Lütfen tekrar deneyin.");
        }
    }

}
