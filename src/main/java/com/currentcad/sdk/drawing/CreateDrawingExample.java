package com.currentcad.sdk.drawing;

import com.current.servicemanager.sdk.entity.Drawing;
import com.current.servicemanager.sdk.service.SDKService;

/**
 * CurrentCAD token获取示例
 */
public class CreateDrawingExample {
    public static void main(String[] args) {
        //由公司颁发的账号密码 需要链接的环境  如current环境 https://www.currentcad.com
        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx", "");

        Drawing drawing = sdk.createDrawing("ysx");
        System.out.println(drawing);
    }
}
