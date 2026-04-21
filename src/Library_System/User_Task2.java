package Library_System;

abstract public class User_Task2 {
    private static int totalUsers=0;
    private static int idCount=0;
    private final String userId;
    private String name;
    private String contactInfo;

//    Default Constructor
    public User_Task2() {

        this.userId = generateUniqueId();
        totalUsers++;
    }

    public final static String generateUniqueId() {

        return String.valueOf(++idCount);
    }

    public User_Task2(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User_Task2(User_Task2 other) {
        this.userId = other.userId;
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    public String get_userId() {
        return userId;
    }
    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_contactInfo() {
        return contactInfo;
    }

    public void set_contactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    abstract public void displayDashboard(); //mentioned only definition.Child class has to implement it. This method is generic for all like user,librarian and member as well.
    abstract public void canBorrowBooks(); //mentioned only definition.Child class has to implement it. This method is generic for user and member.
}
