kage claass1;


	class myNumber{
		private int num;
		public int num2;
		public myNumber(int num, int num2){ //constructor
		num=0;
		num2=100;
		}
		int getNum(){
		return num;
		}
		void setNum(int i){
		num=i;
		num2=10*i;
		}
		int getNum2(){
			return num2;
			}
		void Description()
		{
			System.out.println(num);
			System.out.println(num2);
		
		}
		float Avrage()
		{
			int result;
			result=(num+num2)/2;
			System.out.println(result);
			return result;
			
		}
		
		}
	
	public class Class1 {
		public static void main(String[]ar)
		{
		myNumber A=new myNumber(int, int);
		System.out.println(A.getNum());
		A.setNum(10);
		System.out.println(A.getNum());
		System.out.println(A.num2);
		myNumber B=new myNumber(13, 10);
		System.out.println("\nValues of myNumber B initialized with parameters:");
        B.Description();
		}
		}

