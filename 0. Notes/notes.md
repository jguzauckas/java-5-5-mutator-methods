# Mutator Methods

In Unit 5 Section 1, we discussed how both class and instance variables are almost always kept `private` to maintain the security of the values. In Unit 5 Section 4 we dove into the world of **accessor methods** to give the user a way of accessing information. Importantly though, we hadn't given them a way to modify these variables, which is where **mutator methods** come into play. This section dives into what mutator methods are and do.

---

## Method Information

Since mutator methods are **methods**, we need to generally understand methods in order to understand mutator methods. Here is a general header for a method that helps us to see the components:

```java
public/private type methodName(parameter1type parameter1, parameter2type parameter2, etc.) {
    // Not shown.
}
```

In this header, we have a few components, which we can break down:
- `public/private` --> Each method can be assigned either `public` or `private` (never both), indicating how accessible it is. Mutator methods will always be `public`.
- `type` --> This is where we designate **`return` type**, essentially preemptively stating what kind of information the method is going to send back when it is done, if any. This can be any of our data types like `int`, `double`, `boolean`, or `String`, or it can send no information back, in which case we write the keyword `void` in that spot. Mutator methods will have no `return` type for the most part, since they change the value, not get the value like accessor methods did. Due to this, we will be using the keyword `void` instead of a type.
- `methodName` --> This is the nickname to refer to this method by (like `substring`). The general rule for mutator methods, since they **set** information, is to call them `setVariableName`, so if the variable was `age`, we would call it `setAge`.
- `(parameter1type parameter1, parameter2type parameter2, etc.)` --> Inside the parentheses, we have the **parameter list**. This is how a user sends information for the method to use (kind of like when you send a starting and ending index for `substring`). You are essentially declaring variables for this, so each needs a data type and a nickname to be referred to as, and would be separated by commas. You can have zero, one, or many parameters, as many as you need. Since mutator methods are trying to update a variable's value, we will use the parameter list to have the user give us a value. This means we will need a parameter that shares the same type as the variable we are working on (if we want to modify an `int` variable, we would need to have our parameter be an `int`).

---

## Basic Mutator Methods

By definition, a mutator method changes the values of instance variables or class variables. Here is an example of a mutator method from the `Person.java` file:

```java
public void setName(String n) {
    name = n;
}

```

This mutator method is working on the `name` instance variable in our `Person` class. It takes in a `String` value as a parameter and gives is the nickname `n`, so when we are inside the method, we can set our instance variable `name` to whatever value `n` represents with `name = n`. This is the simplest kind of mutator method, as it just takes the new value and replaces the old one.

Here are a few examples of using this mutator from the `NotesMutator1.java` file, where we use the accessor `getName` to print out `name` and watch what happens to it:

```java
Person person1 = new Person("Mr. G", 25);
System.out.println(person1.getName());

person1.setName("John");
System.out.println(person1.getName());

person1.setName("Guzauckas");
System.out.println(person1.getName());
```

This prints out each `name` over time, producing the following output:

```
Mr. G
John
Guzauckas
```

---

## Restrictive Mutator Methods

Sometimes though, we should be more restrictive. Names can be anything, but can an age be any number? Negative numbers wouldn't make sense for an age, and neither would numbers that are too large (the oldest living person ever verified was 122 years old). So we can say that age should be limited between 0 and 125, inclusive, to be safe. A good mutator method for `age` then, would check the value it is being provided to decide if it is appropriate to save to the variable, and skip over saving the information if it is not. Here is an example of the mutator for `age` from the `Person.java` file:

```java
public void setAge(int a) {
    if (a >= 0 && a <= 125) {
        age = a;
    }
}
```

The `if` statement is set up using the user input parameter `a` to check if it is appropriate (is it both greater than or equal to 0 and less than or equal to 125). If it meets those criteria, it sets the variable. Otherwise, it just doesn't, and the old value is maintained. This is a silent process!

We can see this in action from the `NotesMutator2.java` file, where we use the accessor `getAge` to print out `age` and watch what happens to it:

```java
Person person1 = new Person("Mr. G", 25);
System.out.println(person1.getAge());

person1.setAge(26);
System.out.println(person1.getAge());

person1.setAge(-5);
System.out.println(person1.getAge());

person1.setAge(130);
System.out.println(person1.getAge());

person1.setAge(25);
System.out.println(person1.getAge());
```

Here, we can expect the `age` to change from `25` to `26`, but then fail to change to `-5` and `130` (and therefore will continue to print the most recent age of `26`), and then finally get changed back to `25`:

```
25
26
26
26
25
```

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
