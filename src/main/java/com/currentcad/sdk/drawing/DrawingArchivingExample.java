package com.currentcad.sdk.drawing;


import com.current.servicemanager.sdk.entity.Drawing;
import com.current.servicemanager.sdk.service.SDKService;

/**
 * 图纸归档示例
 * @author hp
 */
public class DrawingArchivingExample {
    public static void main(String[] args) {
        //由公司颁发的账号密码,需要链接的环境  如current环境 https://www.currentcad.com
        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx", "");
        Drawing drawing = sdk.drawingArchiving("3:09fac82f6f8c4aedb3c760fd089585b4");
        System.out.println(drawing);
    }
}
