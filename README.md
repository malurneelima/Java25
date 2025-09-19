# Java 25 - Complete Guide & Code Examples

[![Java Version](https://img.shields.io/badge/Java-25%20LTS-orange?style=flat-square&logo=openjdk)](https://jdk.java.net/25/)

Java 25 LTS is here! This repository contains practical code examples, installation guides, and real-world use cases for all the new features in Java 25.

## About This Repository

This repository is part of my "Journey Through Java" blog series, providing hands-on examples for Java 25's 18 JDK Enhancement Proposals (JEPs). Whether you're a beginner or an experienced developer, you'll find practical code samples and explanations for every major feature.

## What's New in Java 25

Java 25, released on September 16, 2025, is the latest Long-Term Support (LTS) release after Java 21. It includes:

- 14 Final Features - Production ready
- 3 Preview Features - Available for testing  
- 1 Incubator Feature - Experimental API

## Repository Files

### Core Examples

**HelloWorld.java** - Demonstrates compact source files (JEP 512)
```java
// Before Java 25
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// With Java 25 
void main() {
    System.out.println("Hello, World!");
}
```

**Test.java** - Flexible constructor bodies (JEP 513)
Shows how to add validation and logging before super() calls.

**CollectionEg.java** - Collections API enhancements
Demonstrates new methods like getFirst(), getLast(), and reversed().

**UnderscoreEg.java** - Unnamed variables with underscore
Examples of using _ for unused variables in exception handling.

**DerivationFun.java** - Key Derivation Function API (JEP 504)
Cryptographic key derivation examples for secure applications.

**VectorEg.java** - Vector API (JEP 508, 10th Incubator)
High-performance vector operations for AI/ML workloads.

**Main.java** - Module import declarations (JEP 511)
Simplified module importing examples.

## Quick Start

### Prerequisites
- Java 25 JDK installed
- Git for cloning the repository

### Installation

#### Download Java 25
Visit the official site: https://jdk.java.net/25/

#### macOS Installation
```bash
# Download and extract
curl -O https://download.java.net/java/GA/jdk25/...
sudo mv jdk-25.jdk /Library/Java/JavaVirtualMachines/

# Set environment variables
echo 'export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-25.jdk/Contents/Home' >> ~/.zshrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.zshrc
source ~/.zshrc
```

#### Windows Installation
1. Download Windows x64 zip from jdk.java.net/25/
2. Extract to C:\Program Files\Java\jdk-25
3. Set JAVA_HOME environment variable
4. Add %JAVA_HOME%\bin to PATH

#### Linux Installation
```bash
wget https://download.java.net/java/GA/jdk25/...
tar -xzf openjdk-25_linux-x64_bin.tar.gz
sudo mv jdk-25 /opt/
export JAVA_HOME=/opt/jdk-25
export PATH=$JAVA_HOME/bin:$PATH
```

### Running Examples

1. Clone the repository:
```bash
git clone https://github.com/bsanjuu/Java25.git
cd Java25
```

2. Verify Java 25 installation:
```bash
java --version
# Should output: openjdk 25 2025-09-16
```

3. Run any example:
```bash
java HelloWorld.java
java Test.java
java CollectionEg.java
```

## Key Features Explained

### Compact Source Files (JEP 512)
Eliminates boilerplate code for simple programs. Beginners can now write Java without understanding complex class structures.

### Flexible Constructor Bodies (JEP 513)  
Allows statements before super() calls, enabling validation and logging in constructors.

### Collections API Enhancements
New methods for easier list manipulation:
- getFirst() - Get first element
- getLast() - Get last element  
- reversed() - Get reversed list

### Module Import Declarations (JEP 511)
Import entire modules with a single statement, reducing import clutter.

### Key Derivation Function API (JEP 504)
Standardized API for deriving cryptographic keys from passwords, essential for security applications.

### Vector API (Incubator)
High-performance mathematical operations for AI and machine learning applications.

## Performance Improvements

| Feature | Benefit | Use Case |
|---------|---------|----------|
| Compact Object Headers | 8-15% heap reduction | Memory-intensive applications |
| Generational Shenandoah | Sub-10ms pause times | Real-time systems |
| Vector API | 2-8x performance boost | AI/ML computations |

## Enterprise Use Cases

This repository includes examples relevant to:
- Banking and financial services
- Secure key management
- High-performance computing
- Real-time data processing

## Learning Path

**Beginners:** Start with HelloWorld.java, then CollectionEg.java
**Intermediate:** Explore Test.java and Main.java  
**Advanced:** Study DerivationFun.java and VectorEg.java

## Blog Series

This repository supports my "Journey Through Java" blog series:
- Personal Website: [bsanju.in](http://bsanju.in/)
- Medium: [@bsanju](https://medium.com/@bsanju)
- Dev.to: [@bsanju](https://dev.to/bsanju)

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Open a Pull Request

## Useful Links

- [Official Java 25 Download](https://jdk.java.net/25/)
- [JEP Documentation](https://openjdk.org/projects/jdk/25/)
- [Java 25 Release Notes](https://jdk.java.net/25/release-notes)

## Connect

- Personal Website: [bsanju.in](http://bsanju.in/)
- Medium: [@bsanju](https://medium.com/@bsanju)
- Dev.to: [@bsanju](https://dev.to/bsanju)


---

**Made by [Sanju B](http://bsanju.in/)**  
