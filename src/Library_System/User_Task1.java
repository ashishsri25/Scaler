package Library_System;

public class User_Task1 {
    private String userId;
    private String name;
    private String contactInfo;

//    Default Constructor
    public User_Task1() {

        this.userId = generateUniqueId();
    }

    private String generateUniqueId() {

        return "0";
    }

    public User_Task1(String name, String contactInfo) {
//        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User_Task1(User_Task1 other) {
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
}
