package com.currentcad.sdk.searchstatus;

import com.current.tps.sdk.entity.Drawing;
import com.current.tps.sdk.sdk.SDK;

/**
 * 查询图纸导入状态
 */
public class SearchDrawing {
    public static void main(String[] args) {
        SDK sdk = new SDK();
        //由公司颁发的账号密码
        sdk.setUsername("xxxxxxxxx");
        sdk.setPassword("xxxxxx");
        //查询参数为drawingId/materialCode
        Drawing drawing = sdk.getDrawingStatus("xxxxxx");
        System.out.println(drawing);
    }
}
