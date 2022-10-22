package com.xy.seele.application.test;

public enum SEASON {
    SPRING(1),SUMMER(2),AUTUMN(3),WINTER(4);
    private final Integer description;

    SEASON(int description) {
        this.description=description;
    }

    @Override
    public String toString() {
        return description.toString();
    }
}
