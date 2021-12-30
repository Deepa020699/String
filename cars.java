class cars{
static String[] printTypes(String []types)
{
for(int index=0; index<types.length; index=index+1){
System.out.println("Types are: "+types[index]);
}
System.out.println();
return types;
}
public static void main(String []args){
String types[]={"BMW","TOYOTO","JAGUAR","FERRARI","HYUDAI"};
printTypes(types);
types[3]="LAMBORINI";
printTypes(types);
}
}