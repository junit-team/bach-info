package run.info.org.junit;

/**
 * JUnit 5.11.0-M2 = Platform 1.11.0-M2 + Jupiter 5.11.0-M2 + Vintage 5.11.0-M2
 *
 * @see <a href="https://github.com/junit-team/junit5/releases/tag/r5.11.0-M2">Release Notes</a>
 */
public interface JUnit {
  String REPOSITORY = "https://repo.maven.apache.org/maven2";
  String PROPERTIES = // language=properties
      """
org.apiguardian.api=${REPOSITORY}/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar#SIZE=6806
org.junit.jupiter.api=${REPOSITORY}/org/junit/jupiter/junit-jupiter-api/5.11.0-M2/junit-jupiter-api-5.11.0-M2.jar#SIZE=214992
org.junit.jupiter.engine=${REPOSITORY}/org/junit/jupiter/junit-jupiter-engine/5.11.0-M2/junit-jupiter-engine-5.11.0-M2.jar#SIZE=252652
org.junit.jupiter.params=${REPOSITORY}/org/junit/jupiter/junit-jupiter-params/5.11.0-M2/junit-jupiter-params-5.11.0-M2.jar#SIZE=581364
org.junit.jupiter=${REPOSITORY}/org/junit/jupiter/junit-jupiter/5.11.0-M2/junit-jupiter-5.11.0-M2.jar#SIZE=6374
org.junit.platform.commons=${REPOSITORY}/org/junit/platform/junit-platform-commons/1.11.0-M2/junit-platform-commons-1.11.0-M2.jar#SIZE=133055
org.junit.platform.console=${REPOSITORY}/org/junit/platform/junit-platform-console/1.11.0-M2/junit-platform-console-1.11.0-M2.jar#SIZE=549251
org.junit.platform.engine=${REPOSITORY}/org/junit/platform/junit-platform-engine/1.11.0-M2/junit-platform-engine-1.11.0-M2.jar#SIZE=238281
org.junit.platform.jfr=${REPOSITORY}/org/junit/platform/junit-platform-jfr/1.11.0-M2/junit-platform-jfr-1.11.0-M2.jar#SIZE=19311
org.junit.platform.launcher=${REPOSITORY}/org/junit/platform/junit-platform-launcher/1.11.0-M2/junit-platform-launcher-1.11.0-M2.jar#SIZE=188116
org.junit.platform.reporting=${REPOSITORY}/org/junit/platform/junit-platform-reporting/1.11.0-M2/junit-platform-reporting-1.11.0-M2.jar#SIZE=107771
org.junit.platform.suite.api=${REPOSITORY}/org/junit/platform/junit-platform-suite-api/1.11.0-M2/junit-platform-suite-api-1.11.0-M2.jar#SIZE=23771
org.junit.platform.suite.commons=${REPOSITORY}/org/junit/platform/junit-platform-suite-commons/1.11.0-M2/junit-platform-suite-commons-1.11.0-M2.jar#SIZE=17864
org.junit.platform.suite.engine=${REPOSITORY}/org/junit/platform/junit-platform-suite-engine/1.11.0-M2/junit-platform-suite-engine-1.11.0-M2.jar#SIZE=24487
org.junit.platform.suite=${REPOSITORY}/org/junit/platform/junit-platform-suite/1.11.0-M2/junit-platform-suite-1.11.0-M2.jar#SIZE=6376
org.opentest4j=${REPOSITORY}/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar#SIZE=14304
""";
  String MODULES = PROPERTIES.replace("${REPOSITORY}", REPOSITORY);
}
