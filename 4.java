import java.util.GregorianCalendar;
import java.util.Scanner;
public class _4 {
	 
		public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
			System.out.println("输入年份：");
			int year = scan.nextInt();
			System.out.println("输入月份：");
			int month = scan.nextInt();
			System.out.println("输入日期：");
			int day = scan.nextInt();
		
			GregorianCalendar gre = new GregorianCalendar();
			boolean isLeapYear=gre.isLeapYear(year);//返回true:是闰年，false：不是闰年
			
			int ap=isLeapYear?29:28;//判断2月份的天数
			int days=0;
			switch (month) {
			case 1:
				days=day;
				break;
			case 2:
				days=31+day;
				break;
			case 3:
				days=31+ap+day;
				break;
			case 4:
				days=31+ap+31+day;
				break;
			case 5:
				days=31+ap+31+30+day;
				break;
			case 6:
				days=31+ap+31+30+31+day;
				break;
			case 7:
				days=31+ap+31+30+31+30+day;
				break;
			case 8:
				days=31+ap+31+30+31+30+31+day;
				break;
			case 9:
				days=31+ap+31+30+31+30+31+31+day;
				break;
			case 10:
				days=31+ap+31+30+31+30+31+31+30+day;
				break;
			case 11:
				days=31+ap+31+30+31+30+31+31+30+31+day;
				break;
			case 12:
				days=31+ap+31+30+31+30+31+31+30+31+30+day;
				break;
	 
			default:
				System.out.println("月份输入错误");
				break;
			}
			System.out.println("这一天是这一年的第"+days+"天");
	}
	 
	}
