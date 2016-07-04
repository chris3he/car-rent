package dada;

public class Car {
static int  passengers=5;
static int nums=15;
static int price=200;
static int num;
public static void introduce()
{
	System.out.println("载客量"+passengers+"可供出租"+nums+"辆");
	}
public static void shu()
{
	System.out.println("请输入你要租车的数量");
	}
public static void jiage()
{
	System.out.println("你已选中轿车价格是:"+price+"每天;"+"总价格是:"+num*price);	
}
}
