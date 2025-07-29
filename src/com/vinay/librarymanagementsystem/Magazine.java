package com.vinay.librarymanagementsystem;
//
public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String Itemid, String title, int issuseNumber) {
        super(Itemid, title);
        this.issueNumber = issuseNumber;
    }

    @Override
    public void showDetails() {
        System.out.println("Magazine Id:" + Itemid + "\nTitle :" + title + "\n IssuseNO" + issueNumber);

    }
}
