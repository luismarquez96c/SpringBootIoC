package net.luismarquez.projects.SpringBootIoC.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentA {

    @Autowired
    private ComponentB componentB;

}
