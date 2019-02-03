package zk.builder;

import zk.Row;

import java.util.function.Consumer;

public class RowBuilder {
    private final Row r;

    public RowBuilder() {
        r = new Row();
    }

    public Row row() {
        return r;
    }

    public static Row Row(Consumer<RowBuilder> consumer) {
        RowBuilder builder = new RowBuilder();
        consumer.accept(builder);
        return builder.r;
    }

    public void div(Consumer<DivBuilder> consumer) {
        DivBuilder builder = new DivBuilder();
        consumer.accept(builder);
        r.addChildComponent(builder.div());
    }
}
