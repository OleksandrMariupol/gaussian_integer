{
 BesselK(Undefined, y_):=Undefined,
 BesselK(x_, Undefined):=Undefined, 
 BesselK(-1/2,z_):=Sqrt(2/Pi)/(E^z*Sqrt(z)), 
 BesselK(1/2,z_):=Sqrt(2/Pi)/(E^z*Sqrt(z)) 
}