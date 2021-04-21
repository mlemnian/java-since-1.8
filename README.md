# Java since 1.8
This repository shows the language features since Java 8

## Java 9
### Language
* Module System ([JEP 261](https://openjdk.java.net/jeps/261)) (see https://www.baeldung.com/java-9-modularity)
* Milling Project Coin ([JEP 213](https://openjdk.java.net/jeps/213))
** Private Methods in Interfaces // allows sturcturing the code of default implementations
** annotate private methods with @SafeVarargs
** int _ = 10; // Compile error
** better try-with-resources
** Diamond operator for anonymous inner classes

### API
* Reactive Streams ([JEP 266](https://openjdk.java.net/jeps/266))
* Indify String Concatenation ([JEP 280](https://openjdk.java.net/jeps/280))
* Var Handles ([JEP 193](https://openjdk.java.net/jeps/193))
* Object.finalize() deprecated ([JDKIssue 8165641](https://bugs.openjdk.java.net/browse/JDK-8165641))
* Enhanced Deprecation ([JEP 277](https://openjdk.java.net/jeps/277))
### Tools
jshell ([JEP 222](https://openjdk.java.net/jeps/222))
jlink ([JEP 282](https://openjdk.java.net/jeps/282))

## Java 10
### JVM
* Graal VM ([JEP 317](https://openjdk.java.net/jeps/317))
* GC Interface ([JEP 304](https://openjdk.java.net/jeps/304))
* Parallel Full GC for G1 ([JEP 307](https://openjdk.java.net/jeps/307))
* Thread-Local Handshakes ([JEP 312](https://openjdk.java.net/jeps/312))
* Alternative Memory Devices ([JEP 316](https://openjdk.java.net/jeps/316))
### Language
* Keyword var ([JEP 286](https://openjdk.java.net/jeps/286))
### API
* Additional Unicode Language-Tag Extensions ([JEP 314](https://openjdk.java.net/jeps/314))
### Tools
* javah Removed ([JEP 313](https://openjdk.java.net/jeps/313))

## Java 11 (LTS)
### JVM
* CONSTANT_Dynamic ([JEP 309](https://openjdk.java.net/jeps/309))
* Epsilon GC ([JEP 318](https://openjdk.java.net/jeps/318))
* ZGC ([JEP 333](https://openjdk.java.net/jeps/333))
* Nest-Based Access Control ([JEP 181](https://openjdk.java.net/jeps/181))
* Low-Overhead Heap Profiling ([JEP 331](https://openjdk.java.net/jeps/331))
* Improve Aarch64 Intrinsics ([JEP 315](https://openjdk.java.net/jeps/315))
### Language
Local Variable Syntax for Lambda Parameters ([JEP 323](https://openjdk.java.net/jeps/323))
### API
* HTTP Client ([JEP 321](https://openjdk.java.net/jeps/321))
* Java EE and CORBA removed ([JEP 320](https://openjdk.java.net/jeps/320))
* Unicode 10 Support ([JEP 327](https://openjdk.java.net/jeps/327))
* Nashorn JavaScript Engine deprecated ([JEP 335](https://openjdk.java.net/jeps/335))
* New Cryptographic Algorithms ([JEP 324](https://openjdk.java.net/jeps/324) , [JEP 329](https://openjdk.java.net/jeps/329))
* TLS 1.3 ([JEP 332](https://openjdk.java.net/jeps/332))
### Tools
* Single Source File Launch ([JEP 330](https://openjdk.java.net/jeps/330))
* Flight Recorder ([JEP 328](https://openjdk.java.net/jeps/328))
* Pack200 deprecated ([JEP 336](https://openjdk.java.net/jeps/336))
* No more frames in JavaDoc ([JDKIssue 8196202](https://bugs.openjdk.java.net/browse/JDK-8196202))

## Java 12
### JVM
* Shenandoah GC ([JEP 189](https://openjdk.java.net/jeps/189))
### Language
* Switch Expressions Preview ([JEP 325](https://openjdk.java.net/jeps/325))
### API
* JVM Constants ([JEP 334](https://openjdk.java.net/jeps/334))


## Java 13
### JVM
* Dynamic CDS Archives ([JEP 350](https://openjdk.java.net/jeps/350))
* ZGC: Uncommit Unused Memory ([JEP 351](https://openjdk.java.net/jeps/351))
### Language
* Switch Expressions Preview ([JEP 354](https://openjdk.java.net/jeps/354))
* Text Blocks Preview ([JEP 355](https://openjdk.java.net/jeps/355))
### API
* Reimplement the Legacy Socket API Preview ([JEP 353](https://openjdk.java.net/jeps/353))

## Java 14
### JVM
* NUMA-Aware Memory Allocation for G1 ([JEP 345](https://openjdk.java.net/jeps/345))
* JFR Event Streaming ([JEP 349](https://openjdk.java.net/jeps/349))
* Helpful NullPointerExceptions ([JEP 358](https://openjdk.java.net/jeps/358))
* Deprecate the Solaris and SPARC Ports ([JEP 362](https://openjdk.java.net/jeps/362))
* Remove the Concurrent Mark Sweep (CMS) Garbage Collector ([JEP 363](https://openjdk.java.net/jeps/363))
* ZGC on macOS ([JEP 364](https://openjdk.java.net/jeps/364))
* ZGC on Windows ([JEP 365](https://openjdk.java.net/jeps/365))
* Deprecate the ParallelScavenge + SerialOld GC Combination ([JEP 366](https://openjdk.java.net/jeps/366))
### Language
* Switch Expressions ([JEP 361](https://openjdk.java.net/jeps/361))
* Records Preview ([JEP 359](https://openjdk.java.net/jeps/359))
* Text Blocks Preview ([JEP 368](https://openjdk.java.net/jeps/368))
* Pattern Matching for instanceof Preview ([JEP 305](https://openjdk.java.net/jeps/305))
### API
* Non-Volatile Mapped Byte Buffers ([JEP 367](https://openjdk.java.net/jeps/367))
* Remove the Pack200 APIs ([JEP 367](https://openjdk.java.net/jeps/367))
### Tools
* Remove the Pack200 Tools ([JEP 367](https://openjdk.java.net/jeps/367))
* Packaging Tool (Incubator) ([JEP 343](https://openjdk.java.net/jeps/343))

## Java 15
### JVM
* Disable and Deprecate Biased Locking ([JEP 374](https://openjdk.java.net/jeps/374))
* ZGC ([JEP 377](https://openjdk.java.net/jeps/377))
* Shenandoah GC ([JEP 379](https://openjdk.java.net/jeps/379))
* Remove the Solaris and SPARC Ports ([JEP 381](https://openjdk.java.net/jeps/381))
### Language
* Pattern Matching for instanceof Preview ([JEP 375](https://openjdk.java.net/jeps/375))
* Text Blocks ([JEP 378](https://openjdk.java.net/jeps/378))
* Records Preview ([JEP 384](https://openjdk.java.net/jeps/384))

### API
* Edwards-Curve Digital Signature Algorithm (EdDSA) ([JEP 339](https://openjdk.java.net/jeps/339))
* Sealed Classes Preview ([JEP 360](https://openjdk.java.net/jeps/360))
* Hidden Classes ([JEP 371](https://openjdk.java.net/jeps/371))
* Remove the Nashorn JavaScript Engine ([JEP 372](https://openjdk.java.net/jeps/372))
* Reimplement the Legacy DatagramSocket API ([JEP 373](https://openjdk.java.net/jeps/373))
* Foreign-Memory Access API (Second Incubator) ([JEP 383](https://openjdk.java.net/jeps/383))
* Deprecate RMI Activation for Removal ([JEP 385](https://openjdk.java.net/jeps/385))

## Java 16
### JVM
* ZGC: Concurrent Thread Processing ([JEP 376](https://openjdk.java.net/jeps/376))
* Alpine Linux Port ([JEP 386](https://openjdk.java.net/jeps/386))
* Windows/AArch64 Port ([JEP 388](https://openjdk.java.net/jeps/388))
* Strongly Encapsulate JDK Internals by Default ([JEP 396](https://openjdk.java.net/jeps/396))
### Language
* Warnings for Value-Based Classes ([JEP 390](https://openjdk.java.net/jeps/390))
* Pattern Matching for instanceof ([JEP 394](https://openjdk.java.net/jeps/394))
* Records ([JEP 395](https://openjdk.java.net/jeps/395))
* Static Members in Inner Classes ([JEP 395](https://openjdk.java.net/jeps/395))
* Sealed Classes Preview ([JEP 397](https://openjdk.java.net/jeps/397))

### API
* Unix-Domain Socket Channels ([JEP 380](https://openjdk.java.net/jeps/380))

### Tools
* Packaging Tool ([JEP 392](https://openjdk.java.net/jeps/392))

### Internal
* Enable C++14 Language Features ([JEP 347](https://openjdk.java.net/jeps/347))
* Migrate to Git/GitHub ([JEP 357](https://openjdk.java.net/jeps/357), [JEP 369](https://openjdk.java.net/jeps/369))

## Java 17 (LTS)
Release 09.2021
## related links
* https://foojay.io/
* https://adoptopenjdk.net/ -> https://adoptium.net/
* https://sdkman.io/

