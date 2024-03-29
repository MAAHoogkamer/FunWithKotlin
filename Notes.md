In Kotlin, the first part of the program is main(). It is the jump off point, it will be executed first.
Without it an error will occur.
```
fun main() {
    // Code
}
```
`fun` = keyword for function<br>
`main` = required name of starting function<br>
`Semicolon ;` is not used at the end of the line.

When program is run, compiler translates Kotlin code into 
code that can be read by JVM (Java Virtaul Machine) which executes it.<br>

<details>
  <summary>Functions and such</summary>

`// For line comments`<br>
`/* */` Multiline comments <br>
`println()` prints a value to the output terminal and adds new line <br>
`print()`  prints without creating new line <br>
`print("${typeTest::class.simpleName}")` check the type of a variable <br>
`readLine()` to tell the program to pause until some type of input is given by the user
<br>
A function can take parameters as such:
```
fun isPangramResult(sentence: String, isAPangram: Boolean) {
        // With multiple parameter inputs, you have to name them. (a: Int b: String)
        if (isAPangram) {
            println("\"$sentence\" is a Pangram")
        } else {
            println("\"$sentence\" is not a Pangram")
        }
    }
```
</details>
<details>
  <summary>Errors</summary>

`Error.kt:2:3: error: unresolved reference: blabla`<br>
First number, 2, means the error is in line 2.<br>
Second number, 3, in which character number on the line.<br>
The text following `error:` describes the error.

</details>
<details>
  <summary>Formatting Conventions</summary>

