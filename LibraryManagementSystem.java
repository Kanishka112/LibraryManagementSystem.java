import java.util.Scanner;

public class LibraryManagementSystem{
    public static void main(String[] args) {
        char r;
        do{
        System.out.println("---------------Library Managemnt System----------------");
        System.out.println("Press 1 To add book");
        System.out.println("Press 2 To issue a book");
        System.out.println(" press 3 To return a book");
        System.out.println("Press 4 To print Complete issue details");
        System.out.println("Press 5 Exit");
        Scanner obj1= new Scanner(System.in);
        System.out.println("Enter any number");
        int a=obj1.nextInt();
        switch(a){
            case 1:
            Library aa = new Library();
            aa.add();
            break;
            case 2:
            Library bb = new Library();
            bb.issue();
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
            System.out.println("Invalid Number");
        }
        System.out.println("You want to select next option Y/N");
        r=obj1.next().charAt(0);
     } while(r=='y'|| r=='Y');
        if(r=='n'|| r=='N'){
Library z=new Library();
z.exit();
        }
}
}
class Library{
  static  String str,b,date;
   static int a,c;
    void add(){// for adding bbok in library
        System.out.println("Enter book name,prize and book number ");
        Scanner obj2 = new Scanner(System.in);
        String str = obj2.nextLine();
        float Prize = obj2.nextInt();
        int book_number = obj2.nextInt();
        System.out.println("Your deatil is  "+ str + Prize + book_number);

    }
    void issue(){
         Scanner obj3 = new Scanner(System.in);
         System.out.println("Enter a book name ");
     str=obj3.nextLine();
         System.out.println("Enter book id");
     a = obj3.nextInt();
     obj3.nextLine();
       System.out.println("Enter a issue date");
       b= obj3.nextLine();
       System.out.println("Enter Total nunber of book issued");
       c=obj3.nextInt();
       obj3.nextLine();
System.out.println("Enter return book date");
date=obj3.nextLine();
    }
    int getid(){
        return a;
    }
    void ret(){
System.out.println("Enter student name and book id ");
Scanner obj4=new Scanner(System.in);
 String name = obj4.nextLine();
 int book_id =obj4.nextInt();
 if(a==book_id){
System.out.println("Total Details");
System.out.println("Book name:" +Library.str);
System.out.println("Book id:" +Library.a);
System.out.println("Issue date:"+Library.b);
System.out.println("Total number of book issue:"+Library.c);
System.out.println("Return date of book:"+Library.date);
 }
 else{
    System.out.println("wrong id,please enter correct id");
 }
    }
    void detail(){
        System.out.println("Book name:" +Library.str);
        System.out.println("Book id:" +Library.a);
        System.out.println("Issue date:"+Library.b);
        System.out.println("Total number of book issue:"+Library.c);
        System.out.println("Return date of book:"+Library.date);
    }
    void exit(){
        System.exit(0);
    }
}
