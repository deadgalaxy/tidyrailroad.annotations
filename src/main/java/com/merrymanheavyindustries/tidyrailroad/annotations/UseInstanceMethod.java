package com.merrymanheavyindustries.tidyrailroad;

/**
 * Uses a method of the instance to satisfy the dependency.
 *
 * instead of
 * <PRE>
 * String x = "Hello World";
 * System.out.println(x.toString());
 * </PRE>
 *
 * do
 * <PRE>
 * String x = "Hello World";
 * System.out.println(toString(x));
 * </PRE>
 *
 * where
 * <PRE>
 * @UseInstanceMethod
 * abstract String toString(String val);
 * </PRE>
 *
 * This may seem silly, but it facilitates unit testing.
 *
 * String.toString is final and cannot be mocked (easily).
 * OurClass.toString(String) is abstract and can easily be mocked.
 **/
public @interface UseInstanceMethod {
}
