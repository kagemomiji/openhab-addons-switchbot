package org.openhab.binding.switchbot.internal.config;

public class MeterConfig extends SwitchbotDeviceConfig {
    private int refreshInterval;

    public int getRefreshInterval() {
        return this.refreshInterval;
    }

    public void setRefreshInterval(int refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    @Override
    public String toString() {
        return "MeterConfig [deviceId=" + this.deviceId + ", refreshInterval=" + refreshInterval + "]";
    }
}
