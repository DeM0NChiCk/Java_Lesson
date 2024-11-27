package model;

public class SomeClass {

    public static int someStaticField = 3;
    public final static int SOME_FINAL_STATIC_FIELD = 10;
    public int someField;

    public SomeClass(int value){
        this.someField = value;
    }

    static {
        someStaticField = 8;
    }

    public void sum(SomeClass other){
        this.someField += other.someField;
    }

    public static SomeClass sum(SomeClass a, SomeClass b){
        return new SomeClass(a.someField + b.someField);
    }

    public SomeClass sum1(SomeClass a, SomeClass b){
        return new SomeClass(a.someField + b.someField);
    }

}
