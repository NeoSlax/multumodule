class SomeInternalClassInKotlin {

    internal fun someMethod() {
        print("Hello from ${this.javaClass.simpleName}")
    }
}