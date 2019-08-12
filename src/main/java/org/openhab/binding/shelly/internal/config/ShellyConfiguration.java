/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.binding.shelly.internal.config;

/**
 * The {@link ShellyConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Hans-Jörg - Initial contribution
 */
public class ShellyConfiguration {

    /**
     * Sample configuration parameter. Replace with your own.
     */
    public String  localIp;

    public String  deviceIp;
    public int     port               = 5684; // default port
    public int     updateInterval     = 15;
    public float   lowBattery         = 20;

    public String  userId             = "";
    public String  password           = "";

    public boolean eventsRelayButton  = true;
    public boolean eventsRelaySwitch  = true;
    public boolean eventsSensorReport = true;
}
