package com.dmitriy.test.patterns.proxy.implementations;

import com.dmitriy.test.patterns.proxy.interfaces.IImage;

public class RealImageViewer implements IImage {
    String filePath;

    public RealImageViewer(String filePath) {
        this.filePath = filePath;
        System.out.println("Load image by file path = " + filePath);
    }

    @Override
    public void showImage() {
        System.out.println("Displaying image loaded by file " + filePath);
    }
}
