package com.vinay.librarymanagementsystem;

public class Library implements BookOperations {
    private Book[] books=new Book[10];
    int bookcount=0;

    @Override
    public void addBooks(Book book) {
        if(bookcount<books.length){
            books[bookcount++]=book;
            System.out.println("Book is added "+book);
        }
        else{
            System.out.println("Library is full");
        }
    }

    @Override
    public void removeBook(String itemId) {
        for (int i=0;i<bookcount;i++){
            if(books[i].getItemid().equals(itemId)){
                books[i]=books[--bookcount];
                books[bookcount]=null;
                System.out.println("Book with Id"+ itemId+" has been removed ");
                return;
            }
        }
            System.out.println("Book not found");
    }

    @Override
    public void displayBooks() {
        System.out.println("\nList of Books in the Library ");
        for (int i=0;i<bookcount;i++){
            System.out.println(books[i].toString());
        }
    }
}
