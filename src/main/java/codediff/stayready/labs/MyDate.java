package codediff.stayready.labs;

public class MyDate {
    int month;
    int date;
    int year;


    public MyDate() {
    this.month = 5;
    this.date =4;
    this.year =2001;
}

   public MyDate (int month, int date, int year){
    this.month = month;
     this.date = date ;
     this.year = year;
   }

    public String toString()
    {
        String s = month + "/" + date + "/" +  year;
        return s;
    }
    public void setDate(int d, int m , int y){
      date = d;
      month = m;
      year = y;
    }
}


