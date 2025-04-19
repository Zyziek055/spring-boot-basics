package com.zyziek055.spring_boot_basics;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy //This annotation prevents object (component) from creating too early, it is used for heavy object
//(like when creating an object needs a lot of memory)
public class HeavyResource {
    public HeavyResource() {
        System.out.println("HeavyResource created");
    }
}