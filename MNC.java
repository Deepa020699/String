class MNC{
static String[] printCompanies(String []Companies)
{
for(int index=0; index<companies.length; index=index+1){
System.out.println("Companies are: "+companies[index]);
}
System.out.println();
return companies;
}
public static void main(String []args){
String companies[]={"INFOSYS","WIPRO","APPLE","ACCENTURE","CAPEMINI"};
printCompanies(companies);
companies[6]="MICROSOFT";
printCompanies(companies);
}
}