
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		假定一个班级有30个学生，随机产生30~100分的成绩，并计算最高分、最低分，第二高分，分数总和、平均分、最高分的下标、最低分的下标
//		把成绩最高分的元素交换到最后
//		统计 90分以上 80分以上 70分以上 60分以上 以及不及格的人数

		//定义数组
		int [ ] students = new  int [30];
		
		for(int i = 0 ; i < students.length; i++) {
			int r = (int)Math.floor(Math.random() * (100 - 30 + 1)) + 30 ;
			students[i] = r ;
		}
		//原始数据
		for(int i = 0 ; i < students.length ; i++) {
			if(i % 3 == 0) {
				System.out.println();
			}
			System.out.print("学生"+(i + 1)+ "成绩："+students[i]+"\t");
			
		}
		//计算最高分,最低分,第二高分,总分,平均分,最高分的下标,最低分的下标
		int maxIndex = 0;
		int minIndex = 0;
		int max1 = students[maxIndex];
		int max2 = students[0];
		int min  = students[minIndex];
		int sum  = 0;
		int average = 0 ;

		for(int i = 0 ; i < students.length ; i++) {
			if (students[i] > max1) {
				max2 = max1;
				max1 = students[i];
				maxIndex = i;
			}else {
				if (students[i] > max2) {
					max2 = students[i];
				}
			}
			if(students[i] < min ) {
				min = students[i];
				minIndex = i;
			}
			sum += students[i];	
			average = sum / 30 ;
		}
		System.out.println();
		System.out.println("max1 = "+max1);
		System.out.println("max2 = "+max2);
		System.out.println("min  = "+min);
		System.out.println("sum  = "+sum);
		System.out.println("average  = "+average);	
		//最高分的下标,最低分的下标,把成绩最高分的元素交换到最后
		System.out.println("最小下标：  = "+minIndex);
		System.out.println("最大下标：  = "+maxIndex);
		System.out.println("交换后成绩：");
		int temp = students[maxIndex];
		students[maxIndex] = students[29];
		students[29] = temp;
		System.out.println("学生"+ (maxIndex + 1) + "成绩："+ students[maxIndex]);
		System.out.println("最后一个成绩"+":"+ students[29]);
		
		//统计 90分以上 80分以上 70分以上 60分以上 以及不及格的人数
		int [] grade = new int [11];
		for(int i = 0 ; i < students.length; i++) {
			int x = students[i] / 10 ;
			grade[x] ++;
		}
		int grade90 = grade[9] + grade[10];
		int grade80 = grade[8];
		int grade70 = grade[7];
		int grade60 = grade[6];
		int gradeFail = grade[3] + grade[4] + grade[5];
		System.out.println("90及分以上人数： "+ grade90);
		System.out.println("80分及以上人数：  "+ grade80);
		System.out.println("70分及以上人数：  "+ grade70);
		System.out.println("60分及以上人数：  "+ grade60);
		System.out.println("不及格 人数：  "+ gradeFail);
	}

}
