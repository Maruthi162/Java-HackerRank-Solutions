package OOPS.PracticeProblems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String Title, String Author, String Isbn, boolean IsAvailable){
        title=Title;
        author=Author;
        isbn=Isbn;
        isAvailable=IsAvailable;
    }

    public String getTitle(String title){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    boolean checkAvailability(){
        if(isAvailable){
            return true;
        }
        return false;
    }

    void borrowBook(){
        if(isAvailable==true){
            isAvailable=false;
            System.out.println("Book barrowed successfully");
        }
        else{
            System.out.println("Already barrowed");
        }
        
    }
    void returnBook(){
        if(isAvailable==false){
            isAvailable=true;
            System.out.println("Book returend successfully");
        }
        else{
            System.out.println("You didn't took any book");
        }
        
    }

}

class Member{
    private String name;
    private String memberId;
    private boolean isActive;

    public Member(String Name,String Memberid, boolean IsActive){
        name=Name;
        memberId=Memberid;
        isActive=IsActive;
    }

    public String getName(){
        return name;
    }
    public String getMemberId(){
        return memberId;
    }
    public boolean getisActive(){
        return isActive;
    }

    boolean checkMembershipStatus(){
        if(isActive){
            return true;
        }
        return false;
    }
}

interface LibraryOperations{
    void borrowBook(Member member, Book book);
    void returnBook(Member member, Book book);
}

abstract class Transaction{
    abstract void calculateDueDate();
}
//implements should be used after ectends, first inheritance then implementation
class Library extends Transaction implements LibraryOperations{
    private Book[] books;
    private Member[] members;

    public Library(Book[] Books, Member[] Members){
        books=Books;
        members=Members;
    }

    void calculateDueDate(){
        LocalDate today= LocalDate.now();
        LocalDate dueDate=today.plusDays(7);
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate= dueDate.format(dateTimeFormatter);
        
        System.out.println("Your due date to return the book is "+formattedDate);
    }
    @Override
    public void borrowBook(Member member, Book book){
        if(book.isAvailable() && member.checkMembershipStatus()){
            book.borrowBook();
            calculateDueDate();
        }
        else if(book.isAvailable() && !member.checkMembershipStatus()){
            System.out.println("please check your membership");
        }
        else if(!book.isAvailable() && member.checkMembershipStatus()){
            System.out.println("sorry currently book not available");
        }
    }
    @Override
    public void returnBook(Member member, Book book){
        if(member.checkMembershipStatus() && !book.isAvailable()){
            book.returnBook();
        }
        else if(member.checkMembershipStatus() && book.isAvailable()){
            System.out.println("you haven't borrowed the book yet");
        }
        else if(!member.checkMembershipStatus() && !book.isAvailable()){
            System.out.println("you member id expired pls return book and renew the membership");
        }
    }
    boolean validateInput(String input){
        if(input.toLowerCase().equals("barrow")||input.toLowerCase().equals("return")){
            return true;
        }
        return false;
    }
}

public class LibraryManagement {
    public static void main(String[] args){
        //List of books that are availablr in the library
        Book[] books= {
            new Book("C#","W3Schools","C001",true),
            new Book("Java","JavaTPoint","J001",true),
            new Book("Python","Programmiz","P001",true)
        };

        Member[] members={
            new Member("Maruthi","18F31A0418",true),
            new Member("Govind","18F31A0409",true),
            new Member("Chandra", "18F31A0410", false)
        };

        Library library=new Library(books, members);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Member Id to check membership:");
        String memberId=sc.nextLine();
        Member member=findMemberByMemberId(members, memberId);
        if(member!=null){
            System.out.println("Member status:" +member.checkMembershipStatus());
        }
        else{
            System.out.println("enter a valid member ID!!!!");
        }

        System.out.println("enter isbn to check avoilability: ");
        String isbn=sc.nextLine();

        Book book=findBookByIsbn(books, isbn);
        if(book!=null){
            System.out.println("book available: "+book.isAvailable());
        }
        else{
            System.out.println("enter valid isbn!!!!");
        }        

       int exit=1;
        while(exit!=0){
            System.out.println("Enter 1: Return, 2:Barrow, 0:exit");
            int command=sc.nextInt();
            switch(command){
                case 0 ->{
                    exit=0;
                }
                case 1 ->{
                    library.returnBook(member, book);
    
                }
                case 2->{
                    library.borrowBook(member, book);
                }
            }
        }
       


        sc.close();

    }   

    public static Book findBookByIsbn(Book[] books, String isbn){
        for(Book book:books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
   }

   public static Member findMemberByMemberId(Member[] members, String memberId){
    for(Member member:members){
        if(member.getMemberId().equals(memberId)){
            return member;
        }
    }
    return null;
   }
}
