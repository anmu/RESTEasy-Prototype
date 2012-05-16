package de.higger.example.test.jax.rs.client;

import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

import de.higger.example.test.jax.rs.api.Foo;
import de.higger.example.test.jax.rs.api.ExampleRestService;

public class ExampleRestServiceConsumer {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        RegisterBuiltin.register(ResteasyProviderFactory.getInstance());
        final ExampleRestService exampleRestService = ProxyFactoryAdapter.create(ExampleRestService.class);

        exampleRestService.postExampleStringByQuery("HELLO 1");
        exampleRestService.postExampleStringByUrl("HELLO 2");
        System.out.println(exampleRestService.getExampleString());

        final Foo f = new Foo();
        f.setBar("HELLO 3");
        exampleRestService.postExampleFoo(f);

        System.out.println(exampleRestService.getExampleFoo());
    }

}
