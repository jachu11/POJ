package com.company;

public interface Rysowalny extends PrzedstawiaEmocje {
    void draw();

    @Override
    boolean czySieUsmiecha();

    @Override
    void przestanSieUsmiechac();
}
