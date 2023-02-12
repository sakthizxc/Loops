class Ticket5{
public static void main(String []args)
{
Ticket5 tic=new Ticket5();
tic.bus();
}
void bus()
{
int gbus=15;
int auto=10;
int day=1;
int profit;
int price=auto+gbus;
while(day<22)
{
day=day+1;
price=price+25;
auto=auto+10;
}
profit=price-auto;
System.out.println(price);
System.out.println(auto);
System.out.println("profit "+profit);
}
}




