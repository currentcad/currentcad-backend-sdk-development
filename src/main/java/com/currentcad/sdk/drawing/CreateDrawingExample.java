package com.currentcad.sdk.drawing;

import com.current.tps.sdk.entity.Drawing;
import com.current.tps.sdk.sdk.SDK;

/**
 * CurrentCAD token获取示例
 */
public class CreateDrawingExample {
    public static void main(String[] args) {
        SDK sdk = new SDK();
        //由公司颁发的账号密码
        sdk.setUsername("xxxxxxxxx");
        sdk.setPassword("xxxxxx");

        Drawing drawing = sdk.createDrawing("ysx");
        System.out.println(drawing);
    }
}
