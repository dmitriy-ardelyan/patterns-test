package com.dmitriy.test.patterns.proxy.implementations;

import com.dmitriy.test.patterns.proxy.interfaces.IImage;

import java.util.Objects;

public class ProxyImageViewer implements IImage {
    private String filePath;
    private RealImageViewer realImageViewer;

    public ProxyImageViewer(String filePath){
        this.filePath = filePath;
    }

    @Override
    public void showImage() {
        System.out.println("Proxy additional logic before origilan show image");
        if (Objects.isNull(realImageViewer)){
            realImageViewer = new RealImageViewer(filePath);
        }
        realImageViewer.showImage();
    }
}
