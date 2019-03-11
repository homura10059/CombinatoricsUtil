CombinatoricsUtil
================

Combinatorics in Java 8


Table of Contents
-----------------

* [Description](#description)
* [Requirements](#requirements)
* [Install](#install)
* [Usage](#usage)
* [License](#license)

Description
-----------

This project implements Combinatorics on java.  
Permutation and Combination are a part of Combinatorics.

Requirements
------------

* java 8+

Install
-------

Please add one of the following snippets to your `build.gradle`.


```groovy
repositories {
    jcenter()
}

dependencies {
    compile 'o-hayato:combinatorics-util:0.1.0'
}
```


Usage
-----

### combination

```java
CombinatoricsUtil<String> util = new CombinatoricsUtil<>();

List<String> origin = Arrays.asList("1", "2", "3", "4");
List<List<String>> resultList = util.combination(origin, 2);

// resultList equals bellow
// 
// Arrays.asList(
//         Arrays.asList("1", "2"),
//         Arrays.asList("1", "3"),
//         Arrays.asList("1", "4"),
//         Arrays.asList("2", "3"),
//         Arrays.asList("2", "4"),
//         Arrays.asList("3", "4")
// )

```

License
-------

MIT

