class Milk{
public static void main(String []args)
{
Milk mi=new Milk();
mi.milk();
}
void milk()
{
int milk=0;
int day=1;
while(day<=28)
{
day=day+2;
milk=milk+21;
}
System.out.println(milk);
}
}

