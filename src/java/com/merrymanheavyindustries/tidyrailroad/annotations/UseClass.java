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
package com.merrymanheavyindustries.tidyrailroad.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * The tidyrailroad dependency injection framework should
 * use a constructor to satisfy this dependency.
 * But unlike @see UseConstructor it should figure out
 * which class to use based on the dependency return type
 * rather than you having to specify it.
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
 * @UseClass
 * abstract String newString(String val);
 * </PRE>
 **/
@Documented
@Retention(SOURCE)
@Target(METHOD)
public @interface UseClass {
}
