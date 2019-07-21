# Shelly Binding (org.openhab.binding.shelly)

This openHAB 2 Binding implements control for the Shelly series of devices. This includes sending commands to the devices as well as reding the device status and sensor data.

Author: Markus Michels (markus7017)
Check  https://community.openhab.org/t/shelly-binding/56862/65 for more information, questions and contributing ideas. Any comment is welcome!

---

Release: alpha5, check master branch for stable release

Please note:
This is a beta release, it has bugs, requires manual install etc. Questions, feedback and contributions are welcome (e.g. improving this documentation).

Channel definitions are subject to change with any alpha or beta release. Please make sure to delete all Shelly things when updating the binding and clean out the JSON DB:
- delete all Shelly things from PaperUI's Inbox and Thing list
- stop OH
- run openhab-cli clean-cache
- check the JSON db files for shelly references, remove all entries
- copy the jar to the addons/ folder
- start OH, wait until everything is initialized
- run the device discovery

If you hit a problem make sure to post a TRACE log (or send PM) so I could look into the details.

Looking for contribution: If you are familar with HTML and CSS you are welcome to contribute a nice HABpanel widget. ;-)

---

## Supported Devices

Devices

* Shelly 1     - fully supported
* Shelly 2     - fully supported
* Shelly 2.5   - fully supported
* Shelly HT    - implenmented, feedback open
* Shelly Smoke - implenmented, feedback open
* Shelly Bulb  - implenmented, feedback open
* Shelly 1PM   - should get discovered, but no special handling yet - contact we if you can do testing
* Shelly 4Pro  - should get discovered, but no special handling yet - contact we if you can do testing
* Shelly RGBW2 - should get discovered, but no special handling yet - contact we if you can do testing
* Shelly Sense - should get discovered, but no special handling yet - contact we if you can do testing

## Binding installation

# Discovery

## Supported Things

|Thing             |Type                                                       |
|------------------|-----------------------------------------------------------|
| shelly1          | Shelly Single Relay Switch                                |
| shelly1pm        | Shelly Single Relay Switch with integrated Power Meter    |
| shelly2-relay    | Shelly Double Relay Switch (Shelly2 and Shelly2.5)        |
| shelly2-roller   | Shelly2 in Roller Mode (Shelly2 and Shelly2.5)            |
| shelly4pro       | Shelly 4x Relay Switch                                    |
| shellyht         | Shelly Sensor (temp+humidity)                             |
| shellysmoke      | Shelly Sensor (temp+humidity)                             |
| shellybulb-color | Shelly Bulb in Color Mode                                 |
| shellybulb-white | Shelly Bulb in White Mode                                 |
| shellyrgbw2      | Shelly RGB Controller                                     |
| shellysense      | Shelly Motion and IR Controller                           |



## Binding Configuration


## Thing Configuration

|Parameter  |Description                                                       |Mandantory|Default         |
|-----------|------------------------------------------------------------------|----------|----------------|
|deviceIp   | IP address of the Shelly device                                  |    yes   |       -        |
|userId   |                                   |       |       -        |
|   |                                   |       |       -        |
|   |                                   |       |       -        |

## Channels

|Group      | Channel   |Type                                                                              |
|-----------|-----------|----------------------------------------------------------------------------------|
|    |  |             |


## Full Example

Note: PaperUI is recommended, if you want to use text files make sure to replace the thing id from you channel definition 

* .things

* .items


* .sitemap

* .rules

## Notes

