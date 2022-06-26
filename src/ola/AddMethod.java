package ola;

public class AddMethod {
    //?Pratik Sherdiwala (Codelytics)
    void add(String string){
        System.out.println(string);
    }

    void add(Object string){
        System.out.println(string);
    }

    public static void main(String[] args) {
        new AddMethod().add(null);
    }
}
