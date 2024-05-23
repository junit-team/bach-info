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

/**
 * JUnit 5.10.2 = Platform 1.10.2 + Jupiter 5.10.2 + Vintage 5.10.2
 *
 * @see <a href="http://junit.org/junit5/docs/5.10.2/release-notes">Release Notes</a>
 */
public interface JUnit {
  String REPOSITORY = "https://repo.maven.apache.org/maven2";
  String PROPERTIES = // language=properties
      """
org.apiguardian.api=${REPOSITORY}/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar#SIZE=6806
org.junit.jupiter=${REPOSITORY}/org/junit/jupiter/junit-jupiter/5.10.2/junit-jupiter-5.10.2.jar#SIZE=6359
org.junit.jupiter.api=${REPOSITORY}/org/junit/jupiter/junit-jupiter-api/5.10.2/junit-jupiter-api-5.10.2.jar#SIZE=210956
org.junit.jupiter.engine=${REPOSITORY}/org/junit/jupiter/junit-jupiter-engine/5.10.2/junit-jupiter-engine-5.10.2.jar#SIZE=244690
org.junit.jupiter.migrationsupport=${REPOSITORY}/org/junit/jupiter/junit-jupiter-migrationsupport/5.10.2/junit-jupiter-migrationsupport-5.10.2.jar#SIZE=27713
org.junit.jupiter.params=${REPOSITORY}/org/junit/jupiter/junit-jupiter-params/5.10.2/junit-jupiter-params-5.10.2.jar#SIZE=586027
org.junit.platform.commons=${REPOSITORY}/org/junit/platform/junit-platform-commons/1.10.2/junit-platform-commons-1.10.2.jar#SIZE=106232
org.junit.platform.console=${REPOSITORY}/org/junit/platform/junit-platform-console/1.10.2/junit-platform-console-1.10.2.jar#SIZE=545571
org.junit.platform.engine=${REPOSITORY}/org/junit/platform/junit-platform-engine/1.10.2/junit-platform-engine-1.10.2.jar#SIZE=204821
org.junit.platform.jfr=${REPOSITORY}/org/junit/platform/junit-platform-jfr/1.10.2/junit-platform-jfr-1.10.2.jar#SIZE=19138
org.junit.platform.launcher=${REPOSITORY}/org/junit/platform/junit-platform-launcher/1.10.2/junit-platform-launcher-1.10.2.jar#SIZE=183814
org.junit.platform.reporting=${REPOSITORY}/org/junit/platform/junit-platform-reporting/1.10.2/junit-platform-reporting-1.10.2.jar#SIZE=106950
org.junit.platform.suite=${REPOSITORY}/org/junit/platform/junit-platform-suite/1.10.2/junit-platform-suite-1.10.2.jar#SIZE=6362
org.junit.platform.suite.api=${REPOSITORY}/org/junit/platform/junit-platform-suite-api/1.10.2/junit-platform-suite-api-1.10.2.jar#SIZE=22575
org.junit.platform.suite.commons=${REPOSITORY}/org/junit/platform/junit-platform-suite-commons/1.10.2/junit-platform-suite-commons-1.10.2.jar#SIZE=17326
org.junit.platform.suite.engine=${REPOSITORY}/org/junit/platform/junit-platform-suite-engine/1.10.2/junit-platform-suite-engine-1.10.2.jar#SIZE=24117
org.junit.platform.testkit=${REPOSITORY}/org/junit/platform/junit-platform-testkit/1.10.2/junit-platform-testkit-1.10.2.jar#SIZE=44401
org.junit.vintage.engine=${REPOSITORY}/org/junit/vintage/junit-vintage-engine/5.10.2/junit-vintage-engine-5.10.2.jar#SIZE=67479
org.opentest4j=${REPOSITORY}/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar#SIZE=14304
""";
  String MODULES = PROPERTIES.replace("${REPOSITORY}", REPOSITORY);
}
