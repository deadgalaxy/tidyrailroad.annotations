package com.merrymanheavyindustries.tidyrailroad;

/**
 * Use an @see java.lang.UnsupportedOperationException to satisfy
 * the dependency.
 **/
public @interface UseUnsupportedOperationException {
    /**
     * A format string for the error message.
     * @see String#format()
     **/
    String value();
}
