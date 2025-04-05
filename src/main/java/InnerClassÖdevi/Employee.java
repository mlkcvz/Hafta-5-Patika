package InnerClassÖdevi;

public  class Employee
{
    private String employeeName;
    private String employeeSurname;
    private ContactInfo contactInfo;


    public Employee( String employeeName ,String employeeSurname , int phone , String email) {
        this.employeeSurname = employeeSurname;
        this.employeeName = employeeName;
        this.contactInfo = new ContactInfo(phone, email);
    }

    public String getEmployeeName(String name) {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname(String surname) {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }


    public static class ContactInfo
    {

        private String phone;
        private String email;

        public ContactInfo(int phone, String email) {
        }


        public void getContactInfo(String phone, String email)
        {
            this.phone= phone;
            this.email=email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail(String phone) {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void displayContactInfo() {
            System.out.println("Telefon: " + phone);
            System.out.println("E-posta: " + email);
        }
    }

    // Method to display full employee info
    public void displayEmployeeInfo() {
        System.out.println("Çalışan: " + employeeName + " " + employeeSurname);
        contactInfo.displayContactInfo();
    }

}
