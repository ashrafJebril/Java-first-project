public class Main {

    public static void main(String[] args) {
        Person ashraf= new Person();
        System.out.println(ashraf.getFullName());
        System.out.println(ashraf.getAge());
        System.out.println(ashraf.getHeight());
        System.out.println("i am eaing "+ashraf.eating());
        System.out.println(ashraf.getInfo());
        Person batool= new Person();System.out.println(batool.counter);

        Person[]myAshrafs={ashraf,batool};
 System.out.println(myAshrafs[0].getFullName());

    }
}
