package com.fows.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by mateuszbratkowski on 04.02.2017.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerView {
}
