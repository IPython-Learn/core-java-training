package com.innominds.functional;

@FunctionalInterface
public interface CustomFunctional<T, U, D, B> {

    public B run(T name, U title, D date);

}
