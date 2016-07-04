package dada;

public class Track {
static float stock=10f;
static int nums=20;
static int price=150;
static int num;
public static void introduce()
{
	System.out.println("载货量"+stock+"可供出租"+nums+"辆");
	}
public static void shu()
{
	System.out.println("请输入你要租车的数量");
	}
public static void jiage()
{
	System.out.println("你已选卡车价格是:"+price+"每天;"+"总价格是:"+num*price);	
}
}

