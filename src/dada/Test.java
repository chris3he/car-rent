package dada;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Car c=new Car();
		Pika p=new Pika();
		Track t=new Track();
		Tishi r=new Tishi();
		Kongzhi k=new Kongzhi();
		// TODO Auto-generated method stub
		System.out.println("欢迎来到答答租车系统，是否进入？");
		System.out.println("任意键进入按0退出");
	Scanner s=new Scanner(System.in);
	k.i=s.nextInt();
while(k.i!=0)
{r.remind();
int j=s.nextInt();
switch(j)
{
case 1:{Car.introduce();
Car.shu();
Car.num=s.nextInt();
Car.jiage();
k.i=0;
}break;
case 2:{
	Track.introduce();
	Track.shu();
	Track.num=s.nextInt();
	Track.jiage();
	k.i=0;
	}break;
case 3:{Track.introduce();
Pika.shu();
Pika.num=s.nextInt();
Pika.jiage();
k.i=0;}break;
default:
	System.out.println("请输入有效选项");
}
}
	}

}
