public class Main {

    public static void main(String[] args) {
        SomePublicClassInKotlin somePublicClassInKotlin = new SomePublicClassInKotlin();
        SomeInternalClassInKotlin someInternalClassInKotlin = new SomeInternalClassInKotlin();

        somePublicClassInKotlin.someMethod();
        someInternalClassInKotlin.someMethod$kotlinpart();


    }
}
