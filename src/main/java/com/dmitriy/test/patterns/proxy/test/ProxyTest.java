package com.dmitriy.test.patterns.proxy.test;

import com.dmitriy.test.patterns.proxy.implementations.ProxyImageViewer;
import com.dmitriy.test.patterns.proxy.implementations.RealImageViewer;

public class ProxyTest {
    public static void main(String[] args) {
        //RealImageViewer realImageViewer = new RealImageViewer("C:/Picture/Opana.jpg");
        //realImageViewer.showImage();
        ProxyImageViewer proxyImageViewer = new ProxyImageViewer("C:/Pictures/opana.jpg");
        proxyImageViewer.showImage();
    }
}
