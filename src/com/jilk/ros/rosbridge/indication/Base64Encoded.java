/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jilk.ros.rosbridge.indication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author david_000
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Base64Encoded {
}
