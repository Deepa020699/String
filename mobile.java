class mobile{
static String[] printTypes(String []types)
{
for(int index=0; index<types.length; index=index+1){
System.out.println("Types are: "+typess[index]);
}
System.out.println();
return types;
}
public static void main(String []args){
String types[]={"APPLE","SAMSUNG","REDMI","OPPO","VIVO","NOKIA","POCO","LENOVO"};
printTypes(types);
types[7]="ONE+";
printTypes(types);
}
}