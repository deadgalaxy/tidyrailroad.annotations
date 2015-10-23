/*
    Copyright (C) 2015
    Emory Merryman
    emory.merryman@gmail.com

    This file is part of tidyrailroad.

    tidyrailroad is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    tidyrailroad is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with tidyrailroad.  If not, see <http://www.gnu.org/licenses/>.
*/
package com.merrymanheavyindustries.tidyrailroad;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

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
@Documented
@Retention(SOURCE)
@Target(METHOD)
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
