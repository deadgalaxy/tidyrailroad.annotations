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
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Provides class level configuration.
 **/
@Documented
@Target(TYPE)
@Retention(RUNTIME)
public @interface Implementation {
    /**
     * Specifies how to handle an unannotated concrete method.
     **/
    UnannotatedConcreteMethod
        unannotatedConcreteMethod()
default UnannotatedConcreteMethod.PROCEED;

    /**
     * This specifies how to handle an unannotated abstract method.
     **/
    UnannotatedAbstractMethod
        unannotatedAbstractMethod()
default UnannotatedAbstractMethod.CLASS;
}
