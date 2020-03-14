package springexamples;

public class Address {
String city;
String street;
Address(String city,String street)
{
	this.city=city;
	this.street=street;
	
}
@Override
public String toString() {
	return "Address [city=" + city + ", street=" + street + "]";
}

}
