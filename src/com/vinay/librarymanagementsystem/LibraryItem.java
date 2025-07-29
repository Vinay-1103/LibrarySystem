package com.vinay.librarymanagementsystem;
//

public class LibraryItem {
    protected String Itemid;
    protected String title;
    protected boolean isAvalilable;

    public LibraryItem(String Itemid, String title) {
        this.Itemid = Itemid;
        this.title = title;
        this.isAvalilable = true;
    }

    public boolean isAvalilable() {
        return isAvalilable;
    }

    public void borrowItem() {
        if (isAvalilable) {
            System.out.println(title + " borrowed sucessfully");
            isAvalilable = false;
        } else {
            System.out.println(title + "is not avaliable");
        }
    }

    public void returnItem() {
        isAvalilable = true;
        System.out.println(title + " returned sucessfully");
    }

    public void showDetails() {
        System.out.println("Id :" + Itemid + "\nTitle:" + title + "\nAvailble:" + isAvalilable);
    }

    public String getItemid() {
        return Itemid;
    }

    public String getTitle() {
        return title;
    }
}
