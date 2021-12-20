interface iShape03 //界面 iShape03
{
	public void show();
	public int area();
}
interface iColor //界面 iColor
{
	public void showColor();
}
class CWin implements iShape03
{
	protected int width;
	protected int height;
	protected String color;
	public CWin(int w,int h,String str)
	{
		width = w;
		height = h;
		color = str;
	}
	public void show()
	{
		System.out.println("color="+color);
		System.out.println("width="+width);
		System.out.println("height="+height);
		System.out.println("area="+width*height);
		
	}
	public int area()
	{
		System.out.println("area="+width*height);
	}
	public void showColor()
	{
		System.out.println("color="+color);
	}
}
public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWin win=new CWin(5,7,"Green");
		win.show();
	}

}
