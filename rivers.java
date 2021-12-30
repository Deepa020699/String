class rivers{
static String[] printNames(String []names)
{
for(int index=0; index<names.length; index=index+1){
System.out.println("Names are: "+names[index]);
}
System.out.println();
return names;
}
public static void main(String []args){
String names[]={"GANGA","KAVERI","TUNGABHADRA","KRISHNA","BRAHMAPUTRA","KABINI","GODAVARI"};
printNames(names);
names[6]="AMAZON";
printNames(names);
}
}