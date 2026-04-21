package Library_System;

public class Librarian extends User_Task2 {
    private String employeeNumber;

    public Librarian(String name , String contactInfo , String employeeNumber) {
        super(name , contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("EmployeeNumber: "+employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void onBorrow() {}

    @Override
    public void returnBorrow() {}

    public void addNewBook() {

    }

    public void removeBook() {

    }
}
