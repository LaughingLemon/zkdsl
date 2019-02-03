package zk.builder;

import zk.Div;
import zk.WebComponent;

import java.util.function.Consumer;

public class DivBuilder {

    private final Div d;

    public DivBuilder() {
        this.d = new Div();
    }

    public Div div() {
        return d;
    }

    public static Div Div(Consumer<DivBuilder> divBuilderConsumer) {
        DivBuilder divBuilder = new DivBuilder();
        divBuilderConsumer.accept(divBuilder);
        return divBuilder.d;
    }

    public void textbox(Consumer<TextboxBuilder> consumer) {
        TextboxBuilder builder = new TextboxBuilder();
        consumer.accept(builder);
        d.addChildComponent(builder.textbox());
    }

}
