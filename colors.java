class colors{
static String[] printColors(String []colors)
{
for(int index=0; index<colors.length; index=index+1){
System.out.println("Colors are: "+colors[index]);
}
System.out.println();
return colors;
}
public static void main(String []args){
String colors[]={"black","red","yellow","pink","blue"};
printColors(colors);
colors[4]="purple";
printColors(colors);
}
}