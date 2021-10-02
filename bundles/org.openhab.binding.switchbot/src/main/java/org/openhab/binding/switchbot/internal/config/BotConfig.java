package org.openhab.binding.switchbot.internal.config;

public class BotConfig extends SwitchbotDeviceConfig {
    private int refreshInterval;

    public int getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(int refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    @Override
    public String toString() {
        return "BotConfig [refreshInterval=" + refreshInterval + ", deviceId=" + deviceId + "]";
    }
}
