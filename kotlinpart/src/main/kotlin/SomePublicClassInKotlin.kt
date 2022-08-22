class SomePublicClassInKotlin {

    fun someMethod() {
        println("Hello from ${this.javaClass.simpleName}")
    }
}