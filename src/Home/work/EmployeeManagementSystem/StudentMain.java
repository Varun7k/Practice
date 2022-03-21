package Home.work.EmployeeManagementSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student list[] = new Student[10];
		int counter = 0;
		while (true) {
			System.out.println("Enter 1 to Add Student Details");
			System.out.println("Enter 2 to Edit Student Details");
			System.out.println("Enter 3 to Print Maximum Percentage of Students");
			System.out.println("Enter 4 to Print Minimum Percentage of Students");
			System.out.println("Enter 5 to Sort Students With Percentage");
			System.out.println("Enter 6 to Sort Students with names");
			System.out.println("Enter 7 to Sort Students with RollNo");
			System.out.println("Enter 8 to Display Student Details");
			System.out.println("Enter 9 to Exit");

			int enter = sc.nextInt();
			if (enter == 1) {
				//add Student details
				System.out.println("Enter Roll Number:");
				int roll = sc.nextInt();
				System.out.println("Enter Branch:");
				String branch = sc.next();
				System.out.println("Enter Name:");
				String name = sc.next();
				System.out.println("Enter Percentage:");
				double per = sc.nextDouble();
				// Date Format
				DateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				String newdate = dateformat.format(date);

				Student s = new Student(roll, branch, name, per, newdate);
				list[counter] = s;
				counter = counter + 1;

			}
			if (enter == 2) {
				int count = 0;
				for (Student s : list) {
					if (s != null) {
						System.out.println("Enter " + count + " " + s);
						count = count + 1;
					}
				}
				int editEnter = sc.nextInt();
				/*Student ob = list[editEnter];
				ob.getName();
				ob.getRoll();
				ob.getBranch();
				ob.getPer();*/
				System.out.println("Enter 1 to Update Name:");
				System.out.println("Enter 2 to Update RollNumber:");
				System.out.println("Enter 3 to Update Branch");
				System.out.println("Enter 4 to Update Percentage");
				int editOption = sc.nextInt();
				if (editOption == 1) {
					System.out.println("Enter New Name:");
					list[editEnter].setName(sc.next());
					System.err.println("Name Updated");

				} else if (editOption == 2) {
					System.out.println("Enter New RollNumber");
					list[editEnter].setRoll(sc.nextInt());
					System.err.println("RollNumber Updated");
				} else if (editOption == 3) {
					System.out.println("Enter New Branch");
					list[editEnter].setBranch(sc.next());
					System.err.println("Branch Updated");
				} else if (editOption == 4) {
					System.out.println("Enter New Percentage");
					list[editEnter].setPer(sc.nextDouble());
					System.err.println("Percentage Updated");
				} else
					System.err.println("Wrong Choice");
			}
			if (enter == 3) {
				int c=0;
				double max = list[0].getPer();
				for (int i = 0; i < list.length; i++) {
					if (list[i] != null) {
						if (list[i].getPer() > max) {
							max = list[i].getPer();
							c=i;
						}
					}
				}
				System.err.println("The Maximum salary is:"+list[c].getName()+" of "+max);

			}
			if (enter == 4) {
				int c=0;
				double min = list[0].getPer();
				for (int i = 0; i < list.length; i++) {
					if (list[i] != null) {
						if (list[i].getPer() < min) {
							min = list[i].getPer();
							c=i;
						}
					}
					
				}
				System.err.println("The minimum salary is:"+list[c].getName()+" of "+min);

			}
			if (enter == 5) {
				for (int i = 0; i < list.length; i++) {
					for (int j = 0; j < list.length; j++) {
						if (list[i] != null && list[j] != null) {
							if (list[i].getPer() < list[j].getPer()) {
								Student temp = list[i];
								list[i]=list[j];
								list[j]=temp;
							}
						}
					}
				}
				for(int i=0;i<list.length;i++) {
					if(list[i]!=null)
				System.err.println(list[i]);
				}

			}
			if (enter == 6) {
				for (int i = 0; i < list.length; i++) {
					for (int j = 0; j < list.length; j++) {
						if (list[i] != null && list[j] != null) {
							if (list[i].getName().compareTo(list[j].getName())<0) {
								Student temp = list[i];
								list[i]=list[j];
								list[j]=temp;
							}
						}
					}
				}
				for(int i=0;i<list.length;i++) {
					if(list[i]!=null)
				System.err.println(list[i]);
				}

			}
			if (enter == 7) {
				for (int i = 0; i < list.length; i++) {
					for (int j = 0; j < list.length; j++) {
						if (list[i] != null && list[j] != null) {
							if (list[i].getRoll() < list[j].getRoll()) {
								Student temp = list[i];
								list[i]=list[j];
								list[j]=temp;
							}
						}
					}
				}
				for(int i=0;i<list.length;i++) {
					if(list[i]!=null)
				System.err.println(list[i]);
				}

			}
			if (enter == 8) {
				for (Student st : list) {
					if (st != null) {
						System.err.println(st);
					}
				}

			}
			if (enter == 9) {
				break;

			}
		}

	}

}
