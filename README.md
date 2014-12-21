Lyft Programming Challenge
==============

Solution for the Lyft Programming Challenge 

```
Calculate the detour distance between two different rides. Given four latitude / longitude pairs, 
where driver one is traveling from point A to point B and driver two is traveling from point C to point D, 
write a function (in your language of choice) to calculate the shorter of the detour distances the drivers 
would need to take to pick-up and drop-off the other driver.
```

This solution makes use of the haversine formula in order to calculate the distance between two coordinates,
it assumes that the drivers are travelling in a straight line.

The entry point for the program is at: 
https://github.com/DamoneMX/lyft_challenge/blob/master/com/arie/main/DetourCalculator.java

And helper classes and methods are located at: 
https://github.com/DamoneMX/lyft_challenge/tree/master/com/arie/helpers
