package com.vinay.librarymanagementsystem;

public class User {
    protected String userId;
    protected String name;
    protected int maxBorrowLimt = 1;
    private LibraryItem borrowedItem;


    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedItem = null;
    }


    public void borrow(LibraryItem item) {
        if (borrowedItem != null) {
            System.out.println(name + "has already borrowed an item .Return it first");
        } else if (item.isAvalilable()) {
            borrowedItem = item;
            item.borrowItem();
        }

    }

    public void returnItem() {
        if (borrowedItem == null) {
            System.out.println(name + "has no borrowed items");
        } else {
            borrowedItem.returnItem();
            borrowedItem = null;
        }
    }

    public void showBorrowItems() {
        if (borrowedItem == null) {
            System.out.println(name + " has no borrowed items");
        } else {
            System.out.println(name + " has borrowed");
            borrowedItem.showDetails();

        }
    }

}
