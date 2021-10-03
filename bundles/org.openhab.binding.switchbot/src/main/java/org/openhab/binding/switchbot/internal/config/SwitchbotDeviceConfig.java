package org.openhab.binding.switchbot.internal.config;

public abstract class SwitchbotDeviceConfig {
    protected String deviceId;

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
