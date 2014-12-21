Lyft Programming Challenge
==============

Solution for the Lyft Programming Challenge 

```
Calculate the detour distance between two different rides. Given four latitude / longitude pairs, 
where driver one is traveling from point A to point B and driver two is traveling from point C to point D, 
write a function (in your language of choice) to calculate the shorter of the detour distances the drivers 
would need to take to pick-up and drop-off the other driver.
```

My solution assumes that both drivers are travelling through a straight line, so in my solution the detour distance is: (extra path driver 1 would have to travel to reach the driver 2 + the distance driver2 has to travel) - (driver1 original path)

For driver 1 the detour distance would be the sum of going through the points in the following manner: 
( A->C->D->B ) - ( A->B )

In the same way to get the detour distance for driver2 he would go through the points in the following manner:
( C->A->B->D ) - ( C->D )

This solution makes use of the haversine formula in order to calculate the distance between two coordinates,
it assumes that the drivers are travelling in a straight line.

The entry point for the program is located at: 
https://github.com/DamoneMX/lyft_challenge/blob/master/com/arie/main/DetourCalculator.java

And helper classes and methods are located at: 
https://github.com/DamoneMX/lyft_challenge/tree/master/com/arie/helpers
