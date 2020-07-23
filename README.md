First meeting with enum class.

Written code describes basic function of traffic light.
Client allows to check status of all 3 lights, and set another light on, at the same time setting other 2 lights off:

Example, starting with red light on:

red (true)
yellow (false)
green (false)

line 43: TrafficLight.setOn("yellow");

red (false)
yellow (true)
green (false)

line 45: TrafficLight.setOn("green");

red (false)
yellow (false)
green (true)
