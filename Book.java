package LabAssignment1B;

public class Book {
    private int pageCount;

    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }
    public int getPageCount(){
        return pageCount;
    }

    Book(int pageCount){
        this.pageCount = pageCount;
    }
}
