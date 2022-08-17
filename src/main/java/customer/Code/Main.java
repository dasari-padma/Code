package customer.Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Main {

	public static void main(String[] args)
	{

ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(1, "Padma",5000,21));
		al.add(new Employee(2, "Parvathi",10000,22));
		al.add(new Employee(3, "Anitha",15000,23));
		al.add(new Employee(4, "Sujatha",20000,24));
		al.add(new Employee(5, "Teja",25000,25));
		al.add(new Employee(6, "Durga Prasad",30000,26));
		al.add(new Employee(7, "Ramana",35000,27));
		al.add(new Employee(8, "Narayana",40000,28));
		al.add(new Employee(9, "Mohan",45000,29));
		al.add(new Employee(10, "Charan",50000,30));
		
		int len=al.size();
		Scanner sc = new Scanner(System.in);
		
		String whilechoice = "go";
		while(whilechoice=="go")
		{
			String avail = "False";
			System.out.println("Enter Your chice");
			System.out.println("1-> Display Customer Details");
			System.out.println("2-> Customer Data in ascending Order");
			System.out.println("3-> update Purchase amount of customer");
			System.out.println("4-> Exit");
			
			System.out.print(" ");
			int a = sc.nextInt();
			
			switch(a)
			{
			case 1:
				System.out.println("");
				System.out.println("Customer Data..");
				System.out.println("Employee Id  Name PurchaseAmount Age");
				for(Employee st:al)
				{
					System.out.println(st.cid+" "+st.name+" "+st.purchaseAmount+" "+st.age);
				}
				
				break;
			case 2:System.out.println(" ");
			System.out.println("Customer Data in ascending Order");
			Collections.sort(al);
			for(Employee st:al)
			{
				System.out.println(st.cid+" "+st.name+" "+st.purchaseAmount+" "+st.age);
			}
			break;
			case 3: 
				System.out.println("");
				System.out.println("Enter Employee Id to update Purchase amount");
				int b = sc.nextInt();
				System.out.println("Enter new purchase amount");
				int c = sc.nextInt();
				for(int i=0;i<len;i++)
				{
					if(al.get(i).cid==b)
					{
						al.get(i).setPurchaseAmount(c);
						avail="True";
						System.out.println("Updated Purchase amount"+al.get(i).cid+" "+al.get(i).name+" "+al.get(i).purchaseAmount+" "+al.get(i).age);
						
					}
				}
				if("False".equals(avail))
				{
					System.out.println("Invalid Customer Id");
				}
				break;
			case 4:
				System.out.println("");
				whilechoice="stop";
				System.out.println("Exit");
				break;
			}
		}
	}

}
