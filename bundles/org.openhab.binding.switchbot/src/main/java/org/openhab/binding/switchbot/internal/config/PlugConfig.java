package org.openhab.binding.switchbot.internal.config;

public class PlugConfig extends SwitchbotDeviceConfig {
    private int refreshInterval;

    public int getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(int refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    @Override
    public String toString() {
        return "MeterConfig [deviceId=" + deviceId + ", refreshInterval=" + refreshInterval + "]";
    }
}
