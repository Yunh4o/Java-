
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		�ٶ�һ���༶��30��ѧ�����������30~100�ֵĳɼ�����������߷֡���ͷ֣��ڶ��߷֣������ܺ͡�ƽ���֡���߷ֵ��±ꡢ��ͷֵ��±�
//		�ѳɼ���߷ֵ�Ԫ�ؽ��������
//		ͳ�� 90������ 80������ 70������ 60������ �Լ������������

		//��������
		int [ ] students = new  int [30];
		
		for(int i = 0 ; i < students.length; i++) {
			int r = (int)Math.floor(Math.random() * (100 - 30 + 1)) + 30 ;
			students[i] = r ;
		}
		//ԭʼ����
		for(int i = 0 ; i < students.length ; i++) {
			if(i % 3 == 0) {
				System.out.println();
			}
			System.out.print("ѧ��"+(i + 1)+ "�ɼ���"+students[i]+"\t");
			
		}
		//������߷�,��ͷ�,�ڶ��߷�,�ܷ�,ƽ����,��߷ֵ��±�,��ͷֵ��±�
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
		//��߷ֵ��±�,��ͷֵ��±�,�ѳɼ���߷ֵ�Ԫ�ؽ��������
		System.out.println("��С�±꣺  = "+minIndex);
		System.out.println("����±꣺  = "+maxIndex);
		System.out.println("������ɼ���");
		int temp = students[maxIndex];
		students[maxIndex] = students[29];
		students[29] = temp;
		System.out.println("ѧ��"+ (maxIndex + 1) + "�ɼ���"+ students[maxIndex]);
		System.out.println("���һ���ɼ�"+":"+ students[29]);
		
		//ͳ�� 90������ 80������ 70������ 60������ �Լ������������
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
		System.out.println("90�������������� "+ grade90);
		System.out.println("80�ּ�����������  "+ grade80);
		System.out.println("70�ּ�����������  "+ grade70);
		System.out.println("60�ּ�����������  "+ grade60);
		System.out.println("������ ������  "+ gradeFail);
	}

}
