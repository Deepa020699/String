class fastfood{
static String[] printItems(String []items)
{
for(int index=0; index<items.length; index=index+1){
System.out.println("Items are: "+items[index]);
}
System.out.println();
return items;
}
public static void main(String []args){
String items[]={"panipuri","belpuri","sevpuri","pasta","gobi"};
printItems(items);
items[2]="french fries";
printItems(items);
}
}