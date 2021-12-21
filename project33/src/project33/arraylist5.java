package project33;
import java.util.ArrayList;
import java.util.Scanner;
public class arraylist5 {
	
	
	public static void main(String aa[]) 
    {
//    Object //parent of all the classes



        ArrayList<books> list=new ArrayList<>();//Object
        books b1=new books("spy of tomorrow", "wilber", 300 , 1234 );
        list.add(b1);
        

        
        for(books b : list)
        {
        System.out.println(b.bookname+" "+b.author+" "+b.id+" "+b.price);
        }
        }}
        class books{
        String bookname,author;
        int id,price;
        public books(String bookname, String author, int id, int price) {
        super();
        this.bookname = bookname;
        this.author = author;
        this.id = id;
        this.price = price;
        }
        }


