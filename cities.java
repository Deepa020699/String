class cities{
static String[] printCities(String []items)
{
for(int index=0; index<cities.length; index=index+1){
System.out.println("Citiess are: "+cities[index]);
}
System.out.println();
return cities;
}
public static void main(String []args){
String cities[]={"BANGALORE","MYSORE","HUBLI","DHARWAD","MUMBI"};
printItems(cities);
cities[3]="DELHI";
printCities(cities);
}
}