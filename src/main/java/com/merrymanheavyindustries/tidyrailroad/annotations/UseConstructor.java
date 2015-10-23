package com.merrymanheavyindustries.tidyrailroad;

/**
 * The tidyrailroad dependency injection framework should
 * use a constructor to satisfy this dependency.
 *
 * Instead of
 * <PRE>
 * String x = new String ( "Hello World") ;
 * </PRE>
 *
 * use
 * <PRE>
 * String x = newString( "Hello World");
 * </PRE>
 *
 * where
 * <PRE>
 * @UseConstructor(String.class)
 * abstract String newString(String val);
 * </PRE>
 **/
public @interface UseConstructor {
    /**
     * Specifies the constructor to use.
     *
     * The specified class is either
     * <OL>
     *     <LI> final, or
     *     </LI> not final
     * </OL>
     *
     * If it is final, then it should have a constructor that
     * matches the dependency on parameters.
     *
     * If it is not final, then it should have a constructor
     * that when augmented with parameters
     * {@link UseParameter}
     * matches the dependency on parameters
     **/
    Class<?> value();
}
