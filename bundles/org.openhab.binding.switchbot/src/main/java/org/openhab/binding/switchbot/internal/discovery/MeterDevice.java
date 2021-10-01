package org.openhab.binding.switchbot.internal.discovery;

/**
 * Represents a discovered Meter device.
 *
 * @author kagemomiji
 */
public class MeterDevice extends SwitchbotDevice {

    public MeterDevice(String name, String deviceId) {
        super(name, deviceId, DeviceType.METER);
    }
}
