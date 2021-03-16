package jwbind;

import java.util.ArrayList;
import java.util.List;

public class ClassDesc {
    public String className;
    public List<String> attributes;
    public List<String> methods;

    public ClassDesc() {
        this.attributes = new ArrayList<>();
        this.methods = new ArrayList<>();
    }
}

