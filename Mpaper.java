class Mpaper{
public static void main(String []args){
Mpaper news=new Mpaper();
news.News();
}
void News()
{
int paper=0;
int day=1;
int month=30;
while(day<=28)
{
day=day+1;
paper=7+paper;
}
paper=paper+month;
System.out.println(paper);
}
}

