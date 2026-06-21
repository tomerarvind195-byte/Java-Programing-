# ☕ Java Programming — Practice & Learning Repository

> A structured collection of Java programs covering core to intermediate concepts — OOP, Collections, Exception Handling, File I/O, and mini projects.

![Java](https://img.shields.io/badge/Java-17+-orange?style=flat&logo=openjdk)
![Level](https://img.shields.io/badge/Level-Beginner%20to%20Intermediate-blue?style=flat)
![Topics](https://img.shields.io/badge/Topics-15+-green?style=flat)
![Programs](https://img.shields.io/badge/Programs-60+-purple?style=flat)
![Status](https://img.shields.io/badge/Status-Actively%20Updated-brightgreen?style=flat)

---

## 📋 About This Repository

This repository contains my **Java learning journey** — from core syntax and OOP principles to Collections Framework, Exception Handling, and File I/O. Every folder covers one topic with clean, well-commented code and real examples.

> 💡 Regularly updated as I progress through intermediate to advanced Java.

---

## 📁 Repository Structure

```
java-practice/
│
├── 01_basics/
│   ├── HelloWorld.java
│   ├── DataTypes.java
│   ├── Operators.java
│   ├── InputOutput.java
│   └── TypeCasting.java
│
├── 02_control_flow/
│   ├── IfElse.java
│   ├── SwitchCase.java
│   ├── ForLoop.java
│   ├── WhileLoop.java
│   └── BreakContinue.java
│
├── 03_arrays_strings/
│   ├── ArrayBasics.java
│   ├── MultiDimArray.java
│   ├── StringMethods.java
│   ├── StringBuilder.java
│   └── StringProblems.java
│
├── 04_oop/
│   ├── ClassesObjects.java
│   ├── Constructors.java
│   ├── Inheritance.java
│   ├── Polymorphism.java
│   ├── Encapsulation.java
│   ├── Abstraction.java
│   └── Interfaces.java
│
├── 05_collections/
│   ├── ArrayListDemo.java
│   ├── LinkedListDemo.java
│   ├── HashMapDemo.java
│   ├── HashSetDemo.java
│   ├── StackQueueDemo.java
│   └── IteratorDemo.java
│
├── 06_exception_handling/
│   ├── TryCatch.java
│   ├── MultipleExceptions.java
│   ├── CustomException.java
│   ├── FinallyBlock.java
│   └── ThrowsKeyword.java
│
├── 07_file_io/
│   ├── FileRead.java
│   ├── FileWrite.java
│   ├── BufferedReader.java
│   └── FileNotFoundException.java
│
├── 08_static_final_keywords/
│   ├── StaticDemo.java
│   ├── FinalDemo.java
│   └── StaticBlock.java
│
├── 09_generics/
│   ├── GenericClass.java
│   ├── GenericMethod.java
│   └── WildCards.java
│
├── 10_mini_projects/
│   ├── BankingSystem.java
│   ├── StudentManagement.java
│   ├── LibrarySystem.java
│   ├── ATMSimulator.java
│   └── QuizApp.java
│
└── 11_practice_problems/
    ├── PatternPrinting.java
    ├── StringProblems.java
    ├── MathProblems.java
    └── OOPProblems.java
```

---

## 📚 Topics Covered

| # | Topic | Status |
|---|-------|--------|
| 01 | Java Basics — Data Types, Operators, I/O | ✅ Done |
| 02 | Control Flow — if/else, loops, switch | ✅ Done |
| 03 | Arrays & Strings | ✅ Done |
| 04 | Object Oriented Programming (OOP) | ✅ Done |
| 05 | Collections Framework | ✅ Done |
| 06 | Exception Handling | ✅ Done |
| 07 | File I/O | ✅ Done |
| 08 | Static & Final Keywords | ✅ Done |
| 09 | Generics | ✅ Done |
| 10 | Mini Projects | ✅ Done |
| 11 | Practice Problems | 🔄 Ongoing |
| 12 | Multithreading & Concurrency | 🔜 Coming Soon |
| 13 | Lambda Expressions & Streams | 🔜 Coming Soon |
| 14 | JDBC — Database Connectivity | 🔜 Coming Soon |
| 15 | Java 17+ Features | 🔜 Coming Soon |

---

## 🌟 Mini Projects Included

| Project | Description | Concepts Used |
|---------|-------------|---------------|
| 🏦 Banking System | Deposit, withdraw, balance check | OOP, Encapsulation |
| 🎓 Student Management | Add, search, delete student records | ArrayList, HashMap |
| 📚 Library System | Issue and return books | Inheritance, Collections |
| 🏧 ATM Simulator | PIN validation, transactions | Switch, Exception Handling |
| ❓ Quiz App | MCQ quiz with score tracking | Arrays, Control Flow |

---

## 💡 Code Highlights

```java
// OOP Example — Inheritance & Polymorphism
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog("Bruno");
        a.makeSound();  // Output: Bruno says: Woof!
    }
}
```

```java
// Collections Example — HashMap
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Arvind", 95);
        marks.put("Rahul", 88);
        marks.put("Priya", 92);

        for (Map.Entry<String, Integer> e : marks.entrySet()) {
            System.out.println(e.getKey() + " scored: " + e.getValue());
        }
    }
}
// Output:
// Arvind scored: 95
// Rahul scored: 88
// Priya scored: 92
```

```java
// Exception Handling — Custom Exception
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Cannot withdraw ₹" + amount + ". Available: ₹" + balance
            );
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }
}
```

---

## 🚀 How to Run Any Program

### Prerequisites
- Java JDK 17+
- Git
- IDE: VS Code / IntelliJ IDEA / Eclipse

### Run from Terminal

```bash
# 1. Clone the repository
git clone https://github.com/tomerarvind195-byte/java-practice.git
cd java-practice

# 2. Compile any file
javac 04_oop/Inheritance.java

# 3. Run the compiled class
java Inheritance

# OR — run mini project
javac 10_mini_projects/BankingSystem.java
java BankingSystem
```

### Run in VS Code
1. Install **Extension Pack for Java** in VS Code
2. Open any `.java` file
3. Click the ▶ Run button — that's it!

---

## 🔑 Key Java Concepts Practiced

```
Core Java
├── Data Types (int, float, char, boolean, String)
├── OOP (Class, Object, Constructor, this keyword)
├── 4 Pillars — Inheritance, Polymorphism, Encapsulation, Abstraction
├── Interfaces & Abstract Classes
└── static, final, super keywords

Collections Framework
├── List    → ArrayList, LinkedList
├── Set     → HashSet, TreeSet
├── Map     → HashMap, TreeMap
└── Queue   → PriorityQueue, Stack

Exception Handling
├── try-catch-finally
├── throw & throws
└── Custom Exceptions

File I/O
├── FileReader / FileWriter
├── BufferedReader / BufferedWriter
└── File class operations
```

---

## 🎯 My Java Learning Goals

- [x] Master Java OOP — Inheritance, Polymorphism, Encapsulation, Abstraction
- [x] Learn Collections Framework — ArrayList, HashMap, HashSet
- [x] Implement Exception Handling & Custom Exceptions
- [x] File I/O operations
- [x] Build 5 mini projects in Java
- [ ] Learn Multithreading & Concurrency
- [ ] Master Lambda Expressions & Streams (Java 8+)
- [ ] Connect Java to MySQL using JDBC
- [ ] Solve 50+ LeetCode problems in Java

---

## 🔮 Coming Next

- [ ] `12_multithreading/` — Thread class, Runnable, synchronization
- [ ] `13_lambda_streams/` — Lambda expressions, Stream API, Optional
- [ ] `14_jdbc/` — Connect Java to MySQL, CRUD operations
- [ ] `15_java17_features/` — Records, sealed classes, pattern matching
- [ ] LeetCode solutions in Java

---

## 📊 Comparison: Java vs Python

| Feature | Java | Python |
|---------|------|--------|
| Type System | Statically typed | Dynamically typed |
| Speed | Faster (compiled) | Slower (interpreted) |
| Syntax | Verbose | Concise |
| OOP | Strictly OOP | Multi-paradigm |
| Use Case | Enterprise, Android | AI/ML, Web, Scripting |
| My Proficiency | Intermediate ⭐⭐⭐ | Intermediate-Advanced ⭐⭐⭐⭐ |

---

## 🤝 Contributing

1. Fork the repository
2. Create a new branch (`git checkout -b feature/new-topic`)
3. Add your Java programs with comments
4. Commit (`git commit -m 'Add multithreading examples'`)
5. Push and open a Pull Request

---

## 👨‍💻 Author

**Arvind Kumar**
3rd Year B.Tech IT Student | Aspiring Software Engineer

- 🌐 [LinkedIn](https://www.linkedin.com/in/arvind-kumar-399a60338)
- 💻 [GitHub](https://github.com/tomerarvind195-byte)
- 📧 tomerarvind195@gmail.com

---

## 📄 License

This repository is open source and available under the [MIT License](LICENSE).

---

> ⭐ Agar helpful laga toh **star** zaroor karo aur apne suggestions **issues** mein daalo!
