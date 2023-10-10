package com.currentcad.sdk.drawing;

import com.current.tps.sdk.entity.Drawing;
import com.current.tps.sdk.sdk.SDK;

/**
 * 图纸归档示例
 */
public class DrawingArchivingExample {
    public static void main(String[] args) {
        SDK sdk = new SDK();
        //由公司颁发的账号密码
        sdk.setUsername("xxxxxxxxx");
        sdk.setPassword("xxxxxx");
        Drawing drawing = sdk.drawingArchiving("3:09fac82f6f8c4aedb3c760fd089585b4");
        System.out.println(drawing);
    }
}
