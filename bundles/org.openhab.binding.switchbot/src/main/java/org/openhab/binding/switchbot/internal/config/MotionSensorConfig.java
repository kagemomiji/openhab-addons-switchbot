package org.openhab.binding.switchbot.internal.config;

public class MotionSensorConfig extends SwitchbotDeviceConfig {
    private int refreshInterval;

    public int getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(int refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    @Override
    public String toString() {
        return "HumidifierConfig [deviceId=" + deviceId + ", refreshInterval=" + refreshInterval + "]";
    }
}
