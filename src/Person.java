public class Person {


    static int counter=0;
    int count=0;
    String firstName ="ashraf" ;
    String lastName ="jibreel";
    int dateOfBirth= 1988;
    String nationality="ghazawi";
    String address ="arjan";
    String city ="amman";                             ;
    int weight =104;
    int height =190;
    boolean isMale =false;

    public Person(){
        counter ++;
    }
    public Person(int c , String f, String l, String a ,int d , String n ,String cit,int w , int h , boolean ism){
        counter=c +1;
        firstName=f;
        lastName=l;
        address=a;
        dateOfBirth=d;
        nationality=n;
        city=cit;
        weight=w;
        height=h;
        isMale=ism;

    }
    public String getFullName(){
      return firstName+lastName ;
    }
    public double getHeight(){
        return height * 2.3;
    }
    public int getAge(){
        return 2019 - dateOfBirth ;
    }
    public int eating(){
        return height+1;
    }
    public String getInfo(){
        return firstName +" "+ lastName+" " + address + " "+ dateOfBirth +" " + nationality+" " + city+" " + weight+ " " + height+" " + isMale;
    }

}
