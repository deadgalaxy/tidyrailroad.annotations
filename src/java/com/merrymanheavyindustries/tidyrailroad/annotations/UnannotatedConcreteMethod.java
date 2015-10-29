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

/**
 * This enum can be used to describe what to do when
 * processing an unannotated concrete method.
 *
 * The only difference between this and
 * @{see UannatotaedAbstractMethod} is
 * is PROCEED.
 **/
public enum UnannotatedConcreteMethod {
    /**
     * Just use the method.
     * It already has an implementation.
     **/
    PROCEED,
    /**
     * {@see UseCast}.
     **/
    CAST,
    /**
     * {@see UseClass}.
     **/
    CLASS,
    /**
     * {@see UseInstanceMethod}.
     **/
    INSTANCE_METHOD,
    /**
     * {@see UseNull}.
     **/
    NULL,
    /**
     * {@see UseParameter}.
     **/
    PARAMETER,
    /**
     * {@see UseProperty}.
     **/
    PROPERTY,
    /**
     * {@see UseUnsupportedOperationException}.
     **/
    UNSUPPORTED_OPERATION_EXCEPTION;
}
