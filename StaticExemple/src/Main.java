import model.AnotherClass;
import model.SomeClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a;
        System.out.println("SomeClass.someStaticField:" + SomeClass.someStaticField);

        int b;
        SomeClass someClass0 = new SomeClass(10);
        SomeClass someClass1 = new SomeClass(11);
        SomeClass someClass2 = new SomeClass(12);
        SomeClass someClass3 = new SomeClass(13);
        SomeClass someClass4 = new SomeClass(14);

        System.out.println("SomeClass.someStaticField:" + SomeClass.someStaticField);


        a = SomeClass.SOME_FINAL_STATIC_FIELD;
        System.out.println("someStaticField: " + SomeClass.someStaticField);
        SomeClass.someStaticField = 15;

        b = someClass0.someField;

        System.out.println("SOME_FINAL_STATIC_FIELD: " + SomeClass.SOME_FINAL_STATIC_FIELD);
        System.out.println("someStaticField: " + SomeClass.someStaticField);
        System.out.println("someField0: " + someClass0.someField);

        System.out.println("someField1: " + someClass1.someField);

        SomeClass resultNotStatic = someClass1.sum1(someClass1, someClass2);


        System.out.println("resultStatic " + resultNotStatic.someField);

        someClass1.sum(someClass2);

        System.out.println("someField1: " + someClass1.someField);

        System.out.println("someField3: " + someClass3.someField);

        SomeClass resultStatic = SomeClass.sum(someClass3, someClass4);

        System.out.println("someField3: " + someClass3.someField);
        System.out.println("resultStatic " + resultStatic.someField);

        SomeClass.SecondClass secondClass = new SomeClass.SecondClass();
        secondClass.age = 32;
        System.out.println(secondClass.age);

        AnotherClass anotherClass = new AnotherClass();
        System.out.println(anotherClass.getAge());

    }
}