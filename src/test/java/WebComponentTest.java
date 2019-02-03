import org.junit.Test;
import zk.Row;
import zk.Textbox;
import zk.WebComponent;

import java.lang.reflect.InvocationTargetException;

import static zk.builder.RowBuilder.*;

import static graph.builder.GraphBuilder.Graph;

public class WebComponentTest {

    Textbox somthingToElse = null;

    @Test
    public void testGraph() {
        Row r1 = Row(r -> {
            r.div(d -> {
                d.textbox(t -> {
                    somthingToElse = t.setSclass("").textbox();
                });
                d.textbox(t -> {
                });
            });
        });

        System.out.println(r1);
        System.out.println(somthingToElse);
    }

    private <T extends WebComponent> T createComponent(final Class<T> clazz) {
        try {
            return clazz.getConstructor(String.class).newInstance("My Name");
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void genericTest() {
        Textbox t = createComponent(Textbox.class);
        System.out.println(t.toString());
    }
}