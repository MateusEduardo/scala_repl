case class Person(name: String, age: Int)

val mikaelNew = new Person("Mikael", 41)
// 'new' is optional
val mikael = Person("Mikael", 41)

// == compares values, not references
mikael == mikaelNew

// == is exactly the same as .equals
mikael.equals(mikaelNew)

val name = mikael.name

// a case class is immutable. The line below does not compile:
//mikael.name = "Nicolas"
// you need to create a new instance using copy
val nicolas = mikael.copy(name = "Nicolas")