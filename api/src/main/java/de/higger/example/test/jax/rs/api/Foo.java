package de.higger.example.test.jax.rs.api;


public class Foo {
    /**
     * Serial id.
     */
    private static final long serialVersionUID = 4236357454721555733L;

    private String bar;

    public String getBar() {
        return bar;
    }

    public void setBar(final String bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "Foo [bar=" + bar + "]";
    }

}
