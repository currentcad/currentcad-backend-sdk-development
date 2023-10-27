package com.currentcad.sdk.drawing;

import com.current.tps.sdk.entity.Drawing;
import com.current.tps.sdk.entity.ReqCopyDrawingInfo;
import com.current.tps.sdk.sdk.SDK;

/**
 * 图纸复制测试
 */
public class CopyExample {
    public static void main(String[] args) {
        SDK sdk = new SDK();
        //由公司颁发的账号密码
        sdk.setUsername("xxxxxxxxx");
        sdk.setPassword("xxxxxx");
        /**
         * 根据图纸复制
         */
        ReqCopyDrawingInfo drawing = new ReqCopyDrawingInfo();
        drawing.setIsTemplate(false);
        //账号
        //加密后的账号
        drawing.setOwner("yangsenxiang@currentcad.com");
        //文件名
        drawing.setName("ysx1_Copy");
        //用户id
        drawing.setUserId("871c9a3ab34c489a8d6e608e11c756ed");
        drawing.setProjectId("public");
        drawing.setParentId("public");
        //被复制的图纸id
        drawing.setDrawingId("3:09fac82f6f8c4aedb3c760fd089585b4");

        Drawing copyDrawing = sdk.copyDrawing(drawing);

        /**
         * 根据图纸id复制
         */
        // Drawing copyDrawingById = sdk.copyDrawingById("被复制的图纸id");
        /**
         * Copy 图纸，自定义文件名称
         */
        // Drawing drawing = sdk.copyDrawing("图纸ID", "自定义图纸名称")
    }
}