`Indentation` Code within the body should be indented 4 spaces.<br>
`Comments` When writing a comment, add a space (" ") between // and the start of the comment.<br>
`Curly Brackets` Place the opening curly bracket { on the same line as the function() construct.

</details>
<details>
  <summary>Declaring a Mutable Variable (var)</summary>

```
var variableName: Type = value
```
var = beginning of variable declaration <br>
variableName in camelCase <br>
Type = Datatype <br>
initialize with a value after = <br>
```
var notePlayed: String // declaration
 
notePlayed = "B" // initialization 
``` 

`var textEntries: Int?` declares an empty variable called textEntries that can hold an Int value or null.<br>
The ? at the end of the type (Int?) makes the variable nullable.<br> 
This means that it's possible to assign null to it, as well as any valid Int value.<br>

</details>
<details>
  <summary>Declaring a Immutable Variable (val)</summary>
Immutable variables are denoted by the val keyword and are often referred to as constants in some languages.<br>

```
val variableName: Type = value 
```
</details>
<details>
  <summary>Type Inference</summary>

Type inference indicates that the compiler can infer the type of a declared variable,<br> 
and its data type can be omitted in the declaration.
```
var lightsOn: Boolean = true
```
```
var lightsOn = true // valid declaration
```
Regardless of how a variable is declared,<br> its type cannot change throughout a program.
</details>
<details>
  <summary>Datatypes</summary>
Variables don't need datatypes perse,<br>
functions do need datatypes (and return type!)<br>
String = "This is a string"<br>
Char = "A"<br>
Int = 1<br>
Double = 3.14<br>
// Fun fact

/* A single emoji is made up of Unicode characters.
Thus, it will be interpreted as a String
and must always be wrapped in double quotes:  */

var emoji = "U+1F601"
</details>
<details>
  <summary>String Concatenation and Templates</summary>

```
Concatenation: "Hello, " + variableName + "!"

Template: "Hello, $variableName!" 
```

```
var firstName = "Mike" 
var lastName = "Wazowski" 

println(firstName + " " + lastName) 
// Prints: Mike Wazowski
```
In addition to outputting the result of a concatenated String, we can also store this process in a variable for later use. For example:
```
val userGreeting = firstName + " " + lastName + ", how are you doing today?" 
 
println(userGreeting
// Prints: Mike Wazowski, how are you doing today?
```

</details>
<details>
  <summary>Character Escape Sequences</summary>

```
    \n Inserts a new line
    \t Inserts a tab
    \r Inserts a carriage return
    \' Inserts a single quote
    \" Inserts a double quote
    \\ Inserts a backslash
    \$ Inserts the dollar symbol
```
Use `\` like: <br>
`print("\"May the Force be with you.\" -Star Wars, 1977")`
</details>
<details>
  <summary>Arithmetic Operators</summary>

```
    + addition
    - subtraction
    * multiplication
    / division
    % modulus (divides and gives the remainder)
```
</details>
<details>
  <summary>Arrays</summary>

In Kotlin, arrays are not a native data type, but a mutable collection of similar items which are represented by the Array class.
<br><br>
### There are 2 ways.<br>
Using `arrayOf()`:<br>
```
fun main()
{
    // declaring an array using arrayOf()
    val arrayname = arrayOf(1, 2, 3, 4, 5)
    for (i in 0..arrayname.size-1)
    {
        print(" "+arrayname[i])
    }
    println()
    // declaring an array using arrayOf<Int>
    val arrayname2 = arrayOf<Int>(10, 20, 30, 40, 50)
    for (i in 0..arrayname2.size-1)
    {
        print(" "+arrayname2[i])
    }
}
```
Using the array constructor:<br>
```

fun main()
{
    val arrayname = Array(5, { i -> i * 1 })
    for (i in 0..arrayname.size-1)
    {
        println(arrayname[i])
    }
}
```
The array size is 5, the lambda expression initializes the elements.<br>

### Accessing and modifying arrays

An array in Kotlin is basically a class. Therefore, we can access the data of a class object via its member functions. The get() and set() functions are said to be member functions.

The get() method takes a single parameter—the index of the element and returns the value of the item at that index.<br>
Syntax:<br>
`val x = num.get(0)`<br>
The set() method takes 2 parameters: the index of the element and the value to be inserted.<br>
Syntax:<br>
`num.set(1, 3)`<br>
The above code sets the value of the second element in the array to 3.<br>
<br>
Using the index operator [ ] –<br>

The [ ] operator can be used to access and modify arrays.<br>
To access an array element, the syntax would be:<br><br>
`val x = num[1]`<br>
This will assign the value of the second element in num to x.<br>
<br>
To modify an array element, we should do:<br>
`num[2] = 5;`<br>
This will change the value of the third element in the num array to 5.<br>
<br>
### Traversing Arrays –
Using the for-loop:<br>
```
fun main()
{
    val num = arrayOf<Int>(1, 2, 3, 4, 5)
    num.set(0, 10)
    num.set(1, 6)
    for (i in num.indices)
    {
    println(num[i])
    }
}
```
Using the range of the array:<br>
```
fun main()
{
    val arrayname = arrayOf<Int>(1, 2, 3, 4, 5)
    for (i in 0..arrayname.size-1)
    {
        println(arrayname[i])
    }
}
```
Using the foreach loop:<br>
```
fun main()
{
    val arrayname = arrayOf<Int>(1, 2, 3, 4, 5)
    arrayname.forEach({ index -> println(index) })
}
```
</details>
<details>
  <summary>Flattening Arrays and Lists</summary>

```
fun flattenList(input: List<*>): List<Any?> {
        val result = input.flatMap {
            if (it is Iterable<*>) it.filterNotNull() else listOf(it)
        }
        return result
    }
```
The flatMap function iterates through the list and applies a lambda function to each element.
The lambda function checks if the current element is an Iterable*. If so,
it filters the null values and flattens it, otherwise it wraps the element in.
<br><br>
Iterable is an object which can be looped over or iterated over with the help of a for loop.
Objects like lists, tuples, sets, dictionaries, strings, etc. are called iterables.
In short and simpler terms, iterable is anything that you can loop over.
In this case, is it iterable = a collection within the collection.
<br><br>
</details>
<details>
  <summary>Companion Object</summary>
To directly use a class method without creating a class instance.<br>
Companion object is static and only has access to itself.<br>
Preferable is to use it through a class instance though for re-usability.<br>
</details>
<details>
  <summary>Packages and testing</summary>
Project specific business logic (function code) like classes are put in the `main` of packages. <br>
Tests are put in the `test` folder of the package.<br>
Main and test use the same hierarchy.<br>

assertEquals(expected = false, actual = isAPangram) explicit
assertEquals(false, isAPangram) inexplicit
</details>