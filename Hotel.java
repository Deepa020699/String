class Hotel{
static String[] printItems(String []items)
{
for(int index=0; index<items.length; index=index+1){
System.out.println("Items are: "+items[index]);
}
System.out.println();
return items;
}
public static void main(String []args){
String items[]={"Idli","vada","dosa","uppit","tea"};
printItems(items);
items[2]="puri";
printItems(items);
}
}