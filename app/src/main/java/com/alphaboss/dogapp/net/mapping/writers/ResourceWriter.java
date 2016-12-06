package com.alphaboss.dogapp.net.mapping.writers;

import java.io.IOException;

public interface ResourceWriter<E, Writer> {
    void write(E e, Writer writer) throws IOException;
}
