package ola;

interface Demo{
    void add();
}

public class StaticMethod {
    //?Pratik Sherdiwala (Codelytics)
    public static void main(String[] args) {

        try {
            System.out.println("starting");
            return;
        } catch (Exception e) {
            System.out.println("catch");
            return;
        } finally {
            System.out.println("i m finally");
        }
    }
}
