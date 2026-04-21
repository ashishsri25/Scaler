package Library_System;

public class Member extends User {
    private int borrowedBooksCount;
    private int MAX_BORROW_LIMIT = 5;

    public Member(){
        super();
        borrowedBooksCount=0;
    }

    public Member(String name , String contactInfo){
        super(name,contactInfo);
        borrowedBooksCount=0;
    }

    public Member(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books borrowed are : "+ borrowedBooksCount);
    }


}
