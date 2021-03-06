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
@Documented
@Retention(SOURCE)
@Target(METHOD)
public @interface UseStaticMethod {
    /**
     * Specifies the class of the static method.
     *
     * The dependency will specify the name and parameters
     * of the static method.
     **/
    Class<?> value();
}
