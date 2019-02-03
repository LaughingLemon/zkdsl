package zk;

import java.util.ArrayList;
import java.util.List;

public class WebComponent {
    private List<WebComponent> components = new ArrayList<>();

    private final String name;

    public WebComponent(String name) {
        this.name = name;
    }

    public void addChildComponent(WebComponent w) {
        components.add(w);
    }

    @Override
    public String toString() {
        return "Contains:" + components.stream()
                         .map(WebComponent::toString)
                         .reduce("", String::concat);
    }
}
