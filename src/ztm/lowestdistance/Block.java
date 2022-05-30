package ztm.lowestdistance;

public class Block {
    //?Pratik Sherdiwala (Codelytics)
    int id;
    boolean office;
    boolean store;
    boolean school;

    Block(int id, boolean office, boolean store, boolean school) {
        this.id = id;
        this.office = office;
        this.school = school;
        this.store = store;
    }
}
