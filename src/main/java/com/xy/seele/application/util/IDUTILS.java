package com.xy.seele.application.util;

import java.util.UUID;

public class IDUTILS {
    public static String getId() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
