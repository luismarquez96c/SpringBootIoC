package net.luismarquez.projects.SpringBootIoC.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentB {

    @Autowired
    private ComponentC componentC;

}
