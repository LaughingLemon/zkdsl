package zk.builder;

import zk.Textbox;

public class TextboxBuilder {
    private final Textbox t;

    public TextboxBuilder() {
        t = new Textbox("");
    }

    public Textbox textbox() {
        return t;
    }

    public TextboxBuilder setSclass(String className){
        t.setSclass(className);
        return this;
    }
}
