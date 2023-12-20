package belajar.kotlin.unit.test.generator

import org.junit.jupiter.api.DisplayNameGenerator
import java.lang.reflect.Method

interface SimpleDisplayNameGenerator : DisplayNameGenerator {
    /**
     * Generate a display name for the given top-level or `static` nested test class.
     *
     * @param testClass the class to generate a name for; never `null`
     * @return the display name for the class; never `null` or blank
     */
    override fun generateDisplayNameForClass(testClass: Class<*>?): String {
        return "Test ${testClass?.simpleName}"
    }

    /**
     * Generate a display name for the given [@Nested][Nested] inner test class.
     *
     * @param nestedClass the class to generate a name for; never `null`
     * @return the display name for the nested class; never `null` or blank
     */
    override fun generateDisplayNameForNestedClass(nestedClass: Class<*>?): String {
        return "Test ${nestedClass?.simpleName}"
    }

    /**
     * Generate a display name for the given method.
     *
     * @implNote The class instance supplied as `testClass` may differ from
     * the class returned by `testMethod.getDeclaringClass()`  for
     * example, when a test method is inherited from a superclass.
     *
     * @param testClass the class the test method is invoked on; never `null`
     * @param testMethod method to generate a display name for; never `null`
     * @return the display name for the test; never `null` or blank
     */
    override fun generateDisplayNameForMethod(testClass: Class<*>?, testMethod: Method?): String {
        return "Test ${testClass?.simpleName}.${testMethod?.name}"
    }
}