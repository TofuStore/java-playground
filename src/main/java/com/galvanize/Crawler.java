package com.galvanize;

import java.net.URI;

public class Crawler implements Browseable{

    URI uri = URI.create("https://www.geeksforgeeks.org");

    @Override
    public void visit(URI uri) {
        this.uri = uri;
    }

    @Override
    public URI getCurrentPage() {
        return uri;
    }
}
