import java.util.*;
public class LibManagement {
    public static void main(String[] args) {
        char r;
        do{
        System.out.println("********************Library Management System****************");
        System.out.println("Press 1 to add a book");
        System.out.println("Press 2 to issue a book");
        System.out.println("Press 3 to return a book");
        System.out.println("Press 4 to print complete issue details");
        System.out.println("Press % to Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number:");
        int num = sc.nextInt();

        switch(num){
            case 1:
                Library aa = new Library();
                aa.add();
                break;
            case 2:
                Library bb = new Library();
                bb.iss();
                break;
            case 3:
                Library cc = new Library();
                cc.ret();
                break;
            case 4:
                Library dd = new Library();
                dd.detail();
                break;
            case 5:
                Library ee = new Library();
                ee.exit();
                break;
            default:
                System.out.println("Invalid number");                    
        }
        System.out.println("If you want to select the next option Y/N");
        r = sc.next().charAt(0);
        while(r == 'y' || r == 'Y');
        if(r == 'n' || r == 'N'){
            Library z = new Library();
            z.exit();
        }
    
    
    }

   
}
class Library {
     static String book_name, issue_date, date;
    static int book_id, num_issued_book;
    void add(){
        System.out.println("Enter book name, price and Book number");
        Scanner add = new Scanner(System.in);
        String bookName = add.nextLine();
        float price = add.nextInt();
        int book_no = add.nextInt();
        
        System.out.println("Your details: "+ book_name + price + book_no);
    
    }

    void iss(){
        Scanner iss = new Scanner(System.in);
        System.out.println("Enter Book name");
        book_name = iss.nextLine();
        System.out.println("Enter Book Id");
        book_id = iss.nextInt();
        iss.nextLine();
        System.out.println("Issue date");
        issue_date = iss.nextLine();
        System.out.println("Total number of books issued");
        num_issued_book = iss.nextInt();
        iss.nextLine();
        System.out.println("Return book date");
        date = iss.nextLine();
    }
    int getId(){
        return book_id;
    }

    void ret(){
        System.out.println("Enter Student name & Book id");
        Scanner ret = new Scanner(System.in);
        String name = ret.nextLine();
        int bookId = ret.nextInt();
        if(book_id==bookId){
            System.out.println("Total details");
            System.out.println("Book name: " + Library.book_name);
            System.out.println("Book Id: " + Library.book_id);
            System.out.println("Issue date: "+ Library.issue_date);
            System.out.println("Number of books issued: "+ Library.num_issued_book);
            System.out.println("Book return date: "+ Library.date);
        } else{
            System.out.println("Wrong Id, Please enter correct Id");
        }

    
    }

    void detail(){
        
        
        System.out.println("Book name: " + Library.book_name);
        System.out.println("Book Id: " + Library.book_id);
        System.out.println("Issue date: "+ Library.issue_date);
        System.out.println("Number of books issued: "+ Library.num_issued_book);
        System.out.println("Book return date: "+ Library.date);
    }
    void exit(){
        System.exit(0);
    }
}
