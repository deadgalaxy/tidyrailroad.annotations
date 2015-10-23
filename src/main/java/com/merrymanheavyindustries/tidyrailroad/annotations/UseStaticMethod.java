package com.merrymanheavyindustries.tidyrailroad;

/**
 * Use a static method to satisfy the dependency.
 *
 * Instead of
 * <PRE>
 * double x = Math.sin(4.0);
 * </PRE>
 *
 * use
 * <PRE>
 * double x = sin(4.0);
 * </PRE>
 *
 * where
 * <PRE>
 * @UseStaticMethod(Math.class)
 * abstract double sin (double x);
 * </PRE>
 **/
public @interface UseStaticMethod {
    /**
     * Specifies the class of the static method.
     *
     * The dependency will specify the name and parameters
     * of the static method.
     **/
    Class<?> value();
}
