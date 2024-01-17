package com.currentcad.sdk.materialcode;

import com.current.servicemanager.sdk.entity.MaterialCodeInfo;
import com.current.servicemanager.sdk.service.SDKService;

/**
 * 料号相关
 * @author hp
 */
public class MaterialCodeExample {
    public static void main(String[] args) {
        //由公司颁发的账号密码,需要链接的环境  如current环境 https://www.currentcad.com
        SDKService sdk = new SDKService("xxxxxxxxxx", "xxxxxx", "");
        //图纸增加料号  请求参数为图纸id和料号
        MaterialCodeInfo materialCode = sdk.addMaterialCode("xxxxxxxx", "2222");
        //删除料号
        //sdk.delMaterialCode("xxxxxxx", "xxxxxxx", "");
        System.out.println(materialCode);
    }
}
