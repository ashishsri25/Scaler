package Library_System;

public class Test_task1and2 {
    public static void main(String[] args) {
        User_Task1and2 user1 = new User_Task1and2();
        User_Task1and2 user2 = new User_Task1and2("Ashish Srivastava" , "9090");
        User_Task1and2 user3 = new User_Task1and2(user2);
        user1.set_name("Akansha");
        user1.set_contactInfo("123");
        System.out.println(user1.get_userId());
        System.out.println(user2.get_name());
        System.out.println(user2.get_contactInfo());
        System.out.println(user2.get_userId());
        System.out.println(user1.get_name());
        System.out.println(user1.get_contactInfo());
        System.out.println(user3.get_name());
        System.out.println(user3.get_contactInfo());
//
    }
}
