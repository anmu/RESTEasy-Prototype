package de.higger.example.test.jax.rs.impl;

import org.apache.log4j.Logger;

import de.higger.example.test.jax.rs.api.ExampleRestService;
import de.higger.example.test.jax.rs.api.Foo;

public class ExampleRestServiceImpl implements ExampleRestService {

    private static final Logger LOG = Logger.getLogger(ExampleRestServiceImpl.class);

    @Override
    public String getExampleString() {
        LOG.info("getExampleString called");

        return "Hello World";
    }

    @Override
    public Foo getExampleFoo() {
        LOG.info("getExampleFoo called");

        final Foo f = new Foo();
        f.setBar("Hello world!");
        return f;
    }

    @Override
    public void postExampleFoo(final Foo foo) {
        LOG.info("postExampleFoo called with " + foo);
    }

    @Override
    public void postExampleStringByQuery(final String aString) {
        LOG.info("postExampleStringByQuery called with " + aString);
    }

    @Override
    public void postExampleStringByUrl(final String aString) {
        LOG.info("postExampleStringByUrl called with " + aString);
    }

}
