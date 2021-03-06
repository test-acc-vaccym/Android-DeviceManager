package com.nd.adhoc.dmsdk.api.manager.app;

import android.content.Context;
import android.support.annotation.NonNull;

import com.nd.adhoc.dmsdk.api.IDeviceManager;
import com.nd.adhoc.dmsdk.api.exception.DeviceManagerSecurityException;

import java.util.List;

/**
 * 获取应用列表
 */
public interface IApplicationManager_GetPackageList extends IDeviceManager {

    List<String> getApplicationPackageList(@NonNull Context context) throws DeviceManagerSecurityException;
}
