package de.higger.example.test.jax.rs.client;

import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

import de.higger.example.test.jax.rs.api.Foo;
import de.higger.example.test.jax.rs.api.HelloWorldResource;

public class HelloWorldClient {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        RegisterBuiltin.register(ResteasyProviderFactory.getInstance());
        final HelloWorldResource helloWorldResource = ProxyAdapter.create(HelloWorldResource.class);

        helloWorldResource.putAString("HELLO 1");
        helloWorldResource.putAString2("HELLO 2");
        System.out.println(helloWorldResource.getClichedMessage());

        final Foo f = new Foo();
        f.setBar("HELLO 3");
        helloWorldResource.putAFoo(f);

        System.out.println(helloWorldResource.getAFoo());
    }

}
