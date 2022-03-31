package mphasis1.basixs;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1mini {
	public static void main(String[] args) throws IOException {
		int choice;
		int operations;
		 Scanner s = new Scanner(System.in);
		while(true)
		{
		 System.out.println("enter 1 to view in asc order,enter 2 for operations,enter 3 for exit");//
		choice=s.nextInt();
		switch(choice)
		{
		case 1:
			 String path="S:\\main project\\";
				File f=new File(path);
				File filename[]=f.listFiles();
				for(File ff:filename) {
					System.out.println(ff.getName());
					}
				break;
		case 2:
		 Scanner s1 = new Scanner(System.in);
		 
		 boolean x=true;
		while(x){
			System.out.println("enter 11 to add file,enter 22  to delete,enter 33 to search,enter 44 to go to menu");
			operations=s1.nextInt();
			switch(operations)
		   {
		   case 11:
			   String path1="S:\\main project\\";
				Scanner s2=new Scanner(System.in);

				ArrayList<String> al=new ArrayList<>();
				while(true) {
				System.out.println("enter the file name to create");
				String filename1=s2.next();
				String finalname1=path1+filename1;
				System.out.println(finalname1);

				//create a file 

				File f1=new File(finalname1);
				boolean x1=f1.createNewFile();
				if(x!=true) {
					System.out.println("the file not created");
				}
				else {
					al.add(filename1);
					System.out.println("file created");
					break;
				}

				System.out.println("the collection of files is "+ al);
				}
		 			break;
		 		case 22:
		 			String path2="S:\\main project\\";
		 			Scanner s3=new Scanner(System.in);
		 			System.out.println("enter the file name to be deleted");
		 			String filname2=s3.next();
		 			String finalfile=path2+filname2;
		 			File file=new File(finalfile);
		 			file.delete();
		 			System.out.println("file deleted");
		 			break;
           case 33:
			   String path3="S:\\main project\\";
				File f2=new File(path3);
				Scanner s4=new Scanner(System.in);
				System.out.println("enter the file name to search");
				String filsearchname=s4.next();
				File filename3[]=f2.listFiles();
				int flag=0;
				for(File ff:filename3) {
					if(ff.getName().equals(filsearchname)) {
						flag=1;
						break;
					}
					else {
						flag=0;
					}
					}

				if(flag==1) {
					System.out.println("found the file");
				}
				else {
					System.out.println("file is not found");
				}
			break;
		   
			case 44:
			 x=false;//
				
		   }}break;
	      case 3:
			   System.exit(0);
			   break;
		}
		}
	}

	}


