package de.higger.example.test.jax.rs.impl;

import de.higger.example.test.jax.rs.api.Foo;
import de.higger.example.test.jax.rs.api.HelloWorldResource;

public class HelloWorldResourceImpl implements HelloWorldResource {

    @Override
    public String getClichedMessage() {
        System.out.println("getClichedMessage");

        return "Hello World";
    }

    @Override
    public Foo getAFoo() {
        System.out.println("getAFoo");

        final Foo f = new Foo();
        f.setBar("Hello world!");
        return f;
    }

    @Override
    public void putAFoo(final Foo foo) {
        System.out.println(foo);

    }

    @Override
    public void putAString(final String aString) {
        System.out.println("aString: " + aString);
    }

    @Override
    public void putAString2(final String aString) {
        System.out.println("aString: " + aString);
    }

}
