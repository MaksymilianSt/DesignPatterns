package Builder.InnerBuilder;

public class InnerBuilder {
    private String foo;
    private String bar;
    private String baz;

    private InnerBuilder(Builder builder) {
        this.foo = builder.foo;
        this.bar = builder.bar;
        this.baz = builder.baz;
    }

    public static class Builder {
        private String foo;
        private String bar;
        private String baz;

        public InnerBuilder build() {
            return new InnerBuilder(this);
        }

        public Builder foo(String foo) {
            this.foo = foo;
            return this;
        }
        public Builder bar(String bar) {
            this.bar = bar;
            return this;
        }
        public Builder baz(String baz) {
            this.baz = baz;
            return this;
        }
    }

    @Override
    public String toString() {
        return "InnerBuilder{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                ", baz='" + baz + '\'' +
                '}';
    }
}
