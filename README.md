# Java Annotations - Level 1

📄 **Description - Exercise Statement**

This project consists of two exercises focused on Java annotations:

- **Exercise 1:**  
  Create a class hierarchy with three classes: `Worker`, `OnlineWorker`, and `OnsiteWorker`.  
  The base class `Worker` includes attributes (`firstName`, `lastName`, `hourlyRate`) and a `calculateSalary()` method.  
  The child classes override the `calculateSalary()` method using the `@Override` annotation, adapting the calculation logic to their specific needs (adding an internet flat rate or a fuel allowance).

- **Exercise 2:**  
  In the child classes, implement some deprecated methods using the `@Deprecated` annotation.  
  From an external class, call these deprecated methods and suppress the generated warnings using the `@SuppressWarnings("deprecation")` annotation.

---

💻 **Technologies Used**

- Java 17 (or compatible version)
- IntelliJ IDEA / Eclipse / VSCode (any Java-compatible IDE)
- JDK (Java Development Kit)
- Git (optional, for version control)

---

📋 **Requirements**

- Java JDK 17 or higher installed
- A Java IDE (IntelliJ, Eclipse, or VSCode)
- Basic knowledge of Java OOP (Object-Oriented Programming)
- Maven or Gradle (optional, not mandatory for this project)

---

🛠️ **Installation**

1. Clone or download the project repository.
2. Open the project in your preferred Java IDE.
3. Make sure your environment is correctly configured with Java 17+.
4. Compile all `.java` files.

Example using terminal:
```bash
javac *.java
```

---

▶️ **Execution**

1. Navigate to the folder containing the compiled `.class` files.
2. Run the `Main` class or `ExternalClass` depending on which behavior you want to observe.

Example using terminal:
```bash
java Main
```
or
```bash
java ExternalClass
```

You will see:
- The salary calculation behavior for different types of workers.
- The execution of deprecated methods without displaying warning messages (if supp