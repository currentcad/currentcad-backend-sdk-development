package com.currentcad.sdk.materialcode;

import com.current.tps.sdk.entity.MaterialCodeInfo;
import com.current.tps.sdk.sdk.SDK;

/**
 * 料号相关
 */
public class MaterialCodeExample {
    public static void main(String[] args) {
        SDK sdk = new SDK();
        //由公司颁发的账号密码
        sdk.setUsername("xxxxxxxxx");
        sdk.setPassword("xxxxxx");
        //图纸增加料号  请求参数为图纸id和料号
        MaterialCodeInfo materialCode = sdk.addMaterialCode("xxxxxxxx", "2222");
        //删除料号
        //sdk.delMaterialCode("xxxxxxx", "xxxxxxx");
        System.out.println(materialCode);
    }
}
