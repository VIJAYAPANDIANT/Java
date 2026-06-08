/* 

Java Platform Module System (JPMS - Java 9+)

Definition:
- JPMS provides a mechanism to package Java code into self-contained "modules".
- A module is a collection of packages, resources, and a descriptor file (module-info.java).
- It provides strong encapsulation, reliable configuration, and allows creating a minimized runtime image (using jlink).

Module Descriptor File (module-info.java):
- Declares the module name, dependencies, and exported packages.
- Keywords:
  - module: Defines the module.
  - requires: Declares another module dependency.
  - exports: Exposes a package so other modules can import it.
  - opens: Exposes a package for runtime reflection access only.

Example Project Structure:
my-project/
├── src/
│   └── com.mycompany.app/
│       ├── module-info.java
│       └── com/
│           └── mycompany/
│               └── app/
│                   └── Main.java

Syntax:
module module.name {
    requires dependency.module;
    exports exported.package;
}

*/

/* 

Example module-info.java declaration:

module com.mycompany.app {
    // Requires java.sql module from JDK standard library
    requires java.sql; 

    // Exports com.mycompany.app package to other modules
    exports com.mycompany.app; 
}

*/

class ModulesInfo {
    public static void main(String[] args) {
        System.out.println("Java Platform Module System (JPMS) Details:");
        System.out.println("-------------------------------------------");
        System.out.println("1. Descriptor file must be named: module-info.java");
        System.out.println("2. Location: In the root of the source directory (src/main/java/).");
        System.out.println("3. Core benefits: Strong encapsulation (public class is not accessible outside its module unless the package is explicitly exported) and smaller runtime packages.");
    }
}
