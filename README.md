# Jump Counter

[![version](https://img.shields.io/badge/version-1.0.13-yellow.svg)](https://semver.org)
[![Awesome Kotlin Badge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)
[![Build](https://github.com/rkociniewski/jump-counter/actions/workflows/main.yml/badge.svg)](https://github.com/rkociniewski/jump-counter/actions/workflows/main.yml)
[![codecov](https://codecov.io/gh/rkociniewski/jump-counter/branch/main/graph/badge.svg)](https://codecov.io/gh/rkociniewski/jump-counter)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.2.20-blueviolet?logo=kotlin)](https://kotlinlang.org/)
[![Gradle](https://img.shields.io/badge/Gradle-9.10-blue?logo=gradle)](https://gradle.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-greem.svg)](https://opensource.org/licenses/MIT)

A simple Kotlin utility that calculates how many indices in an integer array are **not visited** during a jump sequence.

---

## 🧠 Idea

Given an array of integers, we **start at index `0`** and repeatedly jump forward or backward by the value at the
current index. The jumping process stops if:

- we reach an index **out of bounds**, or
- we land on an index that has **already been visited**.

The goal is to **count how many indices were _not_ visited** during this process.

---

## ✨ Example

```kotlin
val arr = intArrayOf(1, 2, 3)
val result = arr.jump() // Returns 1
```

## License

This project is licensed under the MIT License.

## Built With

* [Gradle](https://gradle.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Rafał Kociniewski** - [PowerMilk](https://github.com/rkociniewski)
