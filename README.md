First meeting with enum class.

Written code describes basic function of traffic light.
Client allows to check status of all 3 lights, and set another light on, at the same time setting other 2 lights off:

Example, starting with red light on:

red (true)
yellow (false)
green (false)

***

second commit:

Simple control of input word is added.
Method 	
private static TrafficLight checkColor(String colorName)
checks if a passed parameter is valid, and asks to type colorName again if not.

Exception handling is used for that. 
