# joda-stopwatch

[![Maven Central](https://img.shields.io/maven-central/v/com.triptheone/joda-stopwatch.svg)](http://mvnrepository.com/artifact/com.triptheone/joda-stopwatch)
[![Build Status](https://travis-ci.org/eric-martin/joda-stopwatch.png)](https://travis-ci.org/eric-martin/joda-stopwatch)
[![Coverage Status](https://coveralls.io/repos/eric-martin/joda-stopwatch/badge.svg)](https://coveralls.io/r/eric-martin/joda-stopwatch)

A simple Stopwatch object for the Joda-Time library

## Installation

Add it as a maven dependency:
```xml
<dependency>
  <groupId>com.triptheone</groupId>
  <artifactId>joda-stopwatch</artifactId>
  <version>INSERT_LATEST_MAVEN_CENTRAL_VERSION</version>
</dependency>
```

## Usage

```java
Stopwatch stopwatch = Stopwatch.start();
...
Duration elapsedTime = stopwatch.getElapsedTime();
```

## License

Copyright 2013 Eric Martin

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

