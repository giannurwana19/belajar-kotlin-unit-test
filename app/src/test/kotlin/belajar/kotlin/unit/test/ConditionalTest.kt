package belajar.kotlin.unit.test

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*

class ConditionalTest {

    @Test
    @EnabledOnOs(value = [OS.WINDOWS, OS.LINUX])
    fun enableOnWindows() {

    }

    @Test
    @DisabledOnOs(value = [OS.WINDOWS])
    fun disabledOnWindows() {

    }

    @Test
    @EnabledOnJre(value = [JRE.JAVA_17])
    fun onlyRunOnJava17() {

    }

    @Test
    @DisabledOnJre(value = [JRE.JAVA_17])
    fun disabledRunOnJava17() {

    }

    @Test
    fun systemProperties() {
        System.getProperties().forEach { key, value ->
            println("$key: $value")
        }
    }

    @Test
    @EnabledIfSystemProperties(
        value = [
            EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
        ]
    )
    fun enabledOnOracle() {
    }

    @Test
    @DisabledIfSystemProperties(
        value = [
            DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
        ]
    )
    fun disabledOnOracle() {
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    fun enabledOnDev() {
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    fun disabledOnDev() {

    }
}