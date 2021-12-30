class makeupBrands{
static String[] printItems(String []items)
{
for(int index=0; index<items.length; index=index+1){
System.out.println("Items are: "+items[index]);
}
System.out.println();
return items;
}
public static void main(String []args){
String items[]={"LAKME","MAC","MAYBELLINE","HUDA","SWISS","HUDA","LORIAL","IBA"};
printItems(items);
items[4]="PONDS";
printItems(items);
}
}