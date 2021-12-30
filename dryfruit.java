class dryfruit{
static String[] printTypes(String []types)
{
for(int index=0; index<types.length; index=index+1){
System.out.println("Types are: "+types[index]);
}
System.out.println();
return types;
}
public static void main(String []args){
String types[]={"ALMOND","CASHEWS","WALNUT","RAISINS","DATES","BERRIES"};
printTypes(types);
types[5]="PISTCIOS";
printTypes(types);
}
}