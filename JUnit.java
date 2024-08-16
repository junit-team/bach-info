/*
 * Copyright 2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package run.info.org.junit;

import run.bach.ModuleLocator;

/**
 * JUnit is the programmer-friendly testing framework for Java and the JVM.
 *
 * @see <a href="https://junit.org/junit5">Homepage</a>
 */
public interface JUnit {
  /** {@return a locator for modular JAR files of JUnit 5.11.0} */
  static ModuleLocator modules() {
    return ModuleLocator.compose(
        ModuleLocator.of("org.apiguardian.api", "pkg:maven/org.apiguardian/apiguardian-api@1.1.2"),
        JUnitLocator.of(
            "org.junit.jupiter",
            "5.11.0",
            "org.junit.jupiter",
            "org.junit.jupiter.api",
            "org.junit.jupiter.engine",
            "org.junit.jupiter.params"),
        JUnitLocator.of(
            "org.junit.platform",
            "1.11.0",
            "org.junit.platform.commons",
            "org.junit.platform.console",
            "org.junit.platform.engine",
            "org.junit.platform.jfr",
            "org.junit.platform.launcher",
            "org.junit.platform.reporting",
            "org.junit.platform.suite",
            "org.junit.platform.suite.api",
            "org.junit.platform.suite.commons",
            "org.junit.platform.suite.engine"),
        ModuleLocator.of("org.opentest4j", "pkg:maven/org.opentest4j/opentest4j@1.3.0"));
  }
}
