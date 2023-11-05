package net.luismarquez.projects.SpringBootIoC.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ComponentC {

    @Autowired
    @Lazy
    private ComponentA componentA;

}
